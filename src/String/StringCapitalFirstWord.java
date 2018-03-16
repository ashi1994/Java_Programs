package String;

public class StringCapitalFirstWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="my love india";
		String arr[]=s1.split(" ");
		String ar="";
		String sum="";
		String rev="";
		for(int i=0;i<arr.length;i++){
		ar=arr[i];
		rev=rev+ar.substring(0, 1).toUpperCase()+ar.substring(1)+" ";
		sum=sum+ar.substring(0,1)+ar.substring(1).toUpperCase()+" ";
		}

		System.out.println(rev);//My Love India 
		System.out.println(sum);//mY lOVE iNDIA 
	}


}