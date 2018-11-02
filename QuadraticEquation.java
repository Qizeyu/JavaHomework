import java.lang.Math;
import java.util.Scanner;

public class QuadraticEquation
{
	private double a;
	private double b;
	private double c;
	public QuadraticEquation(double a,double b,double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getA()
	{
		return a;
	}
	public double getB()
	{
		return b;
	}
	public double getC()
	{
		return c;
	}
	public double getDiscriminane()
	{
		return b*b-4*a*c;
	}
	public double getRoot1()
	{
		if(this.getDiscriminane()>=0)
			return ((-b-Math.pow(getDiscriminane(),0.5))/(2*a));
		else
			return 0;
	}	
	public double getRoot2()
	{
		if(this.getDiscriminane()>=0)
			return ((-b+Math.pow(getDiscriminane(),0.5))/(2*a));
		else
			return 0;
	}
	public static void main(String[] args) {
		System.out.println("请输入a，b，c的值：");
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		QuadraticEquation qua = new QuadraticEquation(a,b,c);
		if(qua.getDiscriminane()>0)
		{
			System.out.println("算式的两个根为："+qua.getRoot1()+" , "+qua.getRoot2());

		}
		else if(qua.getDiscriminane()==0)
		{
			System.out.println("算式的根为："+qua.getRoot1());
		}
		else
			System.out.println("The equation has no roots");
		
	}

}