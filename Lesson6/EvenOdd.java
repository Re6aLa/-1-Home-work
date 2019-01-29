import java.util.Scanner;

public class EvenOdd{

    public static void main(String[] args) {
		Scanner Reader = new Scanner(System.in);
		int a;
			System.out.println("Type your number");
			a = Reader.nextInt();
			int b = a % 2;
			
		if (b == 0)
			System.out.println("Even number");
		else 
			System.out.println("Odd number");
	
	}
}
		