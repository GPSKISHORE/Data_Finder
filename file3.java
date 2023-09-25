import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;  
import java.io.IOException;

public class file3 {

	public static void main(String[] args) throws IOException
	{
		PDDocument cs=new PDDocument();
		PDPage fp=new PDPage();
        PDDocument document = null;
		document.addPage(fp);
		document.save("C:\\Users\\KISHORE\\Desktop\\LM\\siva.1.pdf");
		System.out.println("pdf created");
		document.close();
		cs.close();
	}
}
