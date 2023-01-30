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
/*import java.lang.*;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		int i,j,num,de_nu;
		
		int odd[],arr[];
		
		odd = new int[20];
		
		System.out.print("Total number odd numbers to be print:");
		num=sc.nextInt();
		
		System.out.print("how many numbers to be delete:");
		de_nu=sc.nextInt();
		
		System.out.print("Enter the numbers to be delete:");

        for ( i = 0; i < de_nu; i++)  
        {  
            odd[i]=sc.nextInt();
            
        } 
        for(i=1;i<=(num+de_nu);i++)
		{
		    j=(2*i-1);
		    
		    if(j== odd[i])
		    {
		        System.out.print("0");
		        
		    }
		    else
		    {
		        System.out.print(j);
		    }
		}
	}
}
*/
