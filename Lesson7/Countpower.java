import java.util.Scanner;

public class Countpower{
	public static void main(String[] args){
		Scanner Jony = new Scanner(System.in);
		System.out.println("\nSystem of Exponentiation");
		System.out.println("\nEnter your number ?");
		int sum = 1;
		int stage = Jony.nextInt();
		int x = 1;
		for( ; x <= stage; x++){
			sum = sum * stage;
		} 
		System.out.println("Total =" + sum);
		System.out.println("\nCreated by Re6aLa!");
	}
}