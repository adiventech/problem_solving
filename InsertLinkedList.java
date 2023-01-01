//WAP for a simple linked list with 3 nodes and discussed linked list traversal.
import java.io.*;
class InsertLinkedList
{
  Node head;
  class Node{
    int data;
    Node next;
    Node(int data)
    {
      this.data = data;
      this.next = null;
    }
  }
  /* Inserts a new Node at front of the list. */
  public void push(int data)
  {
    Node newNode = new Node(data);
    newNode.next =  head;
    head = newNode;
  }
  /* Appends a new node at the end.  This method is
  defined inside LinkedList class shown above */
  public void append(int data)
  {  Node newNode = new Node(data);
    if (head == null)
    {
      head = new Node(data);
      return;
    }
     newNode.next = null;
     Node last = head;
     while(last.next != null)
     {  last = last.next;
       last.next = newNode;
       return;
     }
  }

  /* This function prints contents of linked list starting from
          the given node */
  public void printList()
  {
    Node tnode = head;
    while(tnode != null)
    {
      System.out.print(tnode.data+"  ");
      tnode= tnode.next;
    }
  }
  /* Inserts a new node after the given prev_node. */
  public void insertAfter(Node prevNode, int data)
  {
    if(prevNode ==null)
    {
      System.out.println("The given previous node cannot be null");
    }
    Node newNode = new Node(data);
    newNode.next = prevNode.next;
    prevNode.next= newNode;
  }
  public static void main(String... s){
    InsertLinkedList list = new InsertLinkedList();
    list.append(6);
    list.push(7);
    list.append(1);
    list.insertAfter(list.head.next,9);
    System.out.println("The Linded List is:");
    list.printList();
  }
}
