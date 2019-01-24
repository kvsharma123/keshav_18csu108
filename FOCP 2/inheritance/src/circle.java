class circle
{
	private double radius;
	private string colour;
	public circle()
	{
	  this.radius = 1.0;
	  this.colour ="red";
	}

	public circle(double r , string c)
	{
	   this.radius = r;
	   this.colour = c;
	}
	public circle(double r)
	{
		this.radius = r;
		this.colour = "red";
	}
	public double getradius()
	{
		return radius;
	}
	public double setradius(double r)
	{
		this.radius = r;
	}
	public double getcolour()
	{
		return colour;
	}
	public double setcolour(double c)
	{
		this.colour = c;
	}
	public double getArea()
	{
		return 3.14*r*r
	}
}