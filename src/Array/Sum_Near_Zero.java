package Array;

public class Sum_Near_Zero {
	
	public static void sumZero(int arr[]){
		int min1=0;
		int min2=1;
		int minsum=Math.abs(arr[0]+arr[1]);
		int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				sum=Math.abs(arr[i]+arr[j]);
				if(sum<minsum){
					min1=i;
					min2=j;
					minsum=sum;
					
					
				}
				
			}
		}
		System.out.println(arr[min1]+" "+arr[min2]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,44,33,-3,3};
		sumZero(a);

	}

}
