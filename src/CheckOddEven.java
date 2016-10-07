import java.util.Scanner;
public class CheckOddEven {
	public static void main(String[] args) {
		int num1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a integer:");
		num1 = scanner.nextInt();
		
		if(num1%2 == 0)
		{
			System.out.print("The input integer is Even Number.");
		}
		else
		{
			System.out.print("The input integer is Odd Number.");
		}
		scanner.close();
	}
}
