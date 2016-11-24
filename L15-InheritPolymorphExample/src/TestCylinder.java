

/**
 *
 * @author DragonDream
 */
public class TestCylinder {

    public static void main(String[] args) {
        //create Cylinder object and display properties
        Cylinder myCylinder = new Cylinder (5.0, 2.0); //radius, length. Calls a constructor in Circle class for the radius
        System.out.println("The length is : " + myCylinder.getLength());
        System.out.println("The radius is : " + myCylinder.getRadius()); //JAva gors to Cylinder object ofr getRadius but doesn't see it and goes to Circle class where it finds it and returns the value for radius
        System.out.println("The volume is : " + myCylinder.findVolume());
        System.out.println("The area is : " + myCylinder.findArea());

    } //end main method
    
}// end TestCylinder class
