
public class BitwizeTask6A {

	static int checkBitFor1(int n) {
		{
			{
				// making a counter just in case if i have to count all the 1
				int count = 0;
				while (n > 0) {
					if((count += n & 1)==1) {
						return 1;
					} else {
						count += n & 1;
						n >>= 1;
					}
				
				}
				return 0;
			}
		}
	}

	public static void main(String[] args) {
		// sample TEST
		for (int i = 0; i <16; i++) {
			System.out.println(checkBitFor1(i));	
		}

		
	}
}
