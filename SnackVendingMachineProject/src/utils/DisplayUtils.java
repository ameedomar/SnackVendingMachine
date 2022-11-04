package utils;

import java.util.Scanner;

public class DisplayUtils {
	public static void display(String output) {
		System.out.println(output);
	}

	public static String getUserInput() {
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}
}
