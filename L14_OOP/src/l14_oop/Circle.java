package l14_oop;

/*
* objects & constructors example, usually used to initialise values when creating instance
*/
public class Circle {
    private double radius;
    private String color; //java uses American spelling...
    private boolean filled;
    
    /*constructor method: "default constructor" or "No argument constructor" which doesnt accept arguments
    --- This method is called when an Object is created ---*/  
    public Circle(){ 
        radius =15;
        color = "pink";
        filled = true;
    } //with default values for new object instances
    
    /*--- constructor: to accept arguments ---*/
    public Circle(double r, String c, boolean f){ 
        radius = r;
        color = c;
        filled = f;
    }
    
    double findArea() {
        return (radius*radius*3.14159);
    }
    
    /*--- Getter / accessor methods ---*/
    public double getRadius(){
        return radius;
    }
    
    public String getColor(){
        return color;
    }
    
    public boolean getFilled(){
        return filled;
    }
    
    /*--- Setter methods allow update values for object --- */
    public void setRadius(double newRadius){
        radius = newRadius;
    }
    public void setColor(String newColor){
        color = newColor;
    }
     public void setFilled(boolean newFilled){
        filled = newFilled;
    }
     
     //NB Passing objects to methods Modifiers/Accessors 
     // Java treats objects different to primitive types
     // primitive types (int or doubles) by value
     //values are unaffected by method, ie. 'n' passed into method, loops until complete, 
     // when it's finished the 'n' (ojbect's radius) value is where it was last accessed.
     // VS pass by value for Object type (a reference)
     // see Slide26 - 29
}// end Circle class
