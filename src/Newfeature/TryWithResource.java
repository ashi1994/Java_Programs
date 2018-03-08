package Newfeature;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResource {

	public static void main(String[] args) {
		/**
		 * we can say that we don't need to close resources (file, connection, network etc) explicitly, 
		 * try-with-resource close that automatically by using AutoClosable interface.
		 * JAVA-7
		 */
		/*JAVA-9 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try(br){
		}  
		catch() {
		}
		*/
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) {
			int a=Integer.parseInt(br.readLine());
			int b=a/0;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
				

	}

}
