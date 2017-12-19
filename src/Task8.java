import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		// Task 8
		// Написать программу нахождения суммы большего и меньшего из 3х чисел.

		int g = 5;
		int h = 110;
		int f = 17;

		System.out.println("First number = " + g);
		System.out.println("Second number = " + h);
		System.out.println("Third number = " + f);

		int min = 0;
		int max = 0;
		int summinmax = 0;

		if (g < h && g < f) {
			min = g;
			if (h < f) {
				max = f;
			} else {
				max = h;
			}
		} else if (h < g & h < f) {
			min = h;
			if (g < f) {
				max = f;
			} else {
				max = g;
			}
		} else if (f < g & f < h) {
			min = f;
			if (g < h) {
				max = h;
			} else {
				max = g;
			}

		}

		summinmax = min + max;

		System.out.println("Min number = " + min);
		System.out.println("Max number = " + max);
		System.out.println("Sum of min and max = " + summinmax);

	}
}
