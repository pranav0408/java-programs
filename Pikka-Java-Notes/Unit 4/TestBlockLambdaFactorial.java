import java.util.*;
interface FindFactorial
{
	public int factorial(int a);
}
class TestBlockLambdaFactorial
{
public static void main(String[] args)
  {
	FindFactorial ff=(n)->{
				int result=1;
				for(int i=n;i>=1;i--)
					result=result*i;
				return result;
			       };
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println("Facorial of"+n+"is :"+ff.factorial(n));
					
  }
}