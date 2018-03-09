
public class task4Cylinder {
	public static void main(String[] args) {
		
		double h=Math.random()*10+1;
		double r=Math.random()*10+1;
		double volume=Math.PI*r*r*h;
		double area=2*Math.PI*r*h;
		System.out.println(h+ "<-- h   r --->  "+ r);
		System.out.println(area);
		System.out.println(volume);
	}

}
