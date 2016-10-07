import java.util.Scanner;
public class KeyboardScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		double num2;
		String string1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a integer:");
		num1 = scanner.nextInt();
		System.out.print("Enter a float point number:");
		num2 = scanner.nextFloat();
		System.out.print("Enter a you name:");
		string1 = scanner.next();
		
		
		System.out.printf("Hi %s, the multiplication of %d and %.5f is %.2e",string1,num1,num2,num1*num2);
		scanner.close();
	}

}
