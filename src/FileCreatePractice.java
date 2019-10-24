import java.io.File;

public class FileCreatePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File dir = new File("C:\\Users\\user\\person");
		dir.mkdir();
		
		File file1 = new File("C:/Users/user/person/student.txt");
		
		try {
			file1.createNewFile();
			System.out.println("file created successfully");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		

	}

}
