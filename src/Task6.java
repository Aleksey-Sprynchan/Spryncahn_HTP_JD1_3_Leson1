import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		// Task 6
		// Задать число (ввести с клавиатуры число) от 0 до 9.
		// Определить является ли введенное число чётным (использовать класс Scanner).

		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter an integer number from 0 to 9:");
		int inputNumber = inputScanner.nextInt();
		System.out.println("You number is " + inputNumber);
		if (inputNumber % 2 == 0) {
			System.out.println(inputNumber + " is even number");
		} else {
			System.out.println(inputNumber + " is odd number");
		}

	}
}
