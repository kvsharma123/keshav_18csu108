class Box1
{
	double width;
	double height;
	double depth;
	Box1(double w,double h,double d)
	{
		this.width=w;
		this.height=h;
		this.depth=d;
	}
    Box1()
    {
    	width=1;
    	height=2;
    	depth=3;
    }
	
    double volume()
    {
       double volume = height*depth*width;
       return volume;
    }
 }
class BoxDemo1
{
	public static void main(String[] args)
	{
	Box1 b=new Box1();
	double vol=b.volume();
	System.out.println(vol);
    }
}
