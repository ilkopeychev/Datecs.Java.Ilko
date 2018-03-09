
public class BitwizeTask6Arecursion {

		
	    public static int checkBitFor1(int n) {
	         
	        // base case
	        if (n == 0)
	            return 0;
	     
	        else
	     
	            // if last bit set add 1 else add 0
	            return (n & 1) +checkBitFor1(n >> 1);
	    }
	     
	    // Driver code
	 
	public static void main(String[] args) {
		for (int i = 0; i < 16; i++) {
			System.out.println(checkBitFor1(i));
		}
	}
}
