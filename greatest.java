/*
 * File        :greatest.java
 * Description :To find greatest among 3 numbers
 * Author      :Jeswin Jose
 * Date        :27/09/23
 * Version     :1.0
 */
import java.util.Scanner;
public class greatest {
	public static void main (String[]args)
	{
		int number1,number2,number3;
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the first number:");
		number1=Sc.nextInt();
		System.out.println("enter the second number:");
		number2=Sc.nextInt();
		System.out.println("enter the third number:");
		number3=Sc.nextInt();
if(number1 == number2 && number1 == number3)
{
	System.out.println("the numbers are same");
}
else if(number1>number2 && number1>number3)
{
	System.out.println("the greatest number is"+number1);
}
else if(number2>number3)
{
	System.out.println("the greatest number is"+number2);
}
else 
{
	System.out.println("the greatest number is"+number3);
}
}
}
