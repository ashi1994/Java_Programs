package This;


public class ThisWithMethod {
	
	void show(){
		System.out.println("this is show method");
	}
	
	void print() {
		this.show();
		System.out.println("this is print method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisWithMethod th=new ThisWithMethod();
		th.print();
		

	}

}
