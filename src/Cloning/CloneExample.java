package Cloning;

public class CloneExample implements Cloneable {
	
	void show(String name) {
		System.out.println(name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloneExample c1=new CloneExample();
		try {
			CloneExample c2=(CloneExample)c1.clone();
			c2.show("helo");
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
