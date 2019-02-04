import java.util.Scanner;

public class Counteven{
	public static void main(String[] args){
		Scanner Jony = new Scanner(System.in);
		System.out.println("The system gives the amount of even");
		System.out.println("what's your number");
		int numScanner = Jony.nextInt();
		int total = 0;
		
		
		for (int number = 0; number <= numScanner; number++){
			int modul = number % 2;
			if(modul == 0){
				total += number;
				
			}
			
		}
		System.out.println("\nTotal = " + total);
		System.out.println("\nCreated by Re6aLa!");
	}
}