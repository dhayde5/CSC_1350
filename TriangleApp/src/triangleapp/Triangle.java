/**
 * @file Triangle.java
 * @author Dustin Hayden
 * @date 03-19-2014
 * Description: Creates user defined class Triangle and its methods.
 * Course: CSC1350 Section 1
 * pawsID: dhayde5
 * Project #: 3
 * Instructor: Dr. Duncan
 */

package triangleapp;
import java.awt.geom.Point2D;

public class Triangle 
{
    /**
     * The first vertex of the triangle.
     */
    private Point2D.Double vertexA;
    
    /**
     * The second vertex of the triangle.
     */
    private Point2D.Double vertexB;
    
    /**
     * The third vertex of the triangle.
     */
    private Point2D.Double vertexC;
    
    /**
     * Creates a triangle whose vertices are (0,0), (0,1) and (1,0).
     */
    public Triangle()
    {
       vertexA = new Point2D.Double(0, 0);
       vertexB = new Point2D.Double(0, 1);
       vertexC = new Point2D.Double(1, 0);
    }
    
     /**
     * Creates a triangle using the specific points.
     * @param point1 The first point.
     * @param point2 The second point.
     * @param point3 The third point.
     * @throws IllegalArgumentException when the specified points are collinear.
     */
    public Triangle(Point2D.Double point1, Point2D.Double point2, Point2D.Double point3)
    {
        if (point1.equals(point2) || point1.equals(point3) || point2.equals(point3))
        {
            throw new IllegalArgumentException("Two or more vertices are collinear.");
        }
        else if (point1.x == point2.x && point2.x == point3.x)
        {
            throw new IllegalArgumentException("Two or more vertices are collinear.");
        }
        else if (point1.y == point2.y && point2.y == point3.y)
        {
            throw new IllegalArgumentException("Two or more vertices are collinear.");
        }
        else if (point1.x != point2.x && point2.x != point3.x)
        {
            if ((point1.y - point2.y) / (point1.x - point2.x) == (point2.y - point3.y) / (point2.x - point3.x))
            {
                throw new IllegalArgumentException("Two or more vertices are collinear.");
            }
        }
        vertexA = point1;
        vertexB = point2;
        vertexC = point3;
    }
    
    /**
     * Changes the vertices of a triangle to the specified points.
     * @param point1 The first new point.
     * @param point2 The second new point.
     * @param point3 The third new point.
     * @throws IllegalArgumentException when the specified points are collinear.
     */
    public void setTriangle(Point2D.Double point1, Point2D.Double point2, Point2D.Double point3)
    {
        if (point1.equals(point2) || point1.equals(point3) || point2.equals(point3))
        {
            throw new IllegalArgumentException("Two or more vertices are collinear.");
        }
        else if (point1.x == point2.x && point2.x == point3.x)
        {
            throw new IllegalArgumentException("Two or more vertices are collinear.");
        }
        else if (point1.y == point2.y && point2.y == point3.y)
        {
            throw new IllegalArgumentException("Two or more vertices are collinear.");
        }
        else if (point1.x != point2.x && point2.x != point3.x)
        {
            if ((point1.y - point2.y) / (point1.x - point2.x) == (point2.y - point3.y) / (point2.x - point3.x))
            {
                throw new IllegalArgumentException("Two or more vertices are collinear.");
            }
        }
        vertexA = point1;
        vertexB = point2;
        vertexC = point3;
    }
    
    /**
     * Gives the first vertex of this triangle.
     * @return The first vertex of this triangle.
     */
    public Point2D.Double getVertexA()
    {
        return vertexA;
    }
    
    /**
     * Gives the second vertex of this triangle.
     * @return The second vertex of this triangle.
     */
    public Point2D.Double getVertexB()
    {
        return vertexB;
    }
    
    /**
     * Gives the third vertex of this triangle.
     * @return The third vertex of this triangle.
     */
    public Point2D.Double getVertexC()
    {
        return vertexC;
    }
    
    /**
     * Gives the length of the side opposite the first vertex.
     * @return The length of the side opposite the first vertex.
     */
    public double getLengthA()
    {
        return Math.sqrt(Math.pow((vertexA.x - vertexB.x), 2) + 
                Math.pow((vertexA.y - vertexB.y), 2));
    }
    
    /**
     * Gives the length of the side opposite the second vertex.
     * @return The length of the side opposite the second vertex.
     */
    public double getLengthB()
    {
        return Math.sqrt(Math.pow((vertexB.x - vertexC.x), 2) + 
                Math.pow((vertexB.y - vertexC.y), 2));
    }
    
    /**
     * Gives the length of the side opposite the third vertex.
     * @return The length of the side opposite the third vertex.
     */
    public double getLengthC()
    {
        return Math.sqrt(Math.pow((vertexA.x - vertexC.x), 2) + 
                Math.pow((vertexA.y - vertexC.y), 2));
    }
    
     /**
     * Gives a string representing this triangle in the format {(x1,y1),(x2,y2),(x3,y3)},
     * where (x1,y1) are the coordinates of the first vertex, (x2,y2) are the coordinates
     * of the second vertex, and (x3,y3) are the coordinates of the third vertex.
     * 
     * @return A string representing this triangle in the format {(x1,y1),(x2,y2),(x3,y3)},
     * where (x1,y1) are the coordinates of the first vertex, (x2,y2) are the coordinates
     * of the second vertex, and (x3,y3) are the coordinates of the third vertex.
     */
    @Override
    public String toString()
    {
        return String.format("{(%.6f,%.6f),(%.6f,%.6f),(%.6f,%.6f)}", 
            this.getVertexA().x, this.getVertexA().y, 
            this.getVertexB().x, this.getVertexB().y,
            this.getVertexC().x, this.getVertexC().y);
    }
    
    /**
     * Determines whether this triangle is an isosceles triangle.
     * @return <code>true</code> if this triangle is an isosceles triangle; otherwise, </code>false</code>.
     */
    public boolean isIsosceles()
    {
        if (this.getLengthA() == this.getLengthB())
        {
            return true;
        }
        else if (this.getLengthB() == this.getLengthC())
        {
            return true;
        }
        else return this.getLengthB() == this.getLengthC();
    }
    
     /**
     * Determines whether this triangle is an equilateral triangle.
     * @return <code>true</code> if this triangle is an equilateral triangle; otherwise, </code>false</code>.
     */
    public boolean isEquilateral()
    {
        return this.getLengthA() == this.getLengthB() && this.getLengthA() == this.getLengthC();
    }
    
    /**
     * Determines whether this triangle is a scalene triangle.
     * @return <code>true</code> if this triangle is a scalene triangle; otherwise, </code>false</code>.
     */
    public boolean isScalene()
    {
        if (this.getLengthA() == this.getLengthB())
        {
            return false;
        }
        else return this.getLengthA() != this.getLengthC();
    }
    
    /**
     * Determines whether this triangle is a right triangle.
     * @return <code>true</code> if this triangle is a right triangle; otherwise, </code>false</code>.
     */
    public boolean isRight()
    {
        if (Math.pow(this.getLengthA(), 2) == (Math.pow(this.getLengthB(), 2) + Math.pow(this.getLengthC(), 2)))
        {
            return true;
        }
        else if (Math.pow(this.getLengthB(), 2) == (Math.pow(this.getLengthA(), 2) + Math.pow(this.getLengthC(), 2)))
        {
            return true;
        }
        else return Math.pow(this.getLengthC(), 2) == (Math.pow(this.getLengthA(), 2) + Math.pow(this.getLengthB(), 2));
    }
    
}
