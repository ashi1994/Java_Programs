package Binding;
class ParentClass{
	public void show(){
		System.out.println("showing");
	}
}
class ChildClass extends ParentClass{
	public void show(){
		System.out.println("showing1");
	}
}

public class DynamicBinding {
	
	public static void main(String...s) {
		// TODO Auto-generated method stub
		ParentClass ch=new ChildClass();
		ch.show();

	}

}
