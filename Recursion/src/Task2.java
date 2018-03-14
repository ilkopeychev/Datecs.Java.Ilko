import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
 
public class Task2 {
    //  using ArrayList collection for output
    public static ArrayList<String> finaloutput=new ArrayList<String>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        // case 1 passed 61 1F 4F 08 A0 00 00 00 25 01 05 01 50 10 50 65 72 73 6F 6E 61 6C 20 41 63 63 6F 75 6E 74 87 01 01;
        // case 2 paseed 61 1E 4F 07 A0 00 00 00 29 10 10 50 10 50 65 72 73 6F 6E 61 6C 20 41 63 63 6F 75 6E 74 87 01 02
        // case 3 passed 77 22 82 02 78 00 94 1C 10 01 04 00 10 05 05 00 08 06 06 01 08 07 07 01 08 08 09 01 08 0A 0A 00 08 01 04 00
        // case 4 - 77 1E 9F 27 01 80 9F 36 02 02 13 9F 26 08 2D F3 83 3C 61 85 5B EA 9F 10 07 06 84 23 00 31 02 08
        String input = sc.nextLine();
        // removing all blank spaces in our input
        input = input.replaceAll("\\s", "");
        // i am doing the basic case here in main
        String tag = input.substring(0, 2);
        int length = hexToDec(input.substring(2, 4));
        finaloutput.add(tag);
        finaloutput.add(input.substring(2, 4));
//        System.out.println(tag + "(" + length + ")");
//        System.out.println(input.substring(4, input.length()));
        recursionTVB(input.substring(4, input.length()));
        // printing the collection
    for (int i = 0; i < finaloutput.size()-2; i+=2) {
       
        if (i>=2) {
            System.out.println(finaloutput.get(i)+" ("+finaloutput.get(i+1).length()/2+")   "+finaloutput.get(i+1)+"   ");
        } else {
            System.out.println(finaloutput.get(i)+"   (" + finaloutput.get(i+1)+")");
        }
 
       
    }
System.out.println(finaloutput.get(finaloutput.size()-2)+"  ("+(finaloutput.get(finaloutput.size()-1).length()/2)+")  "+finaloutput.get(finaloutput.size()-1));
    }
// solution taken from the Integer lib
    public static int hexToDec(String hex) {
        return Integer.parseInt(hex, 16);
    }
// void recursion for Input
    public static void recursionTVB(String input) {
        if (input.length() == 1 || input.length() == 0) {
            return;
        }
        // recursive funcion to determinate tag and value
        String tagNew = input.substring(0, 2);
        int newLength = hexToDec(input.substring(2, 4));
        finaloutput.add(tagNew);
        finaloutput.add(input.substring(4, newLength * 2 + 4));
//        System.out.println(tagNew + "(" + newLength + ")");
//        System.out.println(input.substring(4, newLength * 2 + 4));
        if ((Integer.parseInt(tagNew, 16) & 0x1F) == 0x1F) {
			tagNew=input.substring(0,4);
			newLength=hexToDec(input.substring(4, 6));
		}
        System.out.println(tagNew);
        System.out.println(newLength);
        recursionTVB(input.substring(newLength * 2 + 4, input.length()));
    }
}