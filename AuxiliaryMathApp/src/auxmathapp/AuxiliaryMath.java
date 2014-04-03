/**
 * @file AuxiliaryMath.java
 * @author Dustin Hayden
 * @date 04-03-2014
 * Description: Implementation for some basic mathematical functions.
 * Course: CSC1350 Section 1
 * pawsID: dhayde5
 * Project #: 4
 * Instructor: Dr. Duncan
 */

package auxmathapp;

/**
 * Implementation for some basic mathematical functions.
 */

public class AuxiliaryMath
{   
    /**
     * Determines the GCD of the specified numbers or reports an IllegalArgumentException.
     * @param m an integer
     * @param n an integer
     * @return the GCD of the specified numbers
     * @throws java.lang.IllegalArgumentException when m and n are both 0
     */
    
    public static int gCD(int m, int n) 
    {
        if(m == 0 && n == 0)
        {
             throw new IllegalArgumentException("GCD(" + m + "," + n + ") is undefined.");
        }
  
        if(n == 0)
        {
            return Math.abs(m);
        }
        return gCD(n, m%n);
    }
    
    /**
     * Determines the LCM of the specified numbers or reports an IllegalArgumentException.
     * @param m an integer
     * @param n an integer
     * @return the LCM of the specified numbers
     * @throws java.lang.IllegalArgumentException when m and n are both 0
     */
    
    public static int lCM(int m, int n)
    {   
        if (m == 0 || n == 0)
        {
            throw new IllegalArgumentException("LCM(" + m + "," + n + ") is undefined.");
        }
        else
        {
            int lg = Math.abs(Math.max(m, n));
            int sm = Math.abs(Math.min(m, n));         
            int test;
            int i = 0;
            
            do
            {
                i++;
                test = (lg * i) % sm;
            } while (test != 0);
            return (lg * i);
        }
    }
    
    /**
     * Computes the factorial of a number or reports an IllegalArgumentException.
     * @param n an integer
     * @return the factorial of the specified numbers
     * @throws java.lang.IllegalArgumentException when the specified number is negative
     */
    
    public static int factorial(int n)
    {
        if (n < 0) 
        {
            throw new IllegalArgumentException(n + "! is undefined.");
        }
        else if (n == 0) 
        {
            return 1;
        }
        else 
        {
            int sum = 1;
            for (int i = 1; i <= n; i++) 
            {
                sum *= i;
            }
            return sum;
        }
    }
    
    /**
     * Computes the specified Fibonacci number or reports an IllegalArgumentException.
     * @param n an integer
     * @return the specified Fibonacci number
     * @throws java.lang.IllegalArgumentException when n is 0 or negative
     */
    
    public static int fibonacci(int n)
    {
        if (n <= 0) 
        {
            throw new IllegalArgumentException("Fibonacci(" + n + ") is undefined.");
        } 
        else if (n == 1) 
        {
            return 0;
        }
        else
        {
            int current = 0;
            int next = 1;     
            int i = 2;
            do 
            {                
                next += current;
                current = next - current;
                i++;
            } while (i <= n);
            return current;
        }
    }
    
    /**
     * Determines whether the specified number is a perfect number.
     * @param n an integer
     * @return <code>true</code> when the specified number is a perfect number; otherwise, <code>false</code>
     */
    
    public static boolean isPerfect(int n)
    {
        int divisor = 1;
        int sum = 0;
        
        if (n == 0) return false;
        
        for (int i = 0; i < (n / 2); i++) 
        {
            if (n % divisor == 0)
            {
                sum += divisor;
                divisor++;
            }
            else divisor++;
        }
        return (sum == n);
    }
    
    /**
     * Determines whether the specified number is a prime number.
     * @param n an integer
     * @return <code>true</code> when the specified number is a prime number; otherwise, <code>false</code>
     */
    
    public static boolean isPrime(int n)
    {
        int counter = 0;
        
        if (n <= 1) return false;
        if (n == 2) return true;
        
        for (int i = 2; i <= Math.sqrt(n); i++) 
        {
            if (n % i == 0) 
            {
                counter++;
            }
        }
        return (counter == 0);
    }
}
