import java.util.Scanner;
import java.util.Random;

public class example
{
	public static void main(String []args)
	{
		Random ran = new Random();
		int num = ran.nextInt(100);
		int j = 5;
		Scanner s = new Scanner(System.in);
		System.out.println("\n \t ????????????? GUESS THE NUMBER ??????????");
		System.out.println("\n \t GENERATING RANDOM NUMBER ................");
		System.out.println("\n \t START ENTERING NUMBERS TO GUESS RIGHT ONE ");
		for (int i = 0;i<5;i++)
		{
			System.out.print("\n \t CHANCES LEFT > " +(j-i)+ "\n \t ENTER YOUR ANSWER > " );
			int ans = s.nextInt();
			if ( ans > num)
			{
				System.out.println("\n \t CLOSE ONE BUT TRY LOWER ");
			}
			if ( ans < num)
			{
				System.out.println("\n \t CLOSE ONE BUT TRY HIGHER ");
			}
			if ( ans == num)
			{
				System.out.println("\n \t HOORAY YOU GUESSED THE NUMBER ");
			}
		} 
	}
}
