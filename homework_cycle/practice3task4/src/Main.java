import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter num: ");
		int num = scan.nextInt();
		int result = 0;
		for(int i = 1; i<=num; i++) {
			result += i;
		}
		System.out.printf("Result is: %s", result);

	}
}
