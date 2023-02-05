public class SingleLinkedList {
  ListNode head;
  private int length=0;
  public SingleLinkedList()
  {
      length = 0;
  }
  // return the first node of the list
  public synchronized ListNode getHead()
  {
    return head;
  }
  //Insert a node at the beginning of the List
  public synchronized void insertAtBegin(ListNode node)
  {
    node.setNext(head);
    head = node;
    length++;
  }
  //Insert a node at the end of the list
  public synchronized void insertAtEnd(ListNode node)
  {
    if(head==null)
    {
      head = node;
    }
    else{
      ListNode p,q;
      for(p=head; (q = p.getNext())!= null; p = q);
      p.setNext(node);
    }
    length++;
  }
  //Add a new node value to the list at a given position
  //All the values at that position to the end move over to make the room
  public void insert(int data, int position)
  {
    if (position < 1)
    {
      position = 0;
    }
    if (position > length)
    {
      position = length;
    }
    if(head == null)
    {
      head = new ListNode(data);

    }
    else if (position == 0) // if adding at the front of the list
    {
      ListNode temp = new ListNode(data);
      temp.next = head;
      head= temp;
    }
    else {
      ListNode temp = head;
      for(int i=1; i< position;i++)
      {
        temp = temp.next;
      }
      ListNode newNode = new ListNode(data);
      newNode.next= temp.next;
      temp.setNext(newNode);
    }
    length+=1;
  }
  // Remove and return the node at the head of the list
  public synchronized ListNode removeFromBegin()
  {
    ListNode node = head;
    if(node!=null)
    {
      head = node.getNext();
      node.setNext(null);

    }
    return node;
  }
  //Remove and return the node at the end of the List
  public synchronized ListNode remmoveFromEnd()
  {
    if(head == null)
    {
      return null;
    }
    ListNode p=head, q= null, next=head.getNext();
    if(next==null)
    {
      head =null;
      return p;
    }
    while((next = p.getNext())!=null){
      q= p;
      p=next;
    }
    q.setNext(null);
    return p;
  }
  // Remove a specified matching node from the List
  // Used equals() instead of == to test for a matched node
  public synchronized void removeMatched(ListNode node)
  {
    if(head == null)
    {
       return;
    }
    if(node.equals(head))
    {
      head=node.getNext();
      return;
    }
    ListNode p= head, q = null;
    while((q=p.getNext())!=null)
    {
      if(node.equals(q))
      {
        p.setNext(q.getNext());
        return;
      }
      p=q;
    }
  }
  // Remove the value at a given position
  // If the position is less than 0 remove the value at position 0
  // if  the position is greater than 0, remove the valueat last position
  public void remove(int position)
  {
    if(position < 0)
    {
      position =0;
    }
    if(position >= length)
    {
      position = length -1;
    }
    if(head == null)
    {
      return;
    }
    if(position == 0)
    {
      head = head.getNext();
    }// else advance to the   correct position and remove
    else{
      ListNode temp = head;
      for(int i=1; i< position;i++)
      {
        temp = temp.getNext();
      }
      temp.setNext(temp.getNext().getNext());
    }
     length -=1;
  }
  // Return a string representation of the collectipn , in the form ["str1","str2",...]
  public String toString()
  {
      String result = "[";
      if(head==null)
      {
        return result +"]";
      }
      result = result + head.getData();
      ListNode temp =head.getNext();
      while(temp!=null)
      {
          result = result + "," + temp.getData();
          temp=temp.getNext();
      }
      return result + "]";
  }
  // Return the current length of the List
  public int length()
  {
    return length;
  }
  // Find the position of ther first value that is equal to the given value
  public int getPosition(int data)
  {
    ListNode temp =head;
    int pos = 0;
    while(temp!=null)
    {
      if(temp.getData()==data)
      {
        return pos;
      }
      pos+=1;
      temp=temp.getNext();
    }
    return Integer.MIN_VALUE;
  }
  // Remove / Clear everything from List
  public void clearList()
  {
    head = null;
    length = 0;
  }

}
