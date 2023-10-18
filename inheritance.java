package w3resource;
import java.util.Scanner;
public class inheritance {
public static void main(String[]args) { 
	circle c1=new circle();
	c1.getsperimeter();
	c1.getsarea();
}
}
class shape {
	int radius;
	float area,perimeter;
	Scanner sc=new Scanner(System.in);
public void getsarea() {
}
public void getsperimeter() {
}
}
class circle extends shape {
	public void getsarea() {
		System.out.println("enter the radius");
		radius=sc.nextInt();
		area=radius*radius*3.14f;
		System.out.println("area"+area);
}
	public void getsperimeter() {
		System.out.println("enter the radius");
		radius=sc.nextInt();
		perimeter=2*3.14f*radius;
		System.out.println("perimeter:"+perimeter);
	}
}
	
	
