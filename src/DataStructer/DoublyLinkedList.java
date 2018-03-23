package DataStructer;

public class DoublyLinkedList {
	static Node head;
	
	static class Node{
		
		
		int data;
		Node next;
		Node prev;
		
		Node(int d){
			data=d;
		}
	}
	
	void push_start(int new_data){
		
		/* 1. allocate node 
		    * 2. put in the data */
		Node new_node=new Node(new_data);
		
		/* 3. Make next of new node as head and previous as NULL */
		new_node.next=head;
		new_node.prev=null;
		
		/* 4. change prev of head node to new node */
	    if(head != null)
	        head.prev = new_node;
	  
	    /* 5. move the head to point to the new node */
		
		head=new_node;
	}
	
	void print_list(Node node){
		
		Node last=null;
		while(node!=null){
			System.out.println(node.data+" ");
			last = node;
            node = node.next;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList dl=new DoublyLinkedList();
		dl.head=new Node(5);
		dl.head.next=new Node(5598);
		dl.head.next.next=new Node(22);
		dl.push_start(11);
		dl.print_list(head);
		
		
		
		

	}

}
