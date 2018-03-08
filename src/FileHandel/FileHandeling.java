package FileHandel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fd=new File("C:\\CeateFolder");
		File fl=new File("C:\\CeateFolder\\Newfile.txt");
		FileReader fr=null;
		BufferedReader br = null;
		if(!fd.exists()){
			fd.mkdir();
			if(!fl.exists()){
				try {
					fl.createNewFile();
					fr=new FileReader(fl);
					 br = new BufferedReader(fr);
					   String line;
					   while ((line = br.readLine()) != null) {
					    System.out.println("line=" + line);
					
					   }
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			
		}

	}
	
}
/*
public static void sampleFileKT() {
	  // File fl=new File("C:\\KT");
	  // String paths[]=fl.list();
	  // System.out.println("files list="+Arrays.toString(paths));
	  System.out.println("");
	  File fll = new File("C:\\Ashiwani");
	  File fl = new File("C:\\Ashiwani\\Sample.txt");
	  File f = new File("C:\\Ashiwani\\Samplewrite.txt");
	  FileReader fr = null;
	  BufferedReader br = null;
	  FileWriter fw = null;
	  StringBuilder sb = new StringBuilder();
	  System.out.println("");
	  try {
	   if (!fll.exists())
	    fll.mkdir();
	   if (!fl.exists())
	    // fl.mkdir();
	    fl.createNewFile();
	   fr = new FileReader(fl);
	   br = new BufferedReader(fr);
	   String line;
	   while ((line = br.readLine()) != null) {
	    System.out.println("line=" + line);
	    sb.append(line);
	   }

	   if (!f.exists())
	    f.createNewFile();
	   fw = new FileWriter(f);
	   fw.write(sb.toString());
	   fr.close();
	   br.close();
	   fw.close();
	   String[] nameOfFiles=fll.list();
	   System.out.println("files are"+Arrays.toString(nameOfFiles));
	  } catch (IOException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }

	 
*/
