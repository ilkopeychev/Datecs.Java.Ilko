import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
// case 1 passed 61 1F 4F 08 A0 00 00 00 25 01 05 01 50 10 50 65 72 73 6F 6E 61 6C 20 41 63 63 6F 75 6E 74 87 01 01;
// case 2 paseed 61 1E 4F 07 A0 00 00 00 29 10 10 50 10 50 65 72 73 6F 6E 61 6C 20 41 63 63 6F 75 6E 74 87 01 02
// case 3 passed 77 22 82 02 78 00 94 1C 10 01 04 00 10 05 05 00 08 06 06 01 08 07 07 01 08 08 09 01 08 0A 0A 00 08 01 04 00
// case 4 - 77 1E 9F 27 01 80 9F 36 02 02 13 9F 26 08 2D F3 83 3C 61 85 5B EA 9F 10 07 06 84 23 00 31 02 08
public class Task3 {
public static HashMap<String, String> finalOutput;
    public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        input = input.replaceAll("\\s", "");
       
        HashMap<String, String> outputMap = parseTLV(input);
 
        for (String name : outputMap.keySet()) {
        String key=name.toString();
        String value=outputMap.get(name).toString();
        System.out.println(key+" "+ value);
        }
       
 
 
    }
 
    public static HashMap<String, String> parseTLV(String tlv) {
        if (tlv == null || tlv.length() % 2 != 0) {
            throw new RuntimeException("Invalid tlv, null or odd length");
        }
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (int i = 0; i < tlv.length();) {
            try {
                String key = tlv.substring(i, i = i + 2);
 
                if ((Integer.parseInt(key, 16) & 0x1F) == 0x1F) {
                    // extra byte for TAG field
                    key += tlv.substring(i, i = i + 2);
                }
                String len = tlv.substring(i, i = i + 2);
                int length = Integer.parseInt(len, 16);
 
                if (length > 127) {
                    // more than 1 byte for lenth
                    int bytesLength = length - 128;
                    len = tlv.substring(i, i = i + (bytesLength * 2));
                    length = Integer.parseInt(len, 16);
                }
                length *= 2;
 
                String value = tlv.substring(i, i = i + length);
                // System.out.println(key+" = "+value);
                hashMap.put(key, value);
            } catch (NumberFormatException e) {
                throw new RuntimeException("Error parsing number", e);
            } catch (IndexOutOfBoundsException e) {
                throw new RuntimeException("Error processing field", e);
            }
        }
 
        return hashMap;
    }
 
}