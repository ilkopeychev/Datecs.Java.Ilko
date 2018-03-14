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

	// ������������ ������� ����� �� ������ �� �� ������� �������
	Node insertRec(Node node, int data) {
		/* ��� � ������ ������� �� ����� ��� ���� */
		if (node == null) {
			this.root = new Node(data);
			return this.root;
		}

		/* ��� �� ������� �� ����������� ����� ������� ������ */
		if (data < node.data) {
			node.left = this.insertRec(node.left, data);
		} else {
			node.right = this.insertRec(node.right, data);
		}
		return node;
	}

	// ������������ ���� ����� ����� ����������(�����)

	// ������� �� �������� �� ������ ��� ����� �������
	public static int findSecondLargestValueInBST(Node root) {
		// ���������� �� ������ ���� ������
		int secondMax;
		// ������� � ������� ����
		Node pre = root;
		Node cur = root;
		// ������ ������ ������� � �������� �� null pre �� ������ ��������� �� ��������
		// cur,� cur �� ����� ��������� �� �� �������� �� �����
		while (cur.right != null) {
			pre = cur;
			cur = cur.right;
		}
		// ����������� �� ��� ������� � ���� ��� ����������� �� �����, ��� ��� ������ ��
		// ���-������(����� �� ������ ����� ���-�����)
		if (cur.left != null) {
			cur = cur.left;
			while (cur.right != null)
				cur = cur.right;
			secondMax = cur.data;
		} else {
			// ������ ����� ���� 1 �������
			if (cur == root && pre == root)
				// ��������
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
