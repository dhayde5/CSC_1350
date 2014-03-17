package triangleapp;
import java.awt.geom.Point2D;
/**
* @file Triangle.java
* @author Dustin Hayden
* @date 03-19-2014
* Description: This class models a triangle in a plane.
* Course: CSC1350 Section 1
* pawsID: dhayde5
* Project #: 3
* Instructor: Dr. Duncan
*/

public class Triangle 
{
    /** 
     * the first vertex of the triangle
     */
    private Point2D.Double vertexA;
    
    /** 
     * the second vertex of the triangle
     */
    private Point2D.Double vertexB;
    
    /** 
     * the third vertex of the triangle
     */
    private Point2D.Double vertexC;
    
    /** 
     * creates a triangle whose vertices are (0,0), (0,1) and (1,0)
     */
    public Triangle()
    {
       vertexA = new Point2D.Double(0,0);
       vertexB = new Point2D.Double(0,1);
       vertexC = new Point2D.Double(1,0);
    }
    
    /** 
     * creates a triangle using the specified points
     */
    public Triangle(Point2D.Double point1, Point2D.Double point2, Point2D.Double point3)
    {
       vertexA = point1;
       vertexB = point2;
       vertexC = point3;  
    }
    
    public double getLengthA()
    {
        
    }
}
