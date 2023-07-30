package exercise;

import java.util.*;

public class Table {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number to print table of that number: ");
		int number = scan.nextInt();
		scan.close();

		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " x " + i + " = " + number * i);
		}

	}
}
