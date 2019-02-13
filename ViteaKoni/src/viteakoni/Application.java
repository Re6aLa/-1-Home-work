package viteakoni;

import java.util.Scanner;

public class Application {
    // square perimeter/surface
    // triangle perimeter/surface
    // calculator +,-,*,/,%
    // odd ? even
    // generate X fibonacci Number

    public static void main(String[] args) {
        //1. user input
        Scanner keyboardScanner = new Scanner(System.in);
        //Square - perimeter & surface
        Geometry geometry = new Geometry();
        System.out.println("Hello, this application created by Re6aLa!");
        System.out.println("Application will as you a side size, \n to count a Square, Rectangle, Rhombus, Triangle");
        System.out.println("Enter the size of the sides of the Square: ");
        System.out.println("Please enter square side: ");
        int squareSide = keyboardScanner.nextInt();
        geometry.calculateSquareSurface(squareSide);
        geometry.calculateSquarePerimeter(squareSide);
        
        
        System.out.println("Enter the size of the sides of Rectangle: ");
        Rectangle rectangle = new Rectangle();
        System.out.println(" Side length ");
        int sideLengthL = keyboardScanner.nextInt();
        System.out.println("Side Width ");
        int sideWidthL = keyboardScanner.nextInt();
        rectangle.calculateRectangleSurface(sideLengthL, sideWidthL);
        rectangle.calculateRectanglePerimeter(sideLengthL, sideWidthL);
        
        System.out.println("Enter the size of side of Rhombus: ");
        Rhombus rhombus = new Rhombus();
        System.out.println(" Side ");
        int sideLong = keyboardScanner.nextInt();
        System.out.println("Enter the Heigth: ");
        int sideH = keyboardScanner.nextInt();
        rhombus.calculateRhombusSurface(sideLong,sideH);
        rhombus.calculateRhombusPerimeter(sideLong);
        
        System.out.println("Enter the sides and heigth of Triangle: ");
        Triangle triangle = new Triangle();
        System.out.println("Side a: ");
        int sideA = keyboardScanner.nextInt();
        System.out.println("Side b: ");
        int sideB = keyboardScanner.nextInt();
        System.out.println("Side C: ");
        int sideC = keyboardScanner.nextInt();
        System.out.println("Heigth H: ");
        int sideHT = keyboardScanner.nextInt();
        triangle.calculateTriangleSurface(sideA, sideHT);
        triangle.calculateTrianglePerimetr(sideA,sideB,sideC);
        
        System.out.println("Even or Odd");
        int number = keyboardScanner.nextInt();
        Algebra algebra = new Algebra();
        algebra.detectOddOrEven(number);

        System.out.println("How many Fibonacci numbers to print");
        int count = keyboardScanner.nextInt();
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();
        fibonacciGenerator.generateFibonacciList(count);

    }
}
