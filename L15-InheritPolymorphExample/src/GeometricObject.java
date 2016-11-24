
/**
 * Abstract Class
 * @author DragonDream
 */
public abstract class GeometricObject {
    
    private String color = "white";
    private boolean filled;
    /*need constructor although we won't be creating objects from it*/
    /*default constructor*/
    protected GeometricObject() {
    }
    
    /* Construct a Geometric Object */
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    /*-- get --*/
    public String getColor() { return color; }  
    /*-- set --*/
    public void setColor(String color) { this.color = color; }
    
    /*-- get --*/
    public boolean isFilled() { return filled; }
    /*-- set --*/
    public void setFilled(boolean filled) { this.filled = filled; }
    
    /*Abstract method findArea()*/
    public abstract double findArea(); /* is a method definition, no code here
                                       forces any classes inheriting to use the method, or it won't compile
                                       ie Circle1.findArea()
                                          rectangle1.findArea() 
                                      are both differently defined and differently implemented 
                                      */
    /*Abstract method findPerimeter()*/
    public abstract double findPerimeter();
} //end GeometricObject Class
