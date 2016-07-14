import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("D:/IRP_Question_List.txt");
		BufferedReader br=new BufferedReader(new FileReader(file));
		
		String data = br.readLine();
		while(data!=null)
		{
			System.out.println(data);
			data=br.readLine();
		}
		
		br.close();
		
		
	}

}
