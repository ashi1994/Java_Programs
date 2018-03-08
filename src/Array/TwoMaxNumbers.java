package Array;
public class TwoMaxNumbers {
 
    public void printTwoMaxNumbers(int[] nums)
    {
//        int maxOne = 0;
//        int maxTwo = 0;
//        for(int n:nums){
//            if(maxOne < n)
//            {
//                maxTwo = maxOne;
//                maxOne =n;
//            } 
//            else if(maxTwo < n)
//            {
//                maxTwo = n;
//            }
//        }
//    	
    	int maxOne=nums[0];
    	int maxTwo=nums[0];
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]>maxOne){
        		maxTwo=maxOne;
        		maxOne=nums[i];
        	}
        	else if(nums[i]>maxTwo){
        		maxTwo=nums[i];
        	}
        }
        System.out.println("First Max Number: "+maxOne);
        System.out.println("Second Max Number: "+maxTwo);
        System.out.println(maxOne+maxTwo);//sum of two maximum in array..
    }
    
    public static void main(String a[]){
        int num[] = {145,34,78,2,45,1,99,23};
        TwoMaxNumbers tmn = new TwoMaxNumbers();
        tmn.printTwoMaxNumbers(num);
    }
}