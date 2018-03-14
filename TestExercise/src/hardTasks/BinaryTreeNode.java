package hardTasks;

// A binary tree node
class Node {

	int data;
	Node left, right;

	Node(int d) {
		data = d;
		left = right = null;
	}
}

class BinarySearchTree {

	// Root
	Node root;

	// Constructor
	BinarySearchTree() {
		root = null;
	}

	// function to insert new nodes
	public void insert(int data) {
		this.root = this.insertRec(this.root, data);
	}

	// спомагателна функция която ми помага да си напълня дървото
	Node insertRec(Node node, int data) {
		/* ако е празно дървото се слага нов ноуд */
		if (node == null) {
			this.root = new Node(data);
			return this.root;
		}

		/* ако не почваме да проверяваме всеки елемент надоло */
		if (data < node.data) {
			node.left = this.insertRec(node.left, data);
		} else {
			node.right = this.insertRec(node.right, data);
		}
		return node;
	}

	// спомагателен клас който държи променлива(брояч)

	// функция за намиране на втория най голям елемент
	public static int findSecondLargestValueInBST(Node root) {
		// променлива за втория макс елемнт
		int secondMax;
		// начален и следващ ноуд
		Node pre = root;
		Node cur = root;
		// докато десния елемент е различен от null pre ще приема стойноста на сегашния
		// cur,а cur ще взима стойноста си на елемента от дясно
		while (cur.right != null) {
			pre = cur;
			cur = cur.right;
		}
		// проверяваме за ляв елемент и дали има разклонения от дясно, ако има въртим до
		// най-десния(който се оказва втори най-голям)
		if (cur.left != null) {
			cur = cur.left;
			while (cur.right != null)
				cur = cur.right;
			secondMax = cur.data;
		} else {
			// когато имаме само 1 елемент
			if (cur == root && pre == root)
				// примерно
				secondMax = Integer.MIN_VALUE;
			else
				secondMax = pre.data;
		}
		return secondMax;
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		tree.insert(69);
		tree.insert(71);

		System.out.println(BinarySearchTree.findSecondLargestValueInBST(tree.root));
	}
}
