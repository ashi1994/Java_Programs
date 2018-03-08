package FileHandel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f=new File("C:\\Test\\ashiwani.txt");
		Scanner sc=new Scanner(f);
		while(sc.hasNextLine())
			System.out.println(sc.nextLine());

		sc.close();
	}
	

}
