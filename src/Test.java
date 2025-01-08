
//Simple Exception Handling;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Enter Your First Number:");
		a=sc.nextInt();
		
		System.out.println("Enter Your Second Number:");
		b=sc.nextInt();
		
		try
		{
			int c=a/b;
			
			System.out.println("Result:"+c);
		}
		
		catch(Exception y)
		{
			System.out.println("Divide By Zero");
			
			try
			{
				System.out.println("Again Enter Your First Number:");
				a=sc.nextInt();
				
				System.out.println("Again Enter Your Second Number:");
				b=sc.nextInt();
				
				int c=a/b;
				
				System.out.println("Result:"+c);
			}
			
			catch(Exception y1 )
			{
				System.out.println("Divide By Zero");
			}
		}
		
		System.out.println("Hello Yash");
		
	}

}
