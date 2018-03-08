package Array;
//LARGEST  TWO NO. IN ARRAY

public class Test
{

public static int[] findTwoHighestDistinctValues(int[] array)
{
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    for (int value:array)
    {
        if (value > max)
        {
            secondMax = max;
            max = value;
        }
        else if (value > secondMax && value < max)
        {
            secondMax = value;
        }
    }
    return new int[] { max, secondMax };
}

public static void main(String []args)
{
    int [] values = new int[5];
        values[0] = 5;
        values[1] = 10;
        values[2] = 15;
        values[3] = 20;
        values[4] = 25;
    int []ar = findTwoHighestDistinctValues(values);
    System.out.println("1 = "+ar[0]);
    System.out.println("2 = "+ar[1]);
}  
}
