package Array;

import java.util.HashMap;

public class CountOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,3,4,3,31,3};
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++){
			if(hm.containsKey(a[i])){
				hm.put(a[i], hm.get(a[i])+1);
			}
			else{
				hm.put(a[i], 1);
			}
		}
		System.out.println(hm);
		

	}

}
