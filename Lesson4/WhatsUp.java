import java.util.Scanner;
public class WhatsUp {

	public static void main(String[] args){
		System.out.println("\nHello User");
		System.out.println("\nLet's say as about you ");
		Scanner reader = new Scanner(System.in);
		System.out.println("\nWhat's your name: ");
		String userName = reader.next();
		System.out.println("\nWhat's your surname: ");
		String userSurname = reader.next();
		System.out.println("\nWhat's your activity : ");
		String userActivity = reader.next();
		reader.close();

		System.out.println("\nNice to meet you, " + userName + ", " +userSurname );
		System.out.println(userActivity);

		
	}
}