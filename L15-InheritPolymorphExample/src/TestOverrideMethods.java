
/**
 *
 * @author DragonDream
 */
public class TestOverrideMethods {
    
    public static void main (String[] args) {
        Cylinder myCylinder = new Cylinder(5.0, 2.0);
        System.out.println("The length is : " + myCylinder.getLength());
        System.out.println("The radius is : " + myCylinder.getRadius());
        System.out.println("The surface area is : " + myCylinder.findArea());
        System.out.println("The volume is : " + myCylinder.findVolume());

        
    } // end main method
    
    
} // end class
