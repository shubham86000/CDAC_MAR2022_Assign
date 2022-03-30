//12. WJP that takes three numbers as input to calculate and print the 
average of the numbers.
import java.util.Scanner;
class Prog12
{
public static void main(String argv[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 3 numbers :");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = (a+b+c)/3;
	System.out.println("Average is :" +d);
}}