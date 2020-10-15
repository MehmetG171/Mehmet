package PackageChapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class C1114 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		System.out.println("Enter five integers for list1:");
		for (int i = 0; i < 5; i++) {
			list1.add(input.nextInt());
		}

		System.out.println("Enter five integers for list2:");
		for (int i = 0; i < 5; i++) {
			list2.add(input.nextInt());
		}

		System.out.println(union(list1, list2));

		input.close();
	}

	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> union = new ArrayList<>();
		for (int i = 0; i < list1.size(); i++) {
			union.add(list1.get(i));
		}
		for (int i = 0; i < list2.size(); i++) {
			union.add(list2.get(i));
		}
		return union;
	}
}
