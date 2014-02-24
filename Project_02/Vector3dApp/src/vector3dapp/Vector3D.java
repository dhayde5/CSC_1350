package vector3dapp;

/**
 *
 * @author dhayde5
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
    
    
}
