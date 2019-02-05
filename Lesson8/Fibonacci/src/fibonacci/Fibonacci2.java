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
public class Fibonacci2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Calculation of numbers Fibonacci");
        System.out.println("Created by Danil");
        
        int b = 1, n = 4, a1 = 0, a2 = 1;
        System.out.println(n + " " + "Terms choosed by Youser");
        while ( b <= n){
            System.out.println( a1 + " ");
        int sum = a1 +a2;
        a1 = a2;
        a2 = sum;
        b++;
        }
    }  
}
