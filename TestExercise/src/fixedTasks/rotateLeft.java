package fixedTasks;

public class rotateLeft {
	public static int rro(int v, int k) {
	    return (v >>> (k%64)) | (v << ((k%64)-64));
	}

	/**
	 * Rotate v left with k steps
	 */
	public static int lro(int v, int k) {
	    return (v << (k%64)) | (v >>> ((k%64)-64));
	    
	}
	public static void main(String[] args) {
		System.out.println(lro(0x23456781, 4));
		System.out.println(rro(0x23456781, 4));
		System.out.println(Integer.rotateLeft(0x23456781, 4));
		System.out.println(Integer.rotateRight(0x23456781, 4));
	}
	
}
