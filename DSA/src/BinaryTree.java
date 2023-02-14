
public class BinaryTree {

    public static class Node{
        private int val;
        public Node(int val)
        {
            this.val = val;
        }
        private Node Left;
        private Node Right;
    }
    static int[] arr = {1,2,3,-1,-1,4,-1,-1,3,4,3,-1,-1,-1,-1};
    static int idx = -1;
    protected static Node CreateTree()
    {
        idx++;
        // the main objective of the function is returning a node
        Node Root = null;
        int data = arr[idx];
        if(data == -1)
        {
            return null;
        }
        Root = new Node(data);
        Root.Left = CreateTree();
        Root.Right = CreateTree();
        return Root;
    }

    protected static void printTreeInOrder(Node root)
    {
        if(root == null) return;
        printTreeInOrder(root.Left);
        System.out.print(root.val);
        printTreeInOrder(root.Right);
    }

    protected static void printTreePreOrder(Node root)
    {
        if(root == null) return;
        System.out.print(root.val);
        printTreeInOrder(root.Left);

        printTreeInOrder(root.Right);
    }
    protected static void printTreePostOrder(Node root)
    {
        if(root == null) return;

        printTreeInOrder(root.Left);
        printTreeInOrder(root.Right);
        System.out.print(root.val);

    }
    protected static int  heightOfBinaryTree(Node Root)
    {
        if(Root == null) return 0;
        int lh = heightOfBinaryTree(Root.Left);
        int rh = heightOfBinaryTree(Root.Left);
        return 1+ Math.max(lh,rh);

    }


    public static void main(String[] args)
    {
        BinaryTree Tree = new BinaryTree();
        Node root = Tree.CreateTree();
//        System.out.println(root.val);
        printTreeInOrder(root);
        System.out.println("--------------------------------- In order -------------------------");
        printTreePreOrder(root);
        System.out.println("--------------------------------- Pre order -------------------------");

        printTreePostOrder(root);
        System.out.println("--------------------------------- Post order -------------------------");

        System.out.println("---------------------------------Height of the binary tree");
        System.out.println(heightOfBinaryTree(root));
    }

}
