import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		long number = scanner.nextLong();

		boolean isPrime = number > 1;

		for (long divisor = 2; isPrime && divisor <= number / divisor; divisor++) {
			if (number % divisor == 0) {
				isPrime = false;
			}
		}

		if (isPrime) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}

		scanner.close();
	}
}
