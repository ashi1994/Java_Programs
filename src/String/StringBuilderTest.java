package String;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb= new StringBuilder();
		System.out.println(sb.capacity()+" "+sb.length());//Default Capacity 16, if character increased then capacity By (16*2)+2=34
		sb.append("Helo Java In Automation");
		System.out.println(sb.capacity()+" "+sb.length());//Now the default capacity is (16*2)+2=34 because charcter size increased by the default case
		System.out.println(sb.delete(1,3));//Ho Java In Automation(it will not include last index)
		sb.insert(2,"test");
		System.out.println(sb);
		sb.replace(2, 4, "hello");
	
		
	}

}

//Lenght give actual size of size.
//capacity give number of character spaces that have been allocated. 
//It does not give gurantee for Synchronisation
//it comes in java version 1.5