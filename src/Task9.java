
import java.util.Scanner;

public class Task9 {

	// Задать полное название месяца (ввести с клавиатуры полное название месяца).
	// Определить, к какому сезону года относится данный месяц (использовать класс
	// Scanner).

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.println("Print a month (Only first letter must be capital):");
		String inputMonth = userInput.nextLine();

		if (inputMonth.equals("January") || inputMonth.equals("February") || inputMonth.equals("December")) {
			System.out.println("It's winter!");

		} else if (inputMonth.equals("March") || inputMonth.equals("April") || inputMonth.equals("May")) {
			System.out.println("It's spring!");
		} else if (inputMonth.equals("June") || inputMonth.equals("July") || inputMonth.equals("August")) {
			System.out.println("It's summer!");
		} else if (inputMonth.equals("September") || inputMonth.equals("October") || inputMonth.equals("November")) {
			System.out.println("It's Autumn!");
		} else {
			System.out.println("You entered not a month!");
		}

	}

}
