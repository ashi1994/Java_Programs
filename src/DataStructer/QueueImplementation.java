package DataStructer;

import java.util.NoSuchElementException;

public class QueueImplementation {
	int front,rear,size,len;
	int queqe[];
	
	 /* Constructor */
	public QueueImplementation(int n) {
		size=n;
		queqe=new int[size];
		front=-1;
		rear=-1;
		len=0;
	}
	
	/*  Function to check if queue is empty */
    public boolean isEmpty() 
    {
        return front == -1;
    }
    
    /*  Function to check if queue is full */
    public boolean isFull() 
    {
        return front==0 && rear == size -1 ;
    }  
    
    /*  Function to get the size of the queue */
    public int getSize()
    {
        return len ;
    }  

    /*  Function to check the front element of the queue */
    public int peek() 
    {
        if (isEmpty())
           throw new NoSuchElementException("Underflow Exception");
        return queqe[front];
    }  
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
