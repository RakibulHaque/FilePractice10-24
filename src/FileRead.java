import java.io.File;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File file = new File("C:/Users/user/person/student.txt");
			Scanner scan =new Scanner(file);
			
			while(scan.hasNext())
			
			{
				String id = scan.next();
				String name = scan.next();
				System.out.println("ID: "+id + " Name: "+name);
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			
		}

	}

}
