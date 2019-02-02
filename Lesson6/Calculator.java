import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {
        
		double num1;
		double num2;
        String operation;

	Scanner Kristev = new Scanner(System.in);

        System.out.println("Enter num1");
        num1 = Kristev.nextDouble();

        Scanner Reader = new Scanner(System.in);
		System.out.println("Enter operator");
        operation = Reader.next();
		
		System.out.println("Enter num2");
        num2 = Kristev.nextDouble();

        

	if(operation.equals ("+"))
        {
            System.out.println("Your answer" + " " + (num1 + num2));
        }
        else if(operation.equals ("-"))
        {
            System.out.println("Your answer" + " " + (num1 - num2));
        }
        else if(operation.equals ("/"))
        {
            System.out.println("Your answer" + " " + (num1 / num2));
        }
        else if(operation.equals ("*"))
        {
            System.out.println("Your answer" + " " + (num1 * num2));
        }
		else if (operation.equals ("%"))
        {
            System.out.println("Your answer" + " " + (num1 % num2));
        }
		else
			
		System.out.println("Your Input is not correct,please check it for any error(s).");
	
	}
}