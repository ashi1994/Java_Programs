package Sorting;
import java.util.Arrays;
public class Insertionsort
 { 
	 void insertionSort(int[] arr)
    { 
    for (int i = 1; i < arr.length; ++i) 
     { 
      int key=arr[i];
      int j=i-1;
           while (j >= 0 && arr[j]>key)
           { 
              arr[j+1]=arr[j];
              j=j-1;
           }
             arr[j+1]=key;
      }
	 }

	 public static void main(String args[]) {
		 Insertionsort ob=new Insertionsort();
		 int arr[]={8,2,23,3,5};
		 ob.insertionSort(arr);
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
		 
	 }
 }
//https://www.geeksforgeeks.org/insertion-sort/

