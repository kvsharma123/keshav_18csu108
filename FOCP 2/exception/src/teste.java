
import java.util.Scanner;
class teste
{
	public static void main(String args[])
	{
	Scanner scan = new Scanner(System.in);
	int age = scan.nextInt();
    
    try
    {
      if(age<25)
      throw new Exception("you cannot drink");
      else
      System.out.println("you can drink");
    }
     catch(Exception e)
     {
     System.out.println(e);
     }


        finally
        {
             System.out.println("finally block is always executed");
        }

        System.out.println("rest......");

 	}
}