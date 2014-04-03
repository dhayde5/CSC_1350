/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapp13;
import java.util.*;
/**
 *
 * @author dirty_000
 */
public class ComplexTester 
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter the real and imaginary part of the first complex number-> ");
        Complex z1 = new Complex(cin.nextDouble(),cin.nextDouble());
        System.out.print("Enter the real and imaginary part of the second complex number-> ");
        Complex z2 = new Complex(cin.nextDouble(),cin.nextDouble());		
        System.out.print("Enter the real and imaginary part of the third complex number-> ");
        Complex z3 = new Complex(cin.nextDouble(),cin.nextDouble());		
        System.out.println();
        System.out.printf("z1 = %s%n",z1);
        System.out.printf("z2 = %s%n",z2);
        System.out.printf("z3 = %s%n",z3);
        System.out.println();
        System.out.printf("z1 x (z2 + z3) / z2 = %s%n",z1.multiply(z2.add(z3)).multiply(z2.inverse()));
        System.out.printf("z1 x conj(z1) =  = %s%n",z1.multiply(z1.conjugate()));
        System.out.printf("conj(z1 x z2) and conj(z1) x conj(z2) are ");
        if (z1.multiply(z2).conjugate().equals(z1.conjugate().multiply(z2.conjugate())))
           System.out.printf("equal.%n");
        else
           System.out.printf("not equal.%n");
    }
}