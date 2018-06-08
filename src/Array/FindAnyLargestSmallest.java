package Array;

public class FindAnyLargestSmallest {

	public static int maxInArray(int a[]) {
		int temp;
		//Here we will do first sorting
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[a.length-2];
		//return a[1] for second smallest
	}
	public static void main(String[] args) {
		
		int a[]={12,4,45,3,534,44};
		System.out.println(maxInArray(a));
		
	}

}
/*
 * Using this we can find any n-th lowest and highest number from a array
 */
