
public class Task6LeastSignificantByte {
	// cheking the right byte(check 8 bits from right to left)
	static int lsb_one(int x) {
		if ((x & 0xff) != 0)
			return 1;
		else
			return 0;
	}

	static int msb_zero(int x) {
	   if((x & 0xff000000) != 0xff000000)
		   return 1;
		   else return 0;
	}
	public static void main(String[] args) {
		System.out.println(lsb_one(0));
	}
}
