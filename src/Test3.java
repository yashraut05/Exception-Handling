class AgeNotValidException extends Exception
{
	public AgeNotValidException(String msg)
	{
		super(msg);
	}
}






class Demo
{
	void MyValid(int age) throws AgeNotValidException
	{
		if(age>18)
		{
			System.out.println("Your Age Is Valid");
		}
		
		else
		{
			throw new AgeNotValidException("Age Not Valid");
		}
	}
}









public class Test3 {

	public static void main(String[] args) throws AgeNotValidException {
		
		Demo d=new Demo();
		
		d.MyValid(19);
		
		System.out.println("IMP CODE");
	}

}
