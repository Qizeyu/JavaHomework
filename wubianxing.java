import java.util.Scanner;
import java.lang.Math;
public class wubianxing{

	private double side;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double side  = in.nextDouble();
		wubianxing wu = new wubianxing(side);
		wu.getArea();
		wu.getLength();
		
	}
	public wubianxing(double side)
	{
		this.side  = side;
	}
	public void getLength()
	{
		System.out.println(5*side);

	}
	public void getArea()
	{
		double S;
		S = (5*side*side)/(4*Math.tan(Math.PI/5));
		System.out.printf("%.4d\n",S);
	}
}