public class DoublyLinkedList {

    public static void main(String[] args)
    {
        DoublyLinkedList DLL = new DoublyLinkedList();
        DLL.insertFirst(3);
        DLL.insertFirst(5);
        DLL.insertFirst(9);
        DLL.insertLast(12);
        DLL.insertLast(15);
        DLL.Insert(1,3);
        DLL.Insert(99,1);
        DLL.printDLL();
        DLL.Delete(2);
//        DLL.DeleteFirst();
//        DLL.DeleteFirst();

//        DLL.DeleteLast();
        DLL.printDLL();
        DLL.printDLLReverse();
    }
    private int size;
    public DoublyLinkedList(){
        this.size =0;

    }
    public class Node
    {
        public int val;
        public Node Next = null;
        public Node Prev = null;

        public Node(int val)
        {
            this.val  = val;
        }
    }
    private Node head;
    private Node tail;

    public void insertFirst(int val)
    {
        Node newNode = new Node(val);
        Node temp = head;

        if(temp == null){
            head = newNode;
            size++;
            return;
        }
        temp.Prev = newNode;
        newNode.Next = temp;
//        System.out.println(temp.Prev.val);
        head = newNode;
        size++;

    }
    public void DeleteFirst(){
        if(head == null){
            return;
        }
        head = head.Next;
        head.Prev = null;
        size --;
    }
    public void Delete(int index)
    {
        Node Temp1 = Get(index);
//        System.out.println(Temp1.Prev.Next.val);
        Temp1.Prev.Next = Temp1.Next;
        Temp1.Next.Prev = Temp1.Prev;
//        Temp1.Next = Temp1.Prev;
        size--;
    }
    public void DeleteLast()
    {
        Node temp = head;
        while(temp.Next != null){
            temp = temp.Next;
        }
        temp.Prev.Next = null;
        size--;

    }
    public void insertLast (int val)
    {
        Node newNode = new Node(val);
        Node temp = head;

        while(temp.Next != null){
            temp = temp.Next;
        }
        tail = temp;
        temp.Next = newNode;
        newNode.Prev = temp;
        size++;
    }
    public void printDLL(){
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.val + " => ");
            temp = temp.Next;
        }
        System.out.print("End\n");
        System.out.println("The size of the array = "+this.size);
    }

    public void Insert(int val,int index)
    {
        Node Temp1 = Get(index);
        Node newNode = new Node(val);
        newNode.Next = Temp1.Next;
        Temp1.Next = newNode;
        newNode.Prev = Temp1;
        newNode.Next.Prev = newNode;
        size++;

    }

    public Node Get(int index)
    {
        Node temp = head;
        // implementing linear search
        for (int i = 1; i < index; i++){
//            System.out.println(temp.val);
            temp = temp.Next;
        }
        return temp;
    }

    public void printDLLReverse(){
//        Node temp = head;

        Node temp = Get(this.size);
//        temp = tail;
//        System.out.println(tail.val);
        while(temp != null){

            System.out.print(temp.val + " <= ");
            temp = temp.Prev;
        }
        System.out.print("Start");
    }
}
