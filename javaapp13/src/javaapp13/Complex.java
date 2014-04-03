/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapp13;

/**
 *
 * @author dirty_000
 */
public class Complex 
{
   private double real;
   private double imag;
   
   public Complex()
   {
      real = 0;
      imag = 0;
   }
   
   public Complex(double r, double i)
   {
       real = r;
       imag = i;
   }
   
   public Complex add(Complex z)
   {
      return new Complex(real+z.real,imag+z.imag);
   }
   
   public Complex conjugate()
   {
      return new Complex(real,-imag);
   }
   
   public boolean equals(Complex z)
   {
      // if(real==z.real && imag==z.imag)
      //    return true;
      // else
      //   return false;
      return real==z.real && imag==z.imag;
   }
   
   public Complex inverse()
   {
      return new Complex(real/Math.pow(modulus(),2),-imag/Math.pow(modulus(),2));
   }
   
   public double modulus()
   {
      return Math.sqrt(Math.pow(real,2)+Math.pow(imag,2));
   }

   public Complex multiply(Complex z)
   {
      return new Complex(real*z.real-imag*z.imag,real*z.imag+imag*z.real);
   }
   
   public Complex subtract(Complex z)
   {
      return new Complex(real-z.real,imag-z.imag);
   }   
   
   public String toString()
   {
      if(real==0 && imag==0)
         return String.format("0");
      else if(real==0 && imag==1)
         return String.format("i");
      else if(real==0 && imag==-1)
         return String.format("-i");
      else if(real==0)
         return String.format("%fi",imag);	
      else if(real==0 && imag<0)
         return String.format("%fi",imag);
      else if(imag==0)
         return String.format("%f",real);
      else if(imag==1)
         return String.format("%f+i",real);
      else if(imag==-1)
         return String.format("%f-i",real);
      else if(imag<0)
         return String.format("%f-%fi",real,-imag);
      else
         return String.format("%f+%fi",real,imag);   
   }   
}