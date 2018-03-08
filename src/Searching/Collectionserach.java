package Searching;
import java.util.*;
class Collectionserach
{
	public static void main(String...s)
	{

        String[] aa={"one","two","three","four"};
        Arrays.sort(aa);//it will sort an array,for binary search of collection there  must be sorted array..s

        for(String s1:aa)
        System.out.println(s1 +  "");

    System.out.println("\none =" +Arrays.binarySearch(aa,"one"));//collection uses binarysearch for searching
//if it return negartive number it denote insertion point of that object,(-(insertion point)-1)
	}

}