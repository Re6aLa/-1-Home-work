import java.util.Scanner;

public class CountingEvenOdd{
	public static void main(String[] args){
		Scanner Jony = new Scanner(System.in);
		System.out.println("System of counting Even & Odd numbers");
		
		System.out.println("Enter ten numbers:");
		int num1 = Jony.nextInt() % 2;
		int num2 = Jony.nextInt() % 2;
		int num3 = Jony.nextInt() % 2;
		int num4 = Jony.nextInt() % 2;
		int num5 = Jony.nextInt() % 2;
		int num6 = Jony.nextInt() % 2;
		int num7 = Jony.nextInt() % 2;
		int num8 = Jony.nextInt() % 2;
		int num9 = Jony.nextInt() % 2;
		int num10 = Jony.nextInt() % 2;
		int even = 0;
		int odd = 0;
		
		if (num1 == 0){
			even++;
		}
		else{
			odd++;
		}
		if (num2 == 0){
			even++;
		}
		else{
			odd++;
		}
		if (num3 == 0){
			even++;
		}
		else{
			odd++;
		}if (num4 == 0){
			even++;
		}
		else{
			odd++;
		}
		if (num5 == 0){
			even++;
		}
		else{
			odd++;
		}
		if (num6 == 0){
			even++;
		}
		else{
			odd++;
		}
		if (num7 == 0){
			even++;
		}
		else{
			odd++;
		}
		if (num8 == 0){
			even++;
		}
		else{
			odd++;
		}
		if (num9 == 0){
			even++;
		}
		else{
			odd++;
		}
		if (num10 == 0){
			even++;
		}
		else{
			odd++;
		}
			System.out.println("even = " + even);
			System.out.println("odd = " + odd);
			System.out.println("\nCreated by Re6aLa!");
	}	
}