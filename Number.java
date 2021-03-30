import java.util.Scanner;

public class Number {
	public void findeven()
	{
	System.out.println("enter a number");
	Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		if(no<= 100)
		{
			if(no%2==0)
			{
				System.out.println("even");
			}
			else 
			{
				System.out.println("odd");	
			}
		}
		else
		{
			System.out.println("out of range");
			
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	Number nn = new Number();
     nn.findeven();	
		
		
	}

}