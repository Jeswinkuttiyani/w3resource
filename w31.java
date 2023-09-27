/*
 * File        :w31.java
 * Description :To find number is positive or negative
 * Author      :Jeswin Jose
 * Date        :27/09/23
 * Version     :1.0
 */
import java.util.Scanner;
public class w31
{
public static void main (String[]args)
{
	int number;
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the number to be checked:");
	number=Sc.nextInt();
	if(number > 0)
	{
		System.out.println("the number is positive");
	}
	else if(number == 0)
	{
		System.out.println("the number is 0");
	}
	else
	{
		System.out.println("the number is negative");
	}
}
}
