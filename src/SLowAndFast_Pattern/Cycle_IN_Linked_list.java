package SLowAndFast_Pattern;

public class Cycle_IN_Linked_list {
    public static void main(String[] args) {
        Cycle_IN_Linked_list list = new Cycle_IN_Linked_list();
        list.insertAtfirst(10);
        list.insertAtfirst(20);
        list.insertAtfirst(15);
        list.insertAtlast(67);
        list.display();
        System.out.print(list.Cycle()) ;
//        list.display() ;

    }

    public Node head;
    public Node tail;
    public int size;

    public class Node {
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

    public void insertAtlast(int data) {
        Node newnode = new Node(data);
        tail.next = newnode;
        tail = newnode;
        size++;
    }

    public void insertAtfirst(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("end");

    }

    public boolean Cycle()
    {
        Node slow = head;
        Node fast = head;
        while(fast !=null && fast.next !=null)
        {
         slow = slow.next;
         fast = fast.next.next;

         if (slow == fast) {
             return true ;
         }
        }
     return false ;
    }
}

