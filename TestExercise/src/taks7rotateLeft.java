
public class taks7rotateLeft {
public static void main(String[] args) {
	rotate_left(0x23456781, 4&0x1f);
	System.out.println(lro(0x23456781, 4&0x1F));
}
static void rotate_left(int x,int n) {
	System.out.println(Integer.rotateLeft(x, n));

}
public static int lro(int v, int k) {
	// очаква се десния да премества стойноста съхранявана в бита, с к бита наляво
    return (v << (k%32)) | (v >>> ((k%32)-32));
}
}
