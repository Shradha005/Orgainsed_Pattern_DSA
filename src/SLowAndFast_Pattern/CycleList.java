package SLowAndFast_Pattern;

public class CycleList
{
    public static void main(String[] args)
    {
       CycleList List = new CycleList();
       List.insertAtfirst(10) ;
       List.insertAtlast(20);
        List.insertAtlast(30);
        List.insertAtlast(40);
        List.insertAtlast(50);
        List.MakeACycle(3);
        List.display();
        System.out.print( List.checkcycle());

    }
  public Node head ;
  public Node tail ;
  public int size ;

   static class Node {
       int data;
       Node next;

       Node(int data)
       {
           this.data = data;
       }

       Node(int data, Node next) {
           this.data = data;
           this.next = next;
       }
   }
   public void insertAtfirst(int data )
   {
       Node newnode = new Node(data);
       newnode.next = head ;
       head = newnode ;
       if(tail == null)
       {
           tail= head ;
       }
       size++;
   }
   public void insertAtlast(int data )
   {
       if(head== null) {
           insertAtfirst(data);
           return ;
       }
       Node newnode = new Node(data) ;
       tail.next = newnode ;
       tail = newnode ;
       size++;
   }

   public void display()
   {
       Node temp = head ;
       for(int i =0; i<10; i++)
       {
           System.out.print(temp.data + " ->") ;
           temp = temp.next;
       }
       System.out.print("...") ;

   }
   public void MakeACycle(int position)
   {
       if(head == null)
       {
           return ;
       }
       Node target = head;
       for (int i= 0 ; i< position ; i++)
       {
           target= target.next ;
       }
       tail.next = target ;
   }
   public boolean checkcycle()
   {
       Node slow = head ;
       Node fast = head ;
       while(fast!=null && fast.next!=null)
       {
           slow= slow.next ;
           fast = fast.next .next ;
           if(slow== fast )
           {
               return true ;
           }
       }
       return false ;

   }
}

