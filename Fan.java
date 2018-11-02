public class Fan{
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST   = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	public Fan()
	{

	}
	public void setSpeed(int speed)
	{
		if(speed>3||speed<1)
			System.out.println("速度只能是1、2、3档，请重新输入");
		else
			this.speed = speed;
	}
	public void setON(boolean t)
	{
		on = t;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public int getSpeed()
	{
		return speed;
	}
	public boolean getON()
	{
		return on;
	}
	public double getRadius()
	{
		return radius;
	}
	public String getColor()
	{
		return color;
	}
	public String toString()
	{
		if(this.on==true)
		{
			return "fan's speed = "+this.getSpeed()+",color = "+this.getColor()+",radius = "+this.getRadius();
		}
		else
		{
			return "fan is off,"+"color = "+this.getColor()+",radius = "+this.getRadius();
		}
	}
	public static void main(String[] args) {
		Fan f1  = new Fan();
		Fan f2  = new Fan();
		f1.setSpeed(3);
		f1.setRadius(10);
		f1.setColor("yellow");
		f1.setON(true);
		f2.setSpeed(2);
		f2.setRadius(5);
		f2.setColor("blue");
		f2.setON(false);
		System.out.println(f1.toString());
		System.out.println(f2.toString());

	}



}