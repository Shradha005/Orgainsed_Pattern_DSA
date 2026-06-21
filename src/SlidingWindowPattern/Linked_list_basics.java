package SlidingWindowPattern;

public class Linked_list_basics
{
    private Node head ;
    private Node tail ;
    public  int  size ;
    public class  Node
    {
        int data ;
        Node next ;
        Node(int data )
        {
            this . data = data ;

        }
        Node(int data ,Node next)
        {
            this.data = data ;
            this.next = next ;

        }
    }
    public void insertAtfirst(int data)
    {
        Node newnode = new Node(data) ;
        newnode.next = head ;
        head = newnode ;
        if(tail==null) {
            tail = head;
        }
        size ++ ;
    }
    public Linked_list_basics()
    {
        this.size = 0 ;
    }
    public void insertAtlast(int data)
    {
        Node newnode = new Node(data);
        tail.next = newnode;
        tail= newnode ;
        size ++ ;
    }
    public void insertAtindx(int data , int index)
    {
        if(index==0)
        {
            insertAtfirst(data);
        }
        if(index == size)
        {
            insertAtlast(data);
        }
        Node temp = head ;
        for(int i =0; i < index ; i++)
        {
            temp = temp.next ;
        }
//        okay from here we join temp.next with node.next as we defined in class Node

        Node node = new Node ( data , temp.next) ;

//        so from this statement I connect temp.next to new node
         temp.next = node ;
         size ++ ;
    }
    public void  display()
    {
        Node temp = head ;
        while(temp!=null)

        {
            System.out.print(temp.data + "->") ;
            temp = temp.next ;

        }
        System.out.println("end") ;
    }
    public int deleteAtfirst()
    {
        int val = head.data;
        head= head.next ;
        if(head== null)
        {
            tail=null;
        }
        size -- ;
        return val ;
    }
    public void  deleteAtlast()
    {
        if(head == null)
            return ;
        if(head.next== null) {
            head = null;
            size--;
            return;
        }
        Node temp = head ;
        while(temp.next.next!=null)
        {
            temp= temp.next ;
        }
        temp.next = null ;
        size -- ;

    }
    public int deleteAtindex(int index) {
        if (index == 0) {
            return deleteAtfirst();
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next .next  ;
        int val = temp.data ;
        size -- ;
        return val ;
    }

    public static void main(String[] args)
    {
        Linked_list_basics list = new Linked_list_basics()  ;
        list.insertAtfirst(8) ;
        list.insertAtfirst(10) ;
        list.insertAtindx(99,2) ;
        list.insertAtlast(100) ;
        list.display() ;
        System.out.println(list.deleteAtfirst() );
        list.display() ;
//        list.deleteAtlast() ;
        list.display() ;
        System.out.println(list.deleteAtindex(1)) ;
        list.display() ;




    }
}
