/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gcd;

/**
 *
 * @author dirty_000
 */
public class ClassGCD 
{
     private static int findGCD(int number1, int number2) 
     {
        //base case
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2, number1%number2);
    } 
}
