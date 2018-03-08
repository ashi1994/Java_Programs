package Number;

public class PrintNumberWithoutLoop {

static int count = 0;
      public static void printNums() 
      {
		System.out.print(" "+(count++)+" ");
		if(count<=500){
			printNums();
		}  
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNums();
		
	}

}
