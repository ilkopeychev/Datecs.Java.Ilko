
public class Box {
	private double visochina;
	private double shirochina;
	private double dyljina;
	private boolean isFull;

	public Box(double visochina, double shirochina, double dyljina) {
		super();
		this.visochina = visochina;
		this.shirochina = shirochina;
		this.dyljina = dyljina;
		this.isFull=false;
	}

	@Override
	public String toString() {
		return "task6BoxClass [visochina=" + visochina + ", shirochina=" + shirochina + ", dyljina=" + dyljina
				+ ", isFull=" + isFull + "]";
	}

	public double getVisochina() {
		return visochina;
	}

	public void setVisochina(double visochina) {
		this.visochina = visochina;
	}

	public double getShirochina() {
		return shirochina;
	}

	public void setShirochina(double shirochina) {
		this.shirochina = shirochina;
	}

	public double getDyljina() {
		return dyljina;
	}

	public void setDyljina(double dyljina) {
		this.dyljina = dyljina;
	}

	public boolean isFull() {
		return isFull;
	}

	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}

}
