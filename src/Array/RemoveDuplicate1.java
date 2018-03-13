package Array;

public class RemoveDuplicate1 {
	
	public static int[] removeDuplicates(int[] input){
		   int j = 0, i = 1;
		   //return if the array length is less than 2
		   if(input.length < 2)
		        return input;
		   while(i < input.length){
		        //If current value is duplicate of previous value, check for next value.
		        if(input[i] == input[j])
		             i++;
		        //If current value is not a duplicate of previous value, store this unique value at current position.
		        else
		             input[++j] = input[i++];
		    }
		    int[] output = new int[j+1];
		    for(int k=0; k < output.length; k++)
		        output[k] = input[k];
		    return output;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,3,4,44,1,3,3};
		int op[]=removeDuplicates(arr);
		for(int i=0;i<op.length;i++)
		System.out.println(op[i]);

	}

}
