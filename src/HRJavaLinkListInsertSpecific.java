import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HRJavaLinkListInsertSpecific{

public static void main(String []argh)
    {

        HRJavaLinkListInsertSpecific ll = new HRJavaLinkListInsertSpecific();
        Node head = ll.InsertNth(null, 2,0);
        head = ll.InsertNth(head, 2,1); 
        head = ll.InsertNth(head, 3,2);   
        head = ll.InsertNth(head, 3,3);                                   
        head = ll.InsertNth(head, 7,4);
        head = ll.InsertNth(head, 8,5);
        head = ll.InsertNth(head, 10,6);
        
        ll.Print(head);

        
        System.out.println("------------");

        head = ll.RemoveDuplicates(head);
        ll.Print(head);
        
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    int HasCycle(Node head)
    {
      ArrayList a = new ArrayList();
      Node pointer = head;
      while(pointer != null)
      {
        if(a.contains(pointer))
          return 1;
        a.add(pointer);
        pointer = pointer.next;
      }
      return 0;
    }
    Node RemoveDuplicates(Node head) {
      
      Node pointer = head;
      
      while(pointer != null)
      {
        while(pointer.next != null)
        {
          if(pointer.data == pointer.next.data)
            pointer.next = pointer.next.next;
          else
            pointer = pointer.next;
        }
        pointer = pointer.next;
      }
      
      return head;

    }

    int GetNode(Node head,int n) {
      return findNthNode(head, length(head)-n-1).data;

    }
    
    int length(Node head)
   {
     if (head.next == null)
       return 1;
     else
       return 1 + length(head.next);
   }
    
   Node findNthNode(Node head, int position)
    {
      
      
      int ctr = 0;
      Node pointer = head;
      while(pointer.next != null && ctr < position)
      {
        pointer = pointer.next;
        ctr++;
      }
      return pointer;
    }
    
    Node MergeLists(Node headA, Node headB) {
      
      Node pointerA = headA;
      Node pointerB = headB;
      
      Node retHead = null;
      
      while(pointerA != null && pointerB != null)
      {
        if (pointerA.data < pointerB.data)
        {
          retHead = Insert(retHead, pointerA.data);
          pointerA = pointerA.next;
        }
        else
        {
          retHead = Insert(retHead, pointerB.data);
          pointerB = pointerB.next;
        }
      }
      if (pointerA == null)
      {
        while(pointerB != null)
        {
          retHead = Insert(retHead, pointerB.data);
          pointerB = pointerB.next;
        }
      }
      else if (pointerB == null)
      {
        while(pointerA != null)
        {
          retHead = Insert(retHead, pointerA.data);
          pointerA = pointerA.next;
        }
      }
      
      return retHead;
  
    }

    Node Insert(Node head,int data) {
      Node newNode = new Node();
      newNode.data = data;

      if (head == null)
        return newNode;
      
      Node lastNode = findLastNode(head);
      lastNode.next = newNode;
      
      return head;
      
    }

    int CompareLists(Node headA, Node headB) {
      Node pointerA = headA;
      Node pointerB = headB;
      if(pointerA == null || pointerB == null)
        return 0;
      
      while(pointerA != null && pointerB != null )
      {
        if(pointerA.data != pointerB.data)
          return 0;
        pointerA = pointerA.next;
        pointerB = pointerB.next;
      }
      if (pointerA == null && pointerB == null)
        return 1;
      else
        return 0;
        
  
    }
   Node Reverse(Node head) {
     Stack s = new Stack();
     Node pointer = head;
     while(pointer != null)
     {
       s.push(pointer);
       pointer = pointer.next;
     }
     Node retHead = (Node) s.peek();
     
     while(!s.empty())
     {
       Node curNode = (Node) s.pop();
       if (!s.empty())
       {
          Node prevNode = (Node) s.peek();
          curNode.next = prevNode;
       }
       else
         curNode.next = null;
     }
     return retHead;
     


   }

  void Print(Node head) {
       if (head == null)
       {  
         return;
       }
       else
       {
         System.out.println(head.data);
         Print(head.next);
       }
   }
   void ReversePrint(Node head) {
     Stack s = new Stack();
     Node pointer = head;
     while(pointer != null)
     {
       s.push(pointer.data);
       pointer = pointer.next;
     }
     
   }
   
    
   Node Delete(Node head, int position) 
   {
     
     if (position == 0)
     {
       Node nextNode = findNthNode(head, position + 1);
       return nextNode;
     }
     if (position >= length(head)-1)
     {
       Node prevNode = findNthNode(head, position - 1);
       prevNode.next = null;
     }
     else
     {
       Node prevNode = findNthNode(head, position - 1);
       Node nextNode = findNthNode(head, position + 1);
       prevNode.next = nextNode;
     }
     return head;
     

   }


    Node InsertNth(Node head, int data, int position) {
      Node newNode = new Node();
      newNode.data = data;
      if (head == null)
      {
        return newNode;
      }
      if (position == 0)
      {
        newNode.next = head;
        return newNode;
      }
      
      Node curNode = findNthNode(head, position);
      Node prevNode = findNthNode(head, position - 1);
      
      if (curNode == prevNode)
      {
        curNode.next = newNode;
      }
      else
      {
        prevNode.next = newNode;
        newNode.next = curNode;
      }
      
      return head;
    }
    
 
    Node findLastNode(Node point)
    {
      if (point.next == null)
        return point;
      else
        return findLastNode(point.next);
        
    }
  
   }
    
   


class Node 
{
     int data;
     Node next;
     public String toString()
     {
       return(data + " " );
     }
}






  