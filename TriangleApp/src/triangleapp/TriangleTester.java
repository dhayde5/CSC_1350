/**
 * @file TriangleTester.java
 * @author Dustin Hayden
 * @date 03-19-2014
 * Description: 
 * Course: CSC1350 Section 1
 * pawsID: dhayde5
 * Project #: 3
 * Instructor: Dr. Duncan
 */

package triangleapp;
import java.awt.geom.Point2D;
import java.util.Scanner;

/**
 * Client program to test the Triangle class (see Triangle.java).
 */

public class TriangleTester 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the x- and y- coordinates of first vertex> ");
        int vertA_x = s.nextInt();
        int vertA_y = s.nextInt();
        
        System.out.print("Enter the x- and y- coordinates of second vertex> ");
        int vertB_x = s.nextInt();
        int vertB_y = s.nextInt();
        
        System.out.print("Enter the x- and y- coordinates of third vertex> ");
        int vertC_x = s.nextInt();
        int vertC_y = s.nextInt();
        
        Point2D.Double vertA = new Point2D.Double(vertA_x, vertA_y);
        Point2D.Double vertB = new Point2D.Double(vertB_x, vertB_y);
        Point2D.Double vertC = new Point2D.Double(vertC_x, vertC_y);
      
        Triangle triangle = new Triangle(vertA, vertB, vertC);
        
        System.out.println();
        System.out.println("The triangle you just created is " + triangle + ".");
        
        double perimeter = triangle.getLengthA() + triangle.getLengthB() + triangle.getLengthC();
        double halfPerimeter = perimeter / 2.0;
        
        System.out.printf("Perimeter = %.5f\n", perimeter);
        
        System.out.printf("Area      = %.5f\n", 
                Math.sqrt(halfPerimeter * 
                         (halfPerimeter - triangle.getLengthA()) * 
                         (halfPerimeter - triangle.getLengthB()) * 
                         (halfPerimeter - triangle.getLengthC())));
        
        System.out.println("Classification:");
        
        System.out.print("Right:       ");
        if (triangle.isRight()) 
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
        System.out.print("Isosceles:   ");
        if (triangle.isIsosceles())
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
        System.out.print("Scalene:     ");
        if (triangle.isScalene())
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
        System.out.print("Equilateral: ");
        if (triangle.isEquilateral())
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
        System.out.print("Enter the new x- and y- coordinates of second vertex> ");
        vertB_x = s.nextInt();
        vertB_y = s.nextInt();
        
        // TODO: Why is this necessary? Why doesn't it just flow back to the first vertB when I reassign
        // vertB_X and vertB_y?
        Point2D.Double vertB2 = new Point2D.Double(vertB_x, vertB_y);
       
        Triangle triangle2 = new Triangle(vertA, vertB2, vertC);
        
        System.out.println();
        System.out.println("After modifying the second vertex the triangle is " + triangle2 + ".");
        
        perimeter = triangle2.getLengthA() + triangle2.getLengthB() + triangle2.getLengthC();
        
        // TODO: Why is this necessary? Why doesn't it just flow through when I change perimeter?
        halfPerimeter = perimeter / 2.0;
        
        System.out.printf("Perimeter = %.5f\n", perimeter);
        
        System.out.printf("Area      = %.5f\n", 
                Math.sqrt(halfPerimeter * 
                         (halfPerimeter - triangle2.getLengthA()) * 
                         (halfPerimeter - triangle2.getLengthB()) * 
                         (halfPerimeter - triangle2.getLengthC())));
        
        System.out.println("Classification:");
        
        System.out.print("Right:       ");
        if (triangle2.isRight()) 
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
        System.out.print("Isosceles:   ");
        if (triangle2.isIsosceles())
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
        System.out.print("Scalene:     ");
        if (triangle2.isScalene())
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
        System.out.print("Equilateral: ");
        if (triangle2.isEquilateral())
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}


