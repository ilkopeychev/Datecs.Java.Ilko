package hardTasks;

class Link {
	public int data1;
	public double data2;
	// ������ �� ���������� ��� ���������(��� ���������, ������ ��� ��� �� �������)
	public Link nextLink;

	// ������ �������������, �� ��� ��������� �� ������ �����
	public Link(int d1, double d2) {
		data1 = d1;
		data2 = d2;
	}

	// ��������� �������
	public void printLink() {
		System.out.print("{" + data1 + ", " + data2 + "} ");
	}
}

class LinkList {
	// ������ �� ��������� ������� ����� � ��� �������
	private Link first;

	// ������ ���� � ������ null �� ������
	public LinkList() {
		first = null;
	}
	// finding element by Value

	public Link find(int data) {
		// ������� �� � �������� � ����������� ���� �� � ������
		Link theLink = first;
		if (!isEmpty()) {
			// ���� ���� ���������� �� ����� ������ �� ������ ��������� �������� ���� ��������� � ����� �� ��������� 
			while (theLink.data1 != data) {
				if (theLink.nextLink == null) {
					return null;
				} else {
					theLink = theLink.nextLink;
				}
			}
		} else {
			System.out.println(" Empty link LIST!");
		}
		return theLink;
	}

	// Returns true if list is empty
	public boolean isEmpty() {
		return first == null;
	}

	// Inserts a new Link at the first of the list
	public void insert(int d1, double d2) {
		Link link = new Link(d1, d2);
		// ����� ����� ����� ���� ���� ������������ �� ��������� �� ���� �� �� ��������
		link.nextLink = first;
		// ��������� First ������ �� ���� ������������ ��� ��������� �� ���������
		first = link;
	}

	// inserts a new Link at the last EL of the list
	public void insertAtEnd(int d1, double d2) {
		Link newlink = new Link(d1, d2);
		Link current = first;
		while (null != current.nextLink) {
			current = current.nextLink;
		}
		current.nextLink = newlink;
	}

	// Deletes the link at the first of the list
	public Link deleteFirst() {
		// ������ ������� ������������ �� ������
		Link temp = first;
		if (first == null) {
			return null;
			// throw new NoSuchElementException(); // this is the better way.
		}
		// � �� ��������� ��������� �� ���� ��� ����� ���� ������������ ��
		first = first.nextLink;
		return temp;
	}

	public Link deleteLast() {
		Link last = first;
		Link prevToLast = null;
		// ����� �� ���� �� ���� ����� ���� ������ �� �� ������ � ������ �� ��������� ������� ��
		// �� �� ������
		while (last != null) {
			prevToLast = last;
			last = last.nextLink;
		}
		prevToLast.nextLink = null;
		return last;
	}

	// ���������� ����� ���� ������ ���������� ����, �� ����� ���� ������������ ��
	// ��������� ������ ����� ����
	public void printList() {
		
		Link currentLink = first;
		System.out.print("List: ");
		while (currentLink != null) {
			currentLink.printLink();
			currentLink = currentLink.nextLink;
		}
		System.out.println("");
	}
}

class LinkListTest {
	public static void main(String[] args) {
		LinkList list = new LinkList();

		list.insert(1, 1.01);
		list.insert(2, 2.02);
		list.insert(3, 3.03);
		list.insert(4, 4.04);
		list.insert(5, 5.05);
		list.find(5);
		list.deleteLast();
		list.insertAtEnd(5, 11.5);
		list.printList();
		Link deletedLink = list.deleteLast();
		while (!list.isEmpty()) {
		
			System.out.print("deleted: ");
			deletedLink.printLink();
			System.out.println("");
		}
		list.printList();
	}
}