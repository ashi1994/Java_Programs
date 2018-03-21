package Array;

public class OddEvenFromArray {
	
	public static void oddEven(int a[]){
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0)
				System.out.println("Even numbers are "+a[i]);
			}
			for(int i=0;i<a.length;i++){
			if(a[i]%2!=0)
				System.out.println("Odd numbers are "+a[i]);
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,4,5,8,77};
		oddEven(a);

	}

}
