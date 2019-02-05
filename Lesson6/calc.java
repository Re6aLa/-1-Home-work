import java.util.Scanner;

public class calc{
	public static void main(String[] args){
		Scanner Reader = new Scanner(System.in);
		double num1;
		double num2;
		String operation;
		boolean Exit = true;
		int feadback;
		

		for ( ;Exit; ){
			System.out.println("Demo Calculator");
		System.out.println("First number ");
		num1 = Reader.nextDouble();
			Scanner op = new Scanner(System.in);
			System.out.println("Enter operation");
			operation = op.next();
		System.out.println("Second number");
		num2 = Reader.nextDouble();
				
		switch(operation){
			case "+" :
			System.out.println("summa = " + (num1 + num2));
			System.out.println("\nCreated by Re6aLa!");
			break;
			case "-" :
			System.out.println("summa = " + (num1 - num2));
			System.out.println("\nCreated by Re6aLa!");
			break;
			case "*" :
			System.out.println("summa = " + (num1 * num2));
			System.out.println("\nCreated by Re6aLa!");
			break;
			case "/" :
			System.out.println("summa = " + (num1 / num2));
			System.out.println("\nCreated by Re6aLa!");
			break;
			case "%" :
			System.out.println("summa = " + (num1 % num2));
			System.out.println("\nCreated by Re6aLa!");
			break;
			default :
			System.out.println("Error Operation");
			System.out.println("\nCreated by Re6aLa!");
			}
			
			System.out.println("1: Again");
			System.out.println("2: Exit");
			Scanner Jony = new Scanner(System.in);
			System.out.println("\nSelect continue or close ");
				int feedback = Jony.nextInt();
			switch(feedback){
				case 1:{
					Exit = true;
				}break;
				case 2:{
					Exit = false;
				}break;
				default:
				System.out.println("Error choise write char operation");
				Exit = false;
			}
		}
	}
	
}