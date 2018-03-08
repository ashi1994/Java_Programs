package GarbageCollection;

public class UnreferenceObject {
	
	public static void main(String...s) {
		
	
	//Case-1 By nulling a reference:
	UnreferenceObject un=new UnreferenceObject();
	un=null;
	
	//Case-2 By assigning a reference to another
	UnreferenceObject un1=new UnreferenceObject();
	UnreferenceObject un2=new UnreferenceObject();
	un1=un2;////now the first object referred by un1 is available for garbage collection  
	
	
	//Case-3 By annonymous object:
	new UnreferenceObject();
	

}

}