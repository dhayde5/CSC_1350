/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gcd;
import java.util.Scanner;

/**
 *
 * @author dirty_000
 */
public class GCD 
{

    private static int findGCD(int number1, int number2) 
     {
        if(number1 == 0 && number2 == 0)
        {
             throw new IllegalArgumentException("GCD of (" + number1 +") and (" + number2 +")is undefined.");
        }
        //base case
        if(number2 == 0)
        {
            return Math.abs(number1);
        }
        return findGCD(number2, number1%number2);
    } 
    public static void main(String[] args) 
    {
        //Enter two number whose GCD needs to be calculated.     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number to find GCD");
        int number1 = scanner.nextInt();
        System.out.println("Please enter second number to find GCD");
        int number2 = scanner.nextInt();
     
        System.out.println("GCD of two numbers " + number1 +" and " 
                           + number2 +" is :" + findGCD(number1,number2));
    }
    
}
