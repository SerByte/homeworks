import java.util.Scanner;


public class Main {

	public static boolean Palindrome(int num) {
		int i = num;
		int rev = 0;

		while (i > 0)
		{
			int r = i % 10;
			rev = rev * 10 + r;
			i = i/10;

		}

		return (num == rev);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num:");
		int num = scan.nextInt();

		if (Palindrome(num)) {
			System.out.println("Palindrome");
		}

		else {
			System.out.println("Not Palindrome");
		}

	}

}
