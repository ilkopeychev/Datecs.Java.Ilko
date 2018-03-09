
public class BoxTest {
public static void main(String[] args) {
	Box box= new Box(13,15,16);
	box.setDyljina(20);
	box.setShirochina(30);
	box.setDyljina(40);
	box.setFull(true);
	System.out.println(box.toString());
}
}
