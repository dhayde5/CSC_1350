package vector3dapp;

/**
* @file Vector3D.java
* @author Dustin Hayden
* @date 03-09-2014
* Description: Provides for a representation of a 3D vector and its methods.
* Course: CSC1350 Section 1
* pawsID: dhayde5
* Project #: 2
* Instructor: Dr. Duncan
*/

/**
 * provides for a representation of a 3D vector and its methods.
 */
public class Vector3D 
{
    /** 
     * the first component of the <code>Vector3D</code> object
     */
    private double x;
    
    /** 
     * the second component of the <code>Vector3D</code> object
     */
    private double y;
    
    /** 
     * the third component of the <code>Vector3D</code> object
     */
    private double z;
    
   /** 
     * constructs a <code>Vector3D</code> object whose components are 0
     */
    public Vector3D()
    {
        x = 0;
        y = 0;
        z = 0;
    }
    
    /** 
     * constructs a <code>Vector3D</code> object using specified values
     */
    public Vector3D(double xVal, double yVal, double zVal)
    {
        x = xVal;
        y = yVal;
        z = zVal;
    }
    
    /**
     * gives the first component of this vector
     * 
     * @return the x-component of a <code>Vector3D</code> object
     */
    public double getX()
    {
        return x;
    }
    
    /** 
     * gives the second component of this vector
     * 
     * @return the y-component of a <code>Vector3D</code> object
     */
    public double getY()
    {
        return y;
    }        
    
    /** 
     * gives the third component of this vector
     * 
     * @return the z-component of a <code>Vector3D</code> object
     */
    public double getZ()
    {
        return z;
    }
            
    /**
     * computes the sum of this vector and the specified <code>Vector3D</code> 
     * object
     * 
     * @param v <code>Vector3D</code> to be added to this vector
     * 
     * @return sum of this vector and the  
     * specified <code>Vector3D</code> object 
     */
    public Vector3D add(Vector3D v)
    {
        Vector3D sum = new Vector3D();
        sum.x = (x + v.getX());
        sum.y = (y + v.getY());
        sum.z = (z + v.getZ());
        return sum;
    }
    
    /**
     * computes the inner product of this vector and the specified <code>Vector3D</code> 
     * object
     * 
     * @param v object by which this <code>Vector3D</code> object
     * is to be multiplied
     * 
     * @return inner product of this vector and the specified <code>Vector3D</code> object
     */
    public double iProduct(Vector3D v)
    {
        double iProd = (this.x * v.getX()) + (this.y * v.getY()) + (this.z * v.getZ());
        return iProd;
    }
    
    /**
     * computes the cross product of this vector and a <code>Vector3D</code>
     * object.
     * 
     * @param v the <code>Vector3D</code> object by which this vector is to be
     * cross multiplied.
     * 
     * @return a new <code>Vector3D</code> object
     */ 
    public Vector3D xProduct(Vector3D v)
    {
        Vector3D xP = new Vector3D();
        xP.x = (y * v.getZ() - z * v.getY());
        xP.y = (z * v.getX() - x * v.getZ());
        xP.z = (x * v.getY() - y * v.getX());
        return xP;
    }
    
    /**
     * multiplies this vector by a scalar (real number)
     * 
     * @param s scalar by which this vector is to be multiplied
     * @return product of this <code>Vector3D</code> object and a
     * real number.
     */
    public Vector3D multiply(double s)
    {
        Vector3D product = new Vector3D(this.getX() * s, this.getY() * s, this.getZ() * s);
        return product;
    }
    
    /**
     * computes the length of this vector
     * 
     * @return length of this vector
     */
    public double length()
    {
        double length = Math.sqrt(
                Math.pow(this.getX(), 2) + 
                Math.pow(this.getY(), 2) +
                Math.pow(this.getZ(), 2));
        return length;
    }
    
    /**
     * computes the norm of this vector
     * 
     * @return the norm of this vector
     */
    public Vector3D norm()
    {
        Vector3D norm = new Vector3D();
        norm.x = (x / length());
        norm.y = (y / length());
        norm.z = (z / length());
        return norm;
    }
    
    /**
     * normalizes this vector
     */
    public void normalize()
    {
        double normalizeLength = this.length();
        
        this.x = (this.x / normalizeLength);
        this.y = (this.y / normalizeLength);
        this.z = (this.z / normalizeLength);
    }
    
    /**
     * computes the difference of this vector and the specified <code>Vector3D</code> 
     * object
     * 
     * @param v <code>Vector3D</code> object to be subtracted from this vector
     * 
     * @return difference of this vector and the specified <code>Vector3D</code> object
     */
    public Vector3D subtract(Vector3D v)
    {
        Vector3D diff = new Vector3D();
        diff.x = (x - v.getX());
        diff.y = (y - v.getY());
        diff.z = (z - v.getZ());
        return diff;
    }
    
    /**
     * gives a string representation of this vector in the format <x, y, z>, 
     * where x, y & z are the first, second, and third components of
     * this <code>Vector3D</code> object.
     * 
     * @return string representation of this vector in the format
     * <x, y, z>
     */
    public String toString() 
    {
        return String.format("<%.6f, %.6f, %.6f>",this.getX(),this.getY(),this.getZ());
    }  
}
