package hardTasks;

class Link {
	public int data1;
	public double data2;
	// трябва ни референция към следващия(или предишния, зависи кой как го разбира)
	public Link nextLink;

	// просто конструкторче, за мое улеснение си слагам числа
	public Link(int d1, double d2) {
		data1 = d1;
		data2 = d2;
	}

	// принтирам данните
	public void printLink() {
		System.out.print("{" + data1 + ", " + data2 + "} ");
	}
}

class LinkList {
	// слагам си последния елемент който е бил добавен
	private Link first;

	// първия линк е винаги null по дефоут
	public LinkList() {
		first = null;
	}
	// finding element by Value

	public Link find(int data) {
		// сетваме го в началото и проверяваме дали не е празен
		Link theLink = first;
		if (!isEmpty()) {
			// след това продължава да търси докато не намери стойноста подадена като параметър в някой от линковете 
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
		// както знаем новия линк пази референцията на предишния за това му го добавяме
		link.nextLink = first;
		// съответно First трябва да пази референцията или стойноста на последния
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
		// просто взимаме референцията на първия
		Link temp = first;
		if (first == null) {
			return null;
			// throw new NoSuchElementException(); // this is the better way.
		}
		// и му придаваме стойноста на този към който пази референцията си
		first = first.nextLink;
		return temp;
	}

	public Link deleteLast() {
		Link last = first;
		Link prevToLast = null;
		// сещам се само за този начин дето трябва да се обходи и стигне до последния елемент за
		// да се изтрие
		while (last != null) {
			prevToLast = last;
			last = last.nextLink;
		}
		prevToLast.nextLink = null;
		return last;
	}

	// принтираме листа като отново използваме това, че всеки пази референцията на
	// предишния влязал преди него
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