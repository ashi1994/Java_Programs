package Thread;

public class Daemontwo extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Thread d=Thread.currentThread();
	System.out.println(d.getName());
	System.out.println(d.getId());
	System.out.println(d.getPriority());
	Daemontwo d1=new Daemontwo();
	d1.setDaemon(true);
	System.out.println(d1.isDaemon());

	}

}
