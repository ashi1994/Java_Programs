package Binding;

 class B {
	public static void show() {
		System.out.println("hello from parent");
	}
 }
	class A extends B{
		public static void show() {
			System.out.println("hello from child");
		}
	}
	class EarlyBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a=new A();
		a.show();

	}

}
