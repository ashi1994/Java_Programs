package DataStructer;

import java.util.LinkedList;

public class InsertNodeAtAnyPlace {
	
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d) {
			data=d;
			next=null;
		}
		
	}
	
	void print(Node head){
		while(head!=null){
			System.out.println(head.data+" ");
			head=head.next;
		}
	}
	/* It will insert the node at first position*/
	
	public void push_at_first(int new_data){
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	
	/*It will insert the node at any position*/
	public void pust_at_position(Node prev_node,int new_data){
		
		if(prev_node==null){
			System.out.println("this node is not availble");
			return;
		}
		
		Node new_node=new Node(new_data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;
	}
	
	/* It will add element in last position */
	public void push_at_end(int new_data){
		
		/* 1. Allocate the Node & Put in the daata*/
		
		Node new_node=new Node(new_data);
		
		 /* 2. If the Linked List is empty, then make the new node as head */
		if(head==null){
			head=new Node(new_data);
			return;
		}
		
		
		 /* 3. This new node is going to be the last node, so make next of it as null */
		new_node.next=null;
		
		/* 5. Else traverse till the last node */
		Node last=head;
		 while (last.next != null)
	            last = last.next;
	 
	        /* 6. Change the next of last node */
	        last.next = new_node;
	        return;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertNodeAtAnyPlace ins=new InsertNodeAtAnyPlace();
		ins.head=new Node(5);
		Node sec=new Node(6);
		Node third=new Node(7);
		head.next=sec;
		sec.next=third;
		ins.push_at_first(67);
		ins.pust_at_position(ins.head.next, 100);
		ins.print(head);
		
	}

}
