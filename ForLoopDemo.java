package loopstatement;

 /*For loop 
 * syntax
 * 
 * variable example=(int=i;) 
 * for(condition)
 * {
 * 	system.out.println("any"+i);
 * }
 * 
 * Rules of for loop
 * first check the for condition into the program
 * loop statement continues reflect in (value false)
 * decrement or increment in condition check (i++,i--)value in the output   
 * */
public class ForLoopDemo
{

	public static void main(String[] args) 
	{
		int i;
		for (i=0;i<10;i++)
		{
			System.out.println("print i value is : "+i);
		}
		
		int j;
		for (j=10;j>0;j--)
		{
			System.out.println("print j value is : "+j);
		}
		int k;
		for(k=5;k>1;k--)
		{
			System.out.println("print k decrement k value :"+k);
		}
		int l;
		for(l=6;l<=10;l++)
		{
			System.out.println("print decrement l value :"+l);
		}
	}
}
	


	

