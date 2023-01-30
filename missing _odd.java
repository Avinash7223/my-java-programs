import java.lang.*;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		int i,j,num,odd;
		
		
		num=sc.nextInt();
		
		for(i=1;i<=num;i++)
		{
		    j=(2*i-1);
		    
		        if(j==7)
		        {
		            System.out.print("");
		            num++;
		        }
		        else if(j==17)
		        {
		            System.out.print("");
		            num++;
		        }
		        else if(j==23)
		        {
		            System.out.print("");
		            num++;
		        }
		        else
		        {
		            System.out.print(j);
		            
		        }
		}
		    
	}
}
