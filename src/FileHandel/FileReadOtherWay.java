package FileHandel;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReadOtherWay {

	public static final String PATH="C:\\Test\\ashiwani.txt";


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(BufferedReader br=new BufferedReader(new FileReader(PATH))) {
			String currentLine;
			
			while((currentLine=br.readLine())!=null)
				System.out.println(currentLine);
	}
		catch(Exception e) {
			e.getMessage();
		}

}
}
