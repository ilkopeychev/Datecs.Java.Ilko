package hardTasks;


 
// A binary tree node
class Node {
 
    int data;
    Node left, right;
 
    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
 
class BinarySearchTree {
 
    // Root 
    Node root;
 
    // Constructor
    BinarySearchTree()
    {
        root = null;
    }
 
    // function to insert new nodes
    public void insert(int data)
    {
        this.root = this.insertRec(this.root, data);
    }
     
    /* A utility function to insert a new node with given 
    key */
    Node insertRec(Node node, int data)
    {
        /* If the tree is empty, return a new node */
        if (node == null) {
            this.root = new Node(data);
            return this.root;
        }
 
        /* Otherwise, recur down the tree */
        if (data < node.data) {
            node.left = this.insertRec(node.left, data);
        } else {
            node.right = this.insertRec(node.right, data);
        }
        return node;
    }
 
    // class that stores the value of count
    public class count {
        int c = 0;
    }
 
    // Function to find 2nd largest element
    void secondLargestUtil(Node node, count C)
    {   
        // ���� �� ���������� 
        if (node == null || C.c >= 2)
            return;
             
   /*
    * ������� �� ��������� ���� �� ������ ������� � �����
    */
        this.secondLargestUtil(node.right, C); 
         
         // ����������� ���� �� ���������� node
        C.c++;
         
        // ��� 'c' ����� 2 ���� � ������ �������
        if (C.c == 2) {
            System.out.print("2nd largest element is "+
                                              node.data);
            return;
        }
         
//         // �� ���� ����
//        this.secondLargestUtil(node.left, C); 
    }
 
    // ������ ������� 
    void secondLargest(Node node)
    {   
        // ����� �� ����� �� ���� count
        count C = new count(); 
        this.secondLargestUtil(this.root, C);
    }
 
    // ��������
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
 
        tree.secondLargest(tree.root);
    }
}
