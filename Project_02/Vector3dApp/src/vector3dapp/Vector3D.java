package vector3dapp;

/**
 *
 * @author dhayde5
 * file: Vector3D.java
 * purpose: describes a 3D vector
 * date: March 9, 2014
 * course: CSC 1350, Section 01
 * 
 * @version 1.0
 */

/**
 * provides for a representation of a 3D vector and it's methods.
 */
public class Vector3D 
{
    // The first component.
    private double x;
    
    // The second component.
    private double y;
    
    // The third component.
    private double z;
    
   // Creates a 3-d vector whose components are 0.
    public Vector3D()
    {
        x = 0;
        y = 0;
        z = 0;
    }
    
    // Creates a 3D vector using the specified values.
    public Vector3D(double xVal, double yVal, double zVal)
    {
        x = xVal;
        y = yVal;
        z = zVal;
    }
    
    // Gives the first component.
    public double getX()
    {
        return x;
    }
    
    // Gives the second component.
    public double getY()
    {
        return y;
    }        
    
    // Gives the third component.
    public double getZ()
    {
        return z;
    }
            
    // Computes the sum of this 3D vector and the specified vector.
    public Vector3D add(Vector3D v)
    {
        Vector3D sum = new Vector3D();
        sum.x = (x + v.getX());
        sum.y = (y + v.getY());
        sum.z = (z + v.getZ());
        return sum;
    }
    
    // Computes the inner product of this vector and the specified 3D vector. 
    public double iProduct(Vector3D v)
    {
        double iProd = (this.x * v.getX()) + (this.y * v.getY()) + (this.z * v.getZ());
        return iProd;
    }
    
    //  Computes the cross product of this vector and the specified 3D vector. 
    public Vector3D xProduct(Vector3D v)
    {
        Vector3D xP = new Vector3D();
        xP.x = (y * v.getZ() - z * v.getY());
        xP.y = (z * v.getX() - x * v.getZ());
        xP.z = (x * v.getY() - y * v.getX());
        return xP;
    }
    
    // Multiplies this vector by a scalar (real number)
    public Vector3D multiply(double s)
    {
        Vector3D product = new Vector3D(this.getX() * s, this.getY() * s, this.getZ() * s);
        return product;
    }
    
    //  Computes the length of this vector.
    public double length()
    {
        double length = Math.sqrt(
                Math.pow(this.getX(), 2) + 
                Math.pow(this.getY(), 2) +
                Math.pow(this.getZ(), 2));
        return length;
    }
    
    // Computes the norm of this vector.
    public Vector3D norm()
    {
        Vector3D norm = new Vector3D();
        norm.x = (x / length());
        norm.y = (y / length());
        norm.z = (z / length());
        return norm;
    }
    
    // Normalizes this vector
    public void normalize()
    {
        double normalizeLength = this.length();
        
        this.x = (this.x / normalizeLength);
        this.y = (this.y / normalizeLength);
        this.z = (this.z / normalizeLength);
    }
    
    //  Computes the difference of this vector and the specified 3D vector. 
    public Vector3D subtract(Vector3D v)
    {
        Vector3D diff = new Vector3D();
        diff.x = (x - v.getX());
        diff.y = (y - v.getY());
        diff.z = (z - v.getZ());
        return diff;
    }
    
    //*  Gives a string representation of this vector in the format <x,y,z>
     */where x, y, and z are the first, second and third components of this 3D vector. 
    
    public String toString() 
    {
        return String.format("<%.6f, %.6f, %.6f>",this.getX(),this.getY(),this.getZ());
    }  
}
