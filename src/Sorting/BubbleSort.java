package Sorting;
import java.util.Scanner;
/**
 * 
 * https://www.geeksforgeeks.org/bubble-sort/
 *
 */
 
class BubbleSort {
  public static void main(String []args) {
    int n, i, j, swap;
    Scanner in = new Scanner(System.in);
 
    System.out.println("Input number of integers to sort");
    n = in.nextInt();
 
    int array[] = new int[n];
 
    System.out.println("Enter " + n + " integers");
 
    for (i = 0; i < n; i++) 
      array[i] = in.nextInt();
 
    for (i = 0; i < ( n - 1 ); i++)
     {
      for (j = 0; j < n - i - 1; j++)
       {
        if (array[j] > array[j+1]) // for desecending change
        {
          swap       = array[j];
          array[j]   = array[j+1];
          array[j+1] = swap;
        }
      }
    }
 
    System.out.println("Sorted list of numbers");
 
    for (i = 0; i < n; i++) 
      System.out.println(array[i]);
  }
}
/*
import java.util.Arrays;
 
class Sort
{
  public static void main(String args[])
  {
    int data[] = { 4, -5, 2, 6, 1 };
 
    Arrays.sort(data);
 
    for (int c: data) 
    {
      System.out.println(c);
    }
  }
}
*/