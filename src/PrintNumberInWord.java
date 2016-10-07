import java.util.Scanner;
public class PrintNumberInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str={"one","two","three","four","five","six","seven","eight","nine"};
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a integer: ");
		num = scanner.nextInt();
		if(num <1 || num>9)
		{
			System.out.print("OTHER");
		}
		else
		{
			System.out.printf("%s",str[num-1]);
		}
		scanner.close();
	}

}
