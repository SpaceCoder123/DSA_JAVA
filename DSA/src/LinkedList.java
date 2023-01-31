public class LinkedList {
    private int size;
    private Node Head;
    private Node Tail;

    public LinkedList(){
        this.size = 0; // everytime the constructor is called the value is initialized to zero
    }

    public void insertFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = Head; // connecting to the head node which was at the start
        Head = newNode; // since from basic convention head should point at the start of the linked list therefore Head should point at the newly created node
        if(Tail ==  null){
            Tail = Head;
        }
        size+=1;
    }

    public void displayLL(){
        Node Temp = Head;
        while(Temp!= null){
            System.out.print(Temp.value + " =>");
            Temp = Temp.next;
        }
        System.out.print("End");

    }
    public Node get(int index)
    {
        Node node = Head;
        for (int i = 0; i<index;i++){
            node = node.next;
        }
        return node;
    }
    public void deleteFirst(){
        Head = Head.next;
        if(Head == null){
            Tail = null;
        }
        size--;
    }
    public void deleteLast(){
        if(size <= 1){
            deleteFirst();
        }
        Node Temp = Head;
        for (int i = 1; i< size-2; i++){
            Temp = Temp.next;
        }
        Tail = Temp.next;
        Tail.next = null;
        size--;
    }
    public void Delete(int index)
    {
        if(index == 0)
        {
            deleteFirst();
            return;
        }
        if(index == size){
            deleteLast();
            return;
        }
        Node prev = get(index-1);
        prev.next= prev.next.next;
    }

    public Node Search(int value)
    {
        Node node = Head;
        while(node != null)
        {
            if(node.value == value)
            {
                return node;
            }
            node= node.next;
        }
        return null;

    }

    public void InsertLast (int value){
        if(Tail == null){
            insertFirst(value);
            return;
        }

        Node NewNode = new Node(value);
        Tail.next = NewNode;
        Tail = NewNode;
        size++;
    }
    public void InsertAtIndex (int value,int index)
    {
        if(index == 0 ){
            insertFirst(value);
            return;
        }
        if(index == size){
            InsertLast(value);
            return;
        }


        Node temp = Head;
        for (int i = 1; i<index;i++){
            temp = temp.next;
        }

        Node newNode = new Node(value,temp.next);
        temp.next = newNode;
        size++;

    }
    private class Node{
        private int value;
        private Node next;
        public Node(int val){
            this.value = val;
        }
        public Node(int val, Node next){
            this.value = val;
            this.next = next;
        }

    }

}
