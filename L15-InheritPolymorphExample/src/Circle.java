
/**
 *
 * @author DragonDream
 */
public class Circle extends GeometricObject{
    
    private double radius;
    
    public Circle(){
        this (1.0);
    }// end default constructor Circle
    
    public Circle (double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    } //end constructor Circle (double)
    
    /*-- get --*/
    public double getRadius(){ return radius; }
    /*-- set --*/
    public void setRadius(double radius) { this.radius = radius; }
    
    /* findArea method from GeometricObject */
    public double findArea(){
        return radius * radius * Math.PI;
    } //end findArea() method, forced to implement because they are in Geometric Object class.
  
    /*implement findPerimeter method defined in Geometric Object*/
} // end Circle Class
