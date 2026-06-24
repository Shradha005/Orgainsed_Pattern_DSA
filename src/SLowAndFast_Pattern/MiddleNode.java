package SLowAndFast_Pattern;

public class MiddleNode {
    public static void main(String[] args)
    {
        MiddleNode node = new MiddleNode();
        node.inserAtfirst(60);
        node.inserAtfirst(50);
        node.inserAtfirst(40);
        node.inserAtfirst(30);
        node.inserAtfirst(20);
        node.inserAtfirst(10);
        Node start =node.nodeAtMiddle() ;
        System.out.println("the middle value is :" + start.data) ;
        node.display();

    }
    public Node head ;
    public Node tail ;
    public int size ;

    public static class Node
    {
        int data;
        Node next ;

        Node(int data )
        {
            this.data = data ;
        }

        Node(int data , Node next)
        {
            this.data = data ;
            this.next = next ;
        }
    }
    public void inserAtfirst(int data)
    {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
        if(tail==null)
        {
            tail= head ;
        }
    }
    public void display()
    {
        if(head == null) {
            return;
        }
        Node temp = head ;
        while(temp!=null)
        {
            System.out.print(temp.data + "->") ;
            temp = temp.next ;
        }
        System.out.print("END") ;
    }
    public Node nodeAtMiddle()
    {
        Node slow = head ;
        Node fast = head ;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next ;
            fast= fast.next.next ;

        }
        return slow ;
    }
}
