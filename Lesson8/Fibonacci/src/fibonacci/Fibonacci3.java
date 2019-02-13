/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Kristev
 */
public class Fibonacci3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Calculation of numbers Fibonacci");
        System.out.println("Created by Danil");
        
        int a1 = 0, a2 = 1, n = 0, sum = 0;
        do {
            sum = a1 +a2 ;
            a2 = a1;
            a1 = sum;
        System.out.print(a1 + sum + "\n");
            n++;
        }while (n < 4);
    }
    
}
