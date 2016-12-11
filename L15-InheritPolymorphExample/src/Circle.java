
/**
 *
 * @author DragonDream
 */
public class Circle{
    
    private double radius;
    
    public Circle(){
        radius =  1.0;
    }// end default constructor Circle
    
    public Circle (double r){
        radius = r;
    } //end constructor Circle (double)
    
    /*-- get --*/
    public double getRadius(){ return this.radius; }
    /*-- set --*/
    public void setRadius(double radius) { this.radius = radius; }
    
    /* findArea method from GeometricObject */
    public double findArea(){
        return radius * radius * Math.PI;
    } //end findArea() method, forced to implement because they are in Geometric Object class.
  
    /*implement findPerimeter method defined in Geometric Object*/
} // end Circle Class
