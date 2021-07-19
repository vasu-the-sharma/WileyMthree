package july19;

public class myLinkedList {

 Node head;									// declaring head as global
 static class Node {

     int data;	
     Node next;

     Node(int d){							// constructor
         data = d;
         next = null;
     }
 }

 public static myLinkedList insert(myLinkedList list, int data)
 {

     Node new_node = new Node(data);
     new_node.next = null;

     if (list.head == null) {
         list.head = new_node;
     }
     else{
         Node last = list.head;
         while (last.next != null) {
             last = last.next;
         }
         last.next = new_node;
     }

     return list;
 }

 public static void print(myLinkedList list)
 {
     Node curr = list.head;
     System.out.println("My LinkedList Implementation: ");
 
     while (curr!=null) {
         System.out.print(curr.data + " ");
         curr = curr.next;
     }
 }
 
 public static void main(String[] args)
 {
     myLinkedList list = new myLinkedList();

     list = insert(list, 10);
     list = insert(list, 20);
     list = insert(list, 30);
     list = insert(list, 40);
     list = insert(list, 50);
     list = insert(list, 60);
     list = insert(list, 70);
     list = insert(list, 80);

     print(list);
 }
}