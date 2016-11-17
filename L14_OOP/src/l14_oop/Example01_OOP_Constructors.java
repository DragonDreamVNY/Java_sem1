package l14_oop;

/**
 *
 * @author DragonDream
 * Circle Object and Class example
 * note Circle class is in same project package so no need for Import
 * constructor has same name as class, in this case it is Circle
 * /method overloading, different methods with the same name
 * different in terms of parameters and profile (types and number of parameters they accept
 */
public class Example01_OOP_Constructors {

    /*Main method*/
    public static void main(String[] args) {
        Circle c1 = new Circle(25.5, "white", true); //c1 is created using constructor object Circle
        Circle c2 = new Circle(26.6,"blue", false); //NB params must be in the correct order as in the Constructor(x,y,z)
        Circle c3 = new Circle(27.7, "red", true); 
        Circle c4 = new Circle(); //unless you create a different constructor(x,y)
           
        System.out.println(c1.getRadius() + " " + c1.getColor() + " " + c1.getFilled()); //not considered good practice to access isntance variables with .notation/qualifier
        System.out.println(c2.getRadius() + " " + c2.getColor() + " " + c2.getFilled()); //ie c1.radius = somevalue...
        System.out.println(c3.getRadius() + " " + c3.getColor() + " " + c3.getFilled()); // should make variables in class 'private'
        System.out.println(c4.getRadius() + " " + c4.getColor() + " " + c4.getFilled()); //then from accessor method get.
        
         // c2.color = "red";  can't assign value to this instance, read only property for method
         //need to provide Setter methods
        
        c2.setColor("red");
         
        System.out.println(c1.findArea());
        System.out.println(c2.findArea());
        System.out.println(c3.findArea());
        System.out.println(c4.findArea());

        
    } // end main mathod
    
}// end class
