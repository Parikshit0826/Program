package LinkedList;

class Node {
	int value;
	Node next;
	
}
class SingleLL{
	public Node head;
	public Node tail;
	public int size;
	
	public void creationOfSLL(int value) {
		head= new Node();
		Node node = new Node();
		node.value=value;
		node.next= null;
		head = tail= node;
		size =1;
		System.out.println(value);
	}
	
}


public class SingeLinkedList {
	
	public static void main(String[] args) {
		SingleLL sll= new SingleLL();
		sll.creationOfSLL(10);
	}

}
