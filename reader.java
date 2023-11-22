import java.io.FileReader;
import java.io.IOException;
public class jeswoi {
	public static void main(String[] args) {
		char[] data=new char[14];
		FileReader obj=null;
		try
		{
			obj=new FileReader("myfile.txt");
			obj.read(data);
			obj.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
