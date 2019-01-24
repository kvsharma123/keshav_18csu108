import java.util.*;
class point
{
	private double x;
	private double y;
	point()
	 {
	   this x =0;
	   this y =0;
	 }
	point(double x)
	 {
      this x = x;
      this y = 0;      
	 }
	point(double x, double y)
	 {
	    this x =x;
	    this y =y;
	 }
	public void setX (double x)
     {
        this x = x;
     }
    public double getX()
     {
        return this.x;
     }
    public double calculatedistance(Point p1, Point p2)
     {
    double distance = Math.sqrt((p1.getX - p2.getX)(p1.getX - p2.getX) + (p1.getY - p2.getY)(p1.getY - p2.getY))
    return distance;
     }
}     
    