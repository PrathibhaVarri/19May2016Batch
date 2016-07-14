import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputExample {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ente input");
		String name = br.readLine();
		
		System.out.println(name);
	}

}
