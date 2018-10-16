import java.util.Scanner;
import java.lang.Math;

public class Duobianxing{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入多边形的边数、边长、中心的x坐标，中心的y坐标");
		int n = input.nextInt();
		double side = input.nextDouble();
		double x = input.nextDouble();
		double y = input.nextDouble();
		Duo D1 = new Duo(n,side,x,y);
		System.out.printf("面积是%.4f\n",D1.countArea());
		System.out.printf("周长是%.4f\n\n",D1.countGirth());
		System.out.println("每个点的坐标是：");
		D1.countEveryPoint();
		// System.out.println(Math.cos(Math.PI*240/180));		
	}
}
class Duo{
	private int n;
	private double side;
	private double x;
	private double y;
	public Duo()
	{
		n=0;
		side=0;
		x=0;
		y=0;
	}
	public Duo(int n,double side,double x,double y)
	{
		this.n=n;
		this.side=side;
		this.x=x;
		this.y=y;
	}
	public void setN(int n)
	{
		this.n=n;
	}
	public void setSide(double side)
	{
		this.side=side;
	}
	public void setX(double x)
	{
		this.x=x;

	}
	public void setY(double y)
	{
		this.y=y;
	}
	public int retN()
	{
		return n;

	}
	public double retSide()
	{
		return side;
	}
	public double retX()
	{
		return x;
	}
	public double retY()
	{
		return y;
	}
	public double countGirth()
	{
		return n*side;
	}
	public double countArea()
	{
		return (n*side*side)/(4*Math.tan(Math.PI/n));
	}
	public void  countEveryPoint()
	{

		double angle = 0;
		double length  =  0;
		for(int i=0;i<n;i++)
		{
		
			double x=0;
			double y=0;

			length = side/(2*Math.cos((Math.PI/2)-(Math.PI/n)));
			if(angle%90==0)
			{
				if(angle==0)
				{
					x=this.x+side;
					y=this.y+0;
				}
				if(angle==90)
				{
					x=this.x+0;
					y=this.y+side;
					// System.out.println("asd");
				}
				if(angle==180)
				{
					x=this.x-side;
					y=this.y+0;
				} 
				if(angle==270)
				{
					x=this.x+0;
					y=this.y-side;
					// System.out.println(y);
				}
			}else if(0<angle&&angle<90)
			{
				 x=this.x+length*Math.cos(Math.PI*angle/180);
				 y=this.y+length*Math.sin(Math.PI*angle/180);
			}else if(90<angle&&angle<180)
			{
				 x=this.x-length*Math.cos((Math.PI*(180-angle)/180));
				 y=this.y+length*Math.sin((Math.PI*(180-angle)/180));
			}else if(180<angle&&angle<270)
			{
				 x=this.x-length*Math.cos(Math.PI*(angle-180)/180);
				 y=this.y-length*Math.sin(Math.PI*(angle-180)/180);
			}else if(270<angle&&angle<360)
			{ 
				 x=this.x+length*Math.cos(Math.PI*(360-angle)/180);
				 y=this.y-length*Math.sin(Math.PI*(360-angle)/180);
			}

			System.out.printf("(%.4f,%.4f)\n",x,y);
			angle+=360/n;
			// System.out.println(angle);
		}
	}

}
/**
**
*/