import java.util.*;
class Prog7
{
	public static void main(String argv[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i= 0;i<=10; i++)
		{
			int b = a*i;
		    System.out.println(i+ " x " +a+ " = " +b);
        }
}}