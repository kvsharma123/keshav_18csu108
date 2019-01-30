
import java.lang.Exception;
class nulll
{
	public static void main(String args[])
	{
		try
		{
			nulll reference=new nulll();
			reference=null;
			reference.method();

		}
		catch(NullPointerException e)
		{
			System.out.println(e);

		}
		void method()
		{
			System.out.println("error")
		}
	}
}