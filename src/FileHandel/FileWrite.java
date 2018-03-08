package FileHandel;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWrite {
	
	public static final String PATH="C:\\Test\\ashiwaniwrite.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="Helo,how are you";
		try(BufferedWriter br=new BufferedWriter(new FileWriter(PATH))) {
			
			br.write(data);
		
		System.out.println("Donne");
			
		}

		catch(Exception e){
			e.getMessage();
			
		}
		
		
	}

}
