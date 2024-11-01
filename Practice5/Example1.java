package Practice5;
import java.util.Scanner;

public class Example1
{
    public static void main(String[] args)
    {
	int denominator, numerator, ratio;
	Scanner scan = new Scanner(System.in);
	numerator = 5;

		try {
			denominator = scan.nextInt();
			ratio = numerator / denominator;
			System.out.println("The answer is: "+ratio);
		} catch (RuntimeException e){
			System.out.println("You cant divide it by zero!");
			e.printStackTrace();
		}

		System.out.println("Done."); // Don't move this line
	}




}
