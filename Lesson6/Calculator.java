import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {
        
		Double num1;
		Double num2;
        String operation;

	Scanner Kristev = new Scanner(System.in);

        System.out.println("Enter num1");
        num1 = Kristev.nextDouble();

        System.out.println("Enter num2");
        num2 = Kristev.nextDouble();

        Scanner Reader = new Scanner(System.in);

        System.out.println("Enter operator");
        operation = Reader.next();

	if(operation.equals ("+"))
        {
            System.out.println("Your answer" + " " + (num1 + num2));
        }
        if(operation.equals ("-"))
        {
            System.out.println("Your answer" + " " + (num1 - num2));
        }
        if(operation.equals ("/"))
        {
            System.out.println("Your answer" + " " + (num1 / num2));
        }
        if(operation.equals ("*"))
        {
            System.out.println("Your answer" + " " + (num1 * num2));
        }
		if(operation.equals ("%"))
        {
            System.out.println("Your answer" + " " + (num1 - num2));
        }
	
	}
}