
/**
 *
 * @author DragonDream
 */
public class Cylinder extends Circle{
    private double length;
        
        /* default constructor invokes Circle superclass */
        public Cylinder() {
            this (1.0, 1.0);
        } //end default Cylinder constructor
        
        public Cylinder(double radius, double length) {
            this(radius, "white", false, length);
        }
        
        public Cylinder(double radius, String color, boolean filled, double length){
            super(radius, color, filled);
            this.length = length;
        }
        
        public double getLength(){ return length; }
        
        public void setLength(double length) { this.length = length; }
        
        /* return surface area of cylinder */
        public double findArea(){
            return 2 * super.findArea() + (2 * getRadius() * Math.PI) * length; //this method is overiding the Circle class's findArea method
                                                                                // can only overide in subclasses
        } // end findArea
        
         public double findVolume(){
            return super.findArea() * length; //explicitly tell Java to call the findArea method from super 'Circle' Class 
                                              // this is method overiding. explicit better than implicit.
        } //end findVolume
        
         public boolean equals(Cylinder cylinder){
             return (this.getRadius() == cylinder.getRadius() )
                        && (this.length == cylinder.getLength());
         }
     
         /*override*/
} //end Cylinder Class
