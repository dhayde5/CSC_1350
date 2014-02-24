package secondrectangle2dtester;
import java.awt.geom.*;
/**
 *
 * @author Dustin Hayden
 */
public class SecondRectangle2DTester 
{

    public static void main(String[] args) 
    {
        Rectangle2D.Double big = new Rectangle2D.Double(220, 240, 200, 100);
        Rectangle2D.Double small = new Rectangle2D.Double((big.getX() + big.getHeight() / 5), (big.getY() + big.getHeight() / 5), (big.getWidth() - big.getWidth() / 5), (big.getHeight() - big.getWidth() / 5));
        double bigArea = (big.getWidth() * big.getHeight());
        double smallArea = (small.getWidth() * small.getHeight());
        double shadedArea = (bigArea - smallArea);
        System.out.println();
        System.out.println("After Creating the First and Second Rectangles:");
        System.out.println("The area of the path between the rectangles is " + shadedArea + ".");
        System.out.println("The coordinates of the corners of the second rectangle are");
        System.out.print("{(" + small.getX() + "," + small.getY() + ")");
        System.out.print(",(" + (small.getX() + small.getWidth()) + "," + small.getY() + ")");
        System.out.print(",(" + (small.getX() + small.getWidth()) + "," + (small.getY() + small.getHeight()) + ")");
        System.out.println(",(" + small.getX() + "," + (small.getY() + small.getHeight()) + ")}.");
        small.setRect((big.getX() - small.getWidth()), (big.getY() + big.getHeight()), small.getWidth(), small.getHeight());
        double perimeterSmall = (2 * (small.getWidth() + small.getHeight()));
        System.out.println();
        System.out.println("After Moving the Second Rectangle:");
        System.out.println("The perimeter of the second rectangle is " + perimeterSmall + ".");
        System.out.println("The coordinates of the corners of the second rectangle are");
        System.out.print("{(" + small.getX() + "," + small.getY() + ")");
        System.out.print(",(" + (small.getX() + small.getWidth()) + "," + small.getY() + ")");
        System.out.print(",(" + (small.getX() + small.getWidth()) + "," + (small.getY() + small.getHeight()) + ")");
        System.out.println(",(" + small.getX() + "," + (small.getY() + small.getHeight()) + ")}.");
        small.setRect(small.getX(), small.getY(), (small.getWidth() / 2), (small.getHeight() / 2));
        double perimeterSmallHalved = (2 * (small.getWidth() + small.getHeight()));
        System.out.println();
        System.out.println("After Halving the Width and Height of the Second Rectangle:");
        System.out.println("The perimeter of the second rectangle is " + perimeterSmallHalved + ".");
        System.out.println("The coordinates of the corners of the second rectangle are");
        System.out.print("{(" + small.getX() + "," + small.getY() + ")");
        System.out.print(",(" + (small.getX() + small.getWidth()) + "," + small.getY() + ")");
        System.out.print(",(" + (small.getX() + small.getWidth()) + "," + (small.getY() + small.getHeight()) + ")");
        System.out.println(",(" + small.getX() + "," + (small.getY() + small.getHeight()) + ")}.");
        
        
        

    }
    
}
