package referencedatatypearguments;

/**
 *
 * @author  Karan Sharma
 * @time     Jul 23, 2013 7:55:07 AM 
 */
public class Circle {

    int radius;
    int xCordinate;
    int yCordinate;
    
    void setRadius(Circle circle, int newRadius )
    {
        circle.radius = newRadius;
    }
    
    public static void main(String[] args)
    {
        Circle myCircle = new Circle();
        System.out.println("myCircle Radius : " + myCircle.radius);
        myCircle.setRadius(myCircle, 5);
        System.out.println("myCircle Radius : " + myCircle.radius);
        
        
        
    }

}
