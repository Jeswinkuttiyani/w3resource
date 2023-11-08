import java.util.Scanner;
public class Shapeinterface {
	public static void main(String[]args){
rectangle r1=new rectangle();
circle c1=new circle();
triangle t1=new triangle();
r1.getsarea();
c1.getsarea();
t1.getsarea();

}
}
interface Shape{
	Scanner sc=new Scanner(System.in);
	public void getsarea();
}
class rectangle implements Shape{
public void getsarea()
{
	System.out.println("enter the length and breadth of rectangle");
	int length=sc.nextInt();
	int  breadth=sc.nextInt();
	int area= length*breadth;
	System.out.println("Area of rectangle ="+area);
}
}
class circle  implements Shape{
	public void getsarea()
	{
		System.out.println("enter the radius of circle ");
		int radius=sc.nextInt();
		double area=3.14*radius*radius;
		System.out.println("Area of circle="+area);
	}
}
class triangle  implements Shape{
	public void getsarea()
	{
		System.out.println("enter the length and height of triangle");
		int length=sc.nextInt();
		int  height=sc.nextInt();
		double area= 0.5*length*height;
		System.out.println("Area of triangle="+area);
	}
	}