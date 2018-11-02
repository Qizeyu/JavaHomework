import java.util.Scanner;
import java.lang.Math;
public class Main{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double side  = in.nextDouble();
		wubianxing wu = new wubianxing(side);
		System.out.printf("%.4f\n",wu.getArea());
		// if(wu.getLength()%1==0)
		// {
			// System.out.println((int)wu.getLength());
		// }
		// else
			// System.out.println(wu.getLength());
		 System.out.println(new DecimalFormat("#.####").format(wu.getLength()));
	}
	
}
class wubianxing{
   double side;
  public wubianxing(double side)
	{
		this.side  = side;
	}
	public double getLength()
	{	double length;

		length = 5*side;
		return length;


	}
	public double getArea()
	{
		double S;
		S = (5*side*side)/(4*Math.tan(Math.PI/5));
		return S;
	}
}