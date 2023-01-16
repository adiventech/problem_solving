// A complete working Java program
// to demonstrate deletion
// in singly linked list
// Time Complexity: O(n)
// Auxiliary Space: O(1)
public class DeleteLinkedList{
  Node head; //head of the List
  class Node{
    int data;
    Node next;
    Node(int d)
    {
      data = d;
      next = null;
    }
  }
  /* Given a key, deletes the first
       occurrence of key in
     * linked list */
  public void deleteNode(int key)
  {
    Node tnode = head;
    Node prev = null;
    // If head node itself holds the key to be deleted
    if((tnode != null) && (tnode.data == key))
    {
      head = tnode.next; //change head
      return;
    }
    // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
      while((tnode != null) && (tnode.data != key))
        {
          prev = tnode;
          tnode = tnode.next; //change head
        }

        // If key was not present in linked list
        if(tnode == null)
        {
          return;
        }
        // Unlink the node from linked list
        prev.next = tnode.next;

  }
  /* Inserts a new Node at front of the list. */
  public void push(int data)
  {
    Node new_node = new Node(data);
    new_node.next =  head;
    head = new_node;
  }
  /* This function prints contents of linked list starting
       from the given node */
  public void printList()
  {
    Node tnode = head;
    while(tnode != null)
    {
      System.out.print(tnode.data+" ");
      tnode = tnode.next;
    }
  }
  public static void main(String... s)
  {
    DeleteLinkedList list = new DeleteLinkedList();
    list.push(7);
    list.push(1);
    list.push(3);
    list.push(2);
    System.out.println("\nCreated Linked list is:");
    list.printList();
    list.deleteNode(1);
    System.out.println("\nLinked list after deletion of 1 is:");
    list.printList();
  }
}
