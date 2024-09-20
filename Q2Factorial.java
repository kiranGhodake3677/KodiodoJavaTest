package Drive;

import java.util.Scanner;

public class Q2Factorial {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter  Factorial number=");
		int num=s.nextInt();
		boolean check=false;
		 
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
				check=true;
				
			}
		}
		if(check==true) {
			System.out.println("factors number "+num+":");
		}
		if(check==false)
		{

			System.out.println("The number is prime it has no factorial number");
		}
		

	}

}
