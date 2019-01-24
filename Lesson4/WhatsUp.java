import java.util.Scanner;
public class WhatsUp {

	public static void main(String[] args){
		System.out.println("\nHello User");
		System.out.println("\nLet's get to know each other");
		System.out.println("\nWhat's your name: ");
		System.out.println("\nWhat's your surname: ");
		System.out.println("\nWhat's your Domein : ");
		Scanner reader = new Scanner(System.in);
		String userName = reader.next();
		String userSurname = reader.next();
		String userDomein = reader.next();
		reader.close();
		System.out.println("\nNice to meet you, " + userName + userSurname);
		System.out.println(	userDomein);
		
	}
}