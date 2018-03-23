package DataStructer;

public class ReverseLinkedList {
	
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
   Node reverse(Node head){
	Node prev=null;
	Node next=null;
	Node current=head;
	while(current!=null){
		 next = current.next;
         current.next = prev;
         prev = current;
         current = next;
     }
     head = prev;
     return head;
}
  void print(Node head){
	while(head!=null){
		System.out.println(head.data+" ");
		head=head.next;
	}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedList sc=new ReverseLinkedList();
		sc.head=new Node(5);
		sc.head.next=new Node(15);
		sc.head.next.next=new Node(633);
		sc.print(head);
		 head = sc.reverse(head);
	        System.out.println("");
	        System.out.println("Reversed linked list ");
	        sc.print(head);
	    }
		
}