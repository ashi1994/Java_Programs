import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inputtaen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String sc= br.readLine();
		String sc1=br.readLine();
		String sc2=br.readLine();
		int a=Integer.parseInt(sc1);
		double d=Double.parseDouble(sc2);
		System.out.println(sc);
		System.out.println(a+20);
		System.out.println(d+21);
		

	}

}
