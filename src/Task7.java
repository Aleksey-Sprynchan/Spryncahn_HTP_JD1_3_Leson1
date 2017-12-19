import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		
		//Задать число (ввести с клавиатуры число)  от -9 до 9. 
		//Определить является ли введенное число чётным положительным  (использовать класс Scanner).
		
		System.out.println("Enter an integer number from -9 to 9:");
		Scanner userInput = new Scanner(System.in);

		int inputNumber = userInput.nextInt();

		if (inputNumber >= -9 && inputNumber <= 9) {
			System.out.println("You number is " + inputNumber);
			if (inputNumber >= 0) {
				System.out.println(inputNumber + " is positive");
			} else {
				System.out.println(inputNumber + " is negative");

			}
			if (inputNumber % 2 == 0) {
				System.out.println(inputNumber + " is even");
			} else {
				System.out.println(inputNumber + " is odd");
			}
		} else {
			System.out.println("You entered wrong number");
		}

	}

}
