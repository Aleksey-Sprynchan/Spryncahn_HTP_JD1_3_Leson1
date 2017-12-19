
public class Task4One {
	
	//Написать программу калькулятор. В программе задаём 2 целых числа и знак операции (символ). 
	//В зависимости от заданного символа выполняем арифметическое действие и результат действия выводим на экран.

	public static void main(String[] args) {

		int a = -5;
		int b = 6;
		char action = '*';
		int result;

		System.out.println("First number = " + a);
		System.out.println("Second number = " + b);
		System.out.println("Action: " + action);
		switch (action) {
		case '+':
			result = a + b;
			System.out.println("Result of operation:" + result);
			break;
		case '-':
			result = a - b;
			System.out.println("Result of operation:" + result);
			break;
		case '/':
			if (b == 0) {
				System.out.println("Division by zero!");
				break;
			}
			result = a / b;
			System.out.println("Result of operation:" + result);
			break;
		case '*':
			result = a * b;
			System.out.println("Result of operation:" + result);
			break;
		}

	}
}
