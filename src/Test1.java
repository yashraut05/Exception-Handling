import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a[]= new int [3];
		
		
		try{
			System.out.println("Enter Your First Number:");
			a[1]=Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Your Second Number:");
			a[2]=Integer.parseInt(sc.nextLine());
			
			a[0]=a[1]/a[2];
			
			System.out.println("Result:"+a[0]);
			System.out.println();
			
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("Sorry Error 777:"+e);
			System.out.println("Error Msg "+e.getMessage());
			System.out.println();
			
			try
			{
				System.out.println("Again Enter Your First Number:");
				a[1]=Integer.parseInt(sc.nextLine());
				
				System.out.println("Again Enter Your Second Number:");
				a[2]=Integer.parseInt(sc.nextLine());
				
				a[0]=a[1]/a[2];
				
				System.out.println("Result:"+a[0]);
				
				
			}
			
			catch(NumberFormatException e1)
			{
				System.out.println("Sorry Error 777:"+e);
				System.out.println("Error Msg "+e.getMessage());
			}
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Sorry Error 888:"+e);
			System.out.println();
			
			
		}
		
		catch(Exception e)
		{
			System.out.println("Sorry Error 999:"+e);
			System.out.println();
				
		}
		
		finally{
			System.out.println("Imp Code");
		}
		
		System.out.println("Hiee Yash");
		
		
		

	}

}
