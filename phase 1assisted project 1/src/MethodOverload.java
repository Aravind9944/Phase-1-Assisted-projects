
public class MethodOverload {

	public void calculate(int a,int b) {
		System.out.println("Area of Rectangle :"+(a*b));
		

	}
	public void calculate(double r) {
		System.out.println("Area of circle :"+(3.14)*(r*r));
	}
	public void calculate(double c,double d)
	{
		System.out.println("The sum of two number :"+(c+d));
	}
	public static void main(String args[])
	{
		MethodOverload ob = new MethodOverload();
		ob.calculate(5);
		ob.calculate(2,3);
		ob.calculate(2.5,5.7);
		
	
		
	}
}

