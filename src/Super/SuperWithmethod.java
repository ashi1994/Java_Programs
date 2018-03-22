package Super;

class Parent{
	void print(){
		System.out.println("i am parent method");
	}
}
public class SuperWithmethod extends Parent {
	void show(){
		super.print();
		System.out.println("i am child");
		//super.print();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperWithmethod su=new SuperWithmethod();
		su.show();

	}

}
