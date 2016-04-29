import java.util.Scanner;

public class ModulusChallenges
{

		public static void main(String[] args)
			{
			runChallenge1();	
			runChallenge2();
			runChallenge3();
			runChallenge4();
			}
		public static void runChallenge1()
		{
			
			Scanner userInput = new Scanner(System.in);
			System.out.println("Write a number I will say it it is even or odd");
			int oddEven = userInput.nextInt();
			if(oddEven % 2 == 0)
				{
					System.out.println("Your number is even");
				}
			else
				{
					System.out.println("Your number is odd");
				}
			System.out.println();
		}
	
		public static void runChallenge2()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Write a year and I will say if it is a leap year");
			int year = userInput.nextInt();
			if(year % 4 == 0)
				{
					System.out.println("This year is a leap year");
				}
			else
				{
					System.out.println("This year is not a leap year");
				}
			System.out.println();
		}
	
		public static void runChallenge3()
		{
			int [] numbersArray = {2,5,-7,1,3,12,19,-16,4,20};
			for(int i = 0; i<numbersArray.length; i++)
				{
				if((i+1) % 3 ==0)
					{
						System.out.println(numbersArray[i]);
					}
				}
			System.out.println();
		}
		
		public static void runChallenge4()
		{
		for(int i=1; i<=100; i++)	
			{
				if(i % 3 != 0 && i % 5 != 0)
					{
					System.out.println(i);	
					}
				
				else if(i % 3 == 0 && i % 5 != 0)
					{
					System.out.println("Fizz");	
					}
				else if(i % 3 != 0 && i % 5 == 0)
					{
					System.out.println("Buzz");	
					}
				else
					{
					System.out.println("FizzBuzz");
					}
			}
		}
		
		
		
		
		
		
}
