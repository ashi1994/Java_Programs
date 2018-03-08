package OopsConcept;

 class childclass {
	
	public void show() {
		System.out.println("hello java from papa");
	}
}	
class PolymorphismByOverriding  extends childclass {
	public void show() {
		System.out.println("hello java from child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/**
		 * It is helpful when we have to access not overrided method
		 */
		childclass ch=new childclass();
		ch.show();

		/**
		 * It is by creating object of child class
	    **/
		PolymorphismByOverriding obj1=new PolymorphismByOverriding();
		obj1.show();
		
		/**
		 * It is Upcasting
		 * Object of child class is assigned to reference varibale of parent type
		 * this operation is a upcasting. and it happens automatically.no need to do anything explicitly.
	    **/
		
		childclass ch2=new PolymorphismByOverriding();
		ch2.show();
		
	
		
		childclass ch3=new PolymorphismByOverriding();
		PolymorphismByOverriding pb=(PolymorphismByOverriding) ch3;
		pb.show();
		
	}
	
	
	

}
