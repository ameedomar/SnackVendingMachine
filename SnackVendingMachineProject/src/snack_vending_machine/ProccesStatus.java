package snack_vending_machine;

import utils.DisplayUtils;

public class ProccesStatus {
	public static boolean proccesStatus() {
		String userInput = DisplayUtils.getUserInput();

		if (userInput.equals("N") || userInput.equals("n"))
			return false;

		else if (userInput.equals("Y") || userInput.equals("y"))
			return true;
		else
			return false;
	}

}
