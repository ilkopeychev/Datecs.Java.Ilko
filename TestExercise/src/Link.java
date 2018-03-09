
public class Link {
	String objectName;
	int objectPrice;
	Link next;

	public Link(String objectName, int objectPrice) {
		super();
		this.objectName = objectName;
		this.objectPrice = objectPrice;
	}

	public void display() {
		System.out.println(objectName + ": " + objectPrice + " $");
	}

	public String toString() {
		return objectName;
	}

	class LinkList {
		public Link firstLink;

		LinkList() {
			firstLink = null;
		}

		public boolean isEmpty() {
			return (firstLink == null);
		}
public void insertFirstLink(String objectname, int price) {
	
}
	}
}
