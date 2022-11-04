package money_slots;

import snack_vending_machine.DetermineItem;
import utils.DisplayUtils;

public class NoteSlots implements MoneySlots {
	DetermineItem PriceforProductSelectedfromDetermineItem = new DetermineItem();
	public int PriceForProducSelected = PriceforProductSelectedfromDetermineItem.PriceForProducSelected;

	public int ReceiveNoteSlots() {

		String output = " Thank you for choseing notes slots \n"
				+ " Pleae Take care that we only accept this two denominations: :  20$, 50$ \n"
				+ " Please enter notes as follows: \n" + " num of 20$,num of 50$ \n" + "\n"
				+ " Example: If you would like to enter 5 fifty dollarscents  0,5 \n" + " Plese enter notes:";
		DisplayUtils.display(output);

		String userInput = DisplayUtils.getUserInput();

		String[] numberNotessInText = userInput.split(",");
		int[] TotalPaidAmount = new int[numberNotessInText.length];

		for (int index = 0; index < numberNotessInText.length; index++) {
			TotalPaidAmount[index] = Integer.parseInt(numberNotessInText[index]);
		}

		int result = TotalPaidAmount[0] * 20 + TotalPaidAmount[1] * 50;
		if (result * 100 < PriceForProducSelected) {
			DisplayUtils.display(" The deposited amount is less than required, please try again");
		}
		DisplayUtils.display(" You are Paid :  " + result + " $");
		return result * 100;
	}

	public boolean isCurrencyFake() {
		return false;
	}
}