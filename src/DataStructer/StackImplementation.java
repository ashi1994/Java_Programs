package DataStructer;

/**
 * Application of stack is DFS,Parsing,tower of hanoi and expressio conversion(Infix to Postfix, Postfix to Prefix etc)
 * Insertion and deletion from one end called top.
 * For inserting the node we say Push operation and for remove the node Pop operation
 * @author aranjan
 *
 */

public class StackImplementation {
	
	private int stackSize;
	private int[] stackArray;
	private int top;
	
	public StackImplementation(int size) {
		this.stackSize=size;
		this.stackArray=new int[stackSize];
		this.top=-1;
		}
	
	 /**
     * This method returns top of the stack
     * without removing it.
     * @return
     */
	public int peek() {
		return stackArray[top];
	}
	
	 /**
     * This method returns true if the stack is full
     * @return boolean
     */
	
	public boolean isStackFull(){
		return (top==stackSize-1);
	}
	
	/**
     * This method returns true if the stack is 
     * empty
     * @return boolean
     */
	
	public boolean isStackEmpty() {
		return (top==-1);
		
	}
	
	public void push(int entry) throws Exception {
		if(this.isStackFull()) {
			throw new Exception("Stack is full");
		}
		System.out.println("adding element "+entry);
		this.stackArray[++top]=entry;
	
	}
	
	public int pop() throws Exception {
		if(this.isStackEmpty()) {
			throw new Exception("stack is empty");
		}
		int entry=this.stackArray[top--];
		System.out.println("Removed element " +entry);
		return entry;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImplementation sc=new StackImplementation(5);
		try {
			sc.push(5);
			sc.push(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			sc.pop();
			System.out.println("top element is "+sc.peek());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
