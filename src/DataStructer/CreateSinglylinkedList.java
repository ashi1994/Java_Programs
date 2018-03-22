package DataStructer;

public class CreateSinglylinkedList {
	static Node head;//head of list
	
	 /* Linked list Node.  This inner class is made static so that main() can access it */
	
	static class Node {
		int data;
		Node next;
		// Constructor to create a new node
        // Next is by default initialized
        // as null
		Node(int d) {
			data=d;
			next=null;	
		}
		
	}
	void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateSinglylinkedList addd=new CreateSinglylinkedList();
		addd.head=new Node(5);
		Node second=new Node(7);
		Node third=new Node(44);
		head.next=second;
		second.next=third;
		addd.printList(head);
		
	}

}
