public class HRJavaLinkedlistlast{

public static void main(String []argh)
    {
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */

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
    Node Insert(Node head,int data) {
      Node newNode = new Node();
      newNode.data = data;

      if (head != null)
        newNode.next = head;
      return newNode;
      
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
}






  