import java.util.Formatter;
import java.util.Scanner;

public class FileWrite {

	public static void main(String[] args) {
		String id,name;
		try {
			Formatter formatter = new Formatter("C:/Users/user/person/student.txt");
			
			Scanner input = new Scanner(System.in);
			System.out.println("How many student: ");
			int num = input.nextInt();
			for(int i=0;i<num;i++)
			{
				System.out.println("please enter Student id and name: ");
				 id = input.next();
				name = input.next();
				formatter.format("%s %s\r\n", id,name);
			}
			/*
			 * formatter.format("%s %s\r\n", "001", "Rakibul");
			 * formatter.format("%s %s\r\n", "002", "ashiq"); formatter.format("%s %s\r\n",
			 * "003", "Gamir"); formatter.format("%s %s\r\n", "004", "Tarif");
			 */

			formatter.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("File does not Exist");

		}

	}
}
