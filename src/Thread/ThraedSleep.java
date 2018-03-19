package Thread;

public class ThraedSleep extends Thread {
	
	public void run() {
		System.out.println("thread started to run");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThraedSleep t1=new ThraedSleep();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread awaked up");
		t1.start();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		t1.setName("ashiwani");
		System.out.println(t1.getName());

	}

}
