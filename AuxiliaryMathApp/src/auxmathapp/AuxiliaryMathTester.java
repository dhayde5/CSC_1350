/**
 * @file AuxiliaryMathTester.java
 * @author Dustin Hayden
 * @date 04-03-2014
 * Description: Tests the AuxiliaryMath class (see AuxiliaryMath.java).
 * Course: CSC1350 Section 1
 * pawsID: dhayde5
 * Project #: 4
 * Instructor: Dr. Duncan
 */

package auxmathapp;
import java.util.Scanner;

public class AuxiliaryMathTester 
{
    public static void main(String[] args) 
    {
        int option;
        Scanner s = new Scanner(System.in);
        do
        {
            System.out.println(" BASIC MATHEMATICS APPLICATION");
            System.out.println("===============================");
            System.out.println("Greatest Common Divisior....[1]"); 
            System.out.println("Least Common Multiple.......[2]"); 
            System.out.println("Factorial...................[3]"); 
            System.out.println("Fibonacci Number............[4]"); 
            System.out.println("Perfect Number..............[5]"); 
            System.out.println("Prime Number................[6]"); 
            System.out.println("EXIT........................[0]");
            System.out.println();
            System.out.print("Select an option -> ");
            option = s.nextInt();
            switch(option)
            {
                case 1: System.out.print("Enter two integers -> ");
                        int a1 = s.nextInt();
                        int b1 = s.nextInt();
                        System.out.printf("GCD(%d,%d) = %d%n", a1, b1, AuxiliaryMath.gCD(a1, b1));
                        System.out.println();
                        break;
                
                case 2: System.out.print("Enter two integers -> ");
                        int a2 = s.nextInt();
                        int b2 = s.nextInt();
                        System.out.printf("LCM(%d,%d) = %d%n", a2, b2, AuxiliaryMath.lCM(a2, b2));
                        System.out.println();
                        break;    
                
                case 3: System.out.print("Enter an integer -> ");
                        int a3 = s.nextInt();
                        System.out.printf("%d! = %d%n", a3, AuxiliaryMath.factorial(a3));
                        System.out.println();
                        break;    
                
                case 4: System.out.print("Enter an integer -> ");
                        int a4 = s.nextInt();
                        System.out.printf("Fibonacci(%d) = %d%n", a4, AuxiliaryMath.fibonacci(a4));
                        System.out.println();
                        break; 
                
                case 5: System.out.print("Enter an integer -> ");
                        int a5 = s.nextInt();
                        if (AuxiliaryMath.isPerfect(a5)) 
                        {
                            System.out.printf("%d is a perfect number.%n", a5);
                        }
                        else 
                        {
                            System.out.printf("%d is not a perfect number.%n", a5);
                        }
                        System.out.println();
                        break;
                
                case 6: System.out.print("Enter an integer -> ");
                        int a6 = s.nextInt();
                        if (AuxiliaryMath.isPrime(a6)) 
                        {
                            System.out.printf("%d is a prime number.%n", a6);
                        }
                        else 
                        {
                            System.out.printf("%d is a composite number.%n", a6);
                        }
                        System.out.println();
                        break;
                
                case 0: System.out.println("Goodbye!");
                        break;                    
                
                default: System.out.println("Invalid option...try again.");
                        System.out.println();
            }
        } while(option != 0);
    }
}