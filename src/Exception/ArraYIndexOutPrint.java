package Exception;

public class ArraYIndexOutPrint {

	public static void main(String[] args) {
		try {
			int a[]={1,6,7};
			System.out.println(a[7]);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
