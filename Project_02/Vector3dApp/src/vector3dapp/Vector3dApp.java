package vector3dapp;
import java.util.Scanner;
/**
* @file Vector3DApp.java
* @author Dustin Hayden
* @date 03-09-2014
* Description: Tests the Vector3D class
* Course: CSC1350 Section 1
* pawsID: dhayde5
* Project #: 2
* Instructor: Dr. Duncan
*/
public class Vector3dApp 
{
    public static void main(String[] args) 
    {
        // Create a scanner object
        Scanner s = new Scanner(System.in);

        // VECTOR 1 CONSTRUCTION
        System.out.println("Enter the components of the first 3-d vector-> ");        
        Vector3D vector1 = new Vector3D(s.nextDouble(), s.nextDouble(), s.nextDouble());
        
        // VECTOR 2 CONSTRUCTION
        System.out.println("Enter the components of the second 3-d vector-> ");        
        Vector3D vector2 = new Vector3D(s.nextDouble(), s.nextDouble(), s.nextDouble());
        
        // VECTOR 3 CONSTRUCTION
        System.out.println("Enter the components of the third 3-d vector-> ");        
        Vector3D vector3 = new Vector3D(s.nextDouble(), s.nextDouble(), s.nextDouble());
        
        // Print Vector 1
        System.out.println("v1 = " + vector1.toString());
        
        // Print Vector 2
        System.out.println("v2 = " + vector2.toString());
        
        // Print Vector 3
        System.out.printf("v3 = %s\n\n", vector3.toString());
        
        // Compute and display v1 + v2
        System.out.printf("v1 + v2 = %s\n\n", vector1.add(vector2).toString());
        
        // Compute and display (v2 + v3) * v1
        System.out.printf("(v2 + v3) * v1 = %.6f\n\n",
                vector1.iProduct(vector2.add(vector3)));
        
        // Compute and display v1 X (v2 - v3)
        System.out.printf("v1 x (v2 - v3) = %s\n\n",
                vector1.xProduct(vector2.subtract(vector3)).toString());
        
        // Compute and display (v2 - v3) X v1
        System.out.printf("(v2 - v3) X v1 = %s\n\n",
                vector2.subtract(vector3).xProduct(vector1).toString());
        
        // Compute and display |v1 X v2| and |v2| |v1|
        System.out.printf("|v1 x v2| = %.6f and |v2||v1| = %.6f\n\n",
                vector1.xProduct(vector2).length(), 
                vector2.length() * vector1.length()
                );
        
        // Compute and display (v1 x v2) / (|v1 x v2|)
        System.out.printf("(v1 x v2) / (|v1 x v2|) = %s\n\n",
                vector1.xProduct(vector2).multiply(1 / 
                        vector1.xProduct(vector2).length()).toString());
        
        // Compute and display v1 x (v2 + v3)
        System.out.printf("v1 x (v2 + v3) = %s\n\n",
                vector1.xProduct(vector2.add(vector3)).toString());
        
        // Compute and display (v1 x v2) + (v1 x v3)
        System.out.printf("(v1 x v2) + (v1 x v3) = %s\n\n",
                vector1.xProduct(vector2).add(vector1.xProduct(vector3)).toString());
        
        // Test the norm method
        Vector3D v1Norm = vector1.norm();
        System.out.printf("v1.norm() = %s\n\n", v1Norm);
        
        // Test the normalize method
        vector1.normalize();
        System.out.printf("v1.normalize = <%.6f, %.6f, %.6f>\n\n", 
                vector1.getX(), vector1.getY(), vector1.getZ());
    }
    
}
