package SLowAndFast_Pattern;

public class CycleList
{
    public static void main(String[] args)
    {
        Node fourth = new Node(70);
        Node third = new Node(100,fourth);
        Node second = new Node(20,third);
        Node first = new Node(20,second);
        Node head= new Node(80,first);

        fourth.next = second ;
        Node temp = head ;
        for(int i = 0 ; i<10; i++) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("END");



    }
  public Node head ;
  public Node tail ;
  public int size ;

   static class Node {
       int data;
       Node next;

       Node(int data) {
           this.data = data;
       }

       Node(int data, Node next) {
           this.data = data;
           this.next = next;
       }
   }
   public void display()
   {
       Node temp = head ;
       while(temp!=null)
       {
           System.out.print(temp.data + " ->") ;
           temp = temp.next;
       }
       System.out.print("END") ;

   }
}
