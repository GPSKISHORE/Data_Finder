//import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;

import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.pdmodel.PDDocument;
//import org.testng.Assert;
//import org.testng.annotations.Test;

public class file1 {	
		public static void main(String[] args) throws Exception
		{
			new file1().meth5();
		}
		public void meth5() throws Exception
		{
			
			FileInputStream eobj= new FileInputStream("C:\\Users\\KISHORE\\Desktop\\LM\\Test-1.pdf");
			FileOutputStream fobj=new FileOutputStream("C:\\Users\\KISHORE\\Desktop\\LM\\siva.2.csv");
			PDDocument cs= PDDocument.load(eobj);
			PDFTextStripper ps=new  PDFTextStripper();
			String data=ps.getText(cs);
//			System.out.println(data);
			System.out.println(cs.getPages().getCount());
			new file2().meth1();
			for(int i=0;i<s.length;i++)
			{
				if(data.contains(s[i]))
				{
					byte b[]=(s[i]+","+"\n").getBytes();
					fobj.write(b);
				}
				else
				{
					byte b[]=(s1+",").getBytes();
					fobj.write(b);
				}
			}
			eobj.close();
			cs.close();
		}
}
