class ListNode
{
  int data;
  ListNode next;
  public ListNode(int data)
  {
    this.data = data;
  }
  public void setData(int data)
  {
    this.data = data;
  }
  public int getData()
  {
    return this.data;
  }
  public void setNext(ListNode next)
  {
    this.next = next;

  }
  public ListNode getNext()
  {
    return this.next;
  }
  // Time complexity : O(n)
  // Space complexity : O(1) , for creating a temperart variable
  public int linkListLength(ListNode headNode)
  {
    int length =0;
    ListNode currNode = headNode;
    while(currNode!= null)
    {
      length++;
      currNode = currNode.getNext();

    }
    return length;
  }
}
