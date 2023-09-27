/*
 * File        :quadraticequation.java
 * Description :To find root of 3 number
 * Author      :Jeswin Jose
 * Date        :27/09/23
 * Version     :1.0
 */
import java.util.Scanner;
public class quadraticequation
{
	public static void main (String[]args)
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("input 1st number:");
		double a = Sc.nextDouble();
		System.out.print("Input 2nd number: ");
		double b = Sc.nextDouble();
		System.out.print("Input 3rd number: ");
		double c = Sc.nextDouble();
		
		double result = b * b - 4.0 * a * c;

		if (result > 0.0) {
		    double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
		    double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
		    System.out.println("The roots are " + r1 + " and " + r2);
		} else if (result == 0.0) {
		    double r1 = -b / (2.0 * a);
		    System.out.println("The root is " + r1);
		} else {
		    System.out.println("The equation has no real roots.");
		}
	}
	}
























