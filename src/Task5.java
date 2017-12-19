import java.util.Scanner;

public class Task5 {
	
	//Задать число (ввести с клавиатуры число) от 0 до 9. 
	//Программа должна вывести название цифры (использовать класс Scanner).

	public static void main(String[] args) {

		Scanner userInputScanner = new Scanner(System.in);
		System.out.println("Enter a number fron 0 to 9:");
		String userInputNumber = userInputScanner.nextLine();

		switch (userInputNumber) {
		case "0":
			System.out.println("Your number is ZERO");
			break;
		case "1":
			System.out.println("Your number is ONE");
			break;
		case "2":
			System.out.println("Your number is TWO");
			break;
		case "3":
			System.out.println("Your number is THREE");
			break;
		case "4":
			System.out.println("Your number is FOUR");
			break;
		case "5":
			System.out.println("Your number is FIVE");
			break;
		case "6":
			System.out.println("Your number is SIX");
			break;
		case "7":
			System.out.println("Your number is SEVEN");
			break;
		case "8":
			System.out.println("Your number is EIGHT");
			break;
		case "9":
			System.out.println("Your number is NINE");
			break;
		default:
			System.out.println("You entered wrong number or not a number!");
			break;

		}

	}

}
