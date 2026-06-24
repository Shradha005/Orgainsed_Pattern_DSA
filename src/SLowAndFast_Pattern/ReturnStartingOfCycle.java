package SLowAndFast_Pattern;
import java.util.*;

public class ReturnStartingOfCycle
{
    public  void main(String[] args)
    {
        ReturnStartingOfCycle Listnode = new ReturnStartingOfCycle() ;
        Listnode.insertAtlast(10);
        Listnode.insertAtlast(20);
        Listnode.insertAtlast(50);
        Listnode.insertAtlast(90);
        Listnode.Cycle(2);
//        Listnode.display() ;
        Node start = Listnode.CheckCycle();

        if(start != null)
        {
            System.out.println("Here is the starting point of the cycle  : " + start.data);
        }
        else
        {
            System.out.println("No cycle");
        }
//        Listnode.display() ;
    }
    public Node head ;
    public Node tail ;
    public int size ;
    static class Node
    {
        int data ;
        Node next ;
        Node(int data)
        {
            this.data = data ;
        }
        Node(int data , Node next)
        {
            this.data = data ;
            this.next = next ;
        }
    }
    public  Node CheckCycle()
    {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
            {
                slow = head;
                while (slow != fast)
                {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow ;
            }
        }
        return null;
    }
    public void insertAtfirst(int data )
    {
        Node node = new Node ( data) ;
        node.next = head ;
        head = node ;
        if(tail==null)
        {
            tail  = head ;
        }
        size ++ ;
    }
    public void insertAtlast(int data)
    {
        Node newnode = new Node(data) ;
        if(head==null)
        {
           insertAtfirst(data);
           return ;
        }
        tail.next = newnode ;
        tail = newnode ;
        size ++ ;
    }
    public void display()
    {
        Node temp = head ;
        for(int i = 0; i<15 && temp!=null;i++)
        {
            System.out.print(temp.data + "->") ;
            temp = temp.next ;
        }
        System.out.print("....") ;
    }
    public void Cycle(int position)
    {
        if(head == null)
        {
            return ;
        }
        Node temp = head ;
        for(int i= 0 ; i<position; i++)
        {
            temp = temp.next ;
        }
        tail.next = temp;
    }

    }
