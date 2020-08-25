package PackageChapter07;

import java.util.Scanner;

public class C0710 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter ten numbers:");
		double[] numbers = new double[10];

		for (int i = 0; i < 10; i++) {
			numbers[i] = input.nextDouble();
		}

		int index = indexOfSmallestElement(numbers);
		System.out.println("The index of the smallest element is " + index);

		input.close();
	}

	public static int indexOfSmallestElement(double[] numbers) {
		double smallest = numbers[0];
		int index = 0;
		for (int j = 0; j < 10; j++) {
			if (numbers[j] < smallest) {
				smallest = numbers[j];
				index = j;
			}
		}
		return index;
	}
}
