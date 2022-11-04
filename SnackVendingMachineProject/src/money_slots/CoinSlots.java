package money_slots;

import snack_vending_machine.DetermineItem;
import utils.DisplayUtils;

public class CoinSlots implements MoneySlots {
	public int PriceForProducSelected = DetermineItem.PriceForProducSelected;

	public int ResultForPaidAmout = 2;
	public int result;

	public int ReceiveCoinSlots() {
		String output = " Thank you for choseing coins slot.\n"
				+ " Pleae Take care that we only accept this four denominations: : 10c, 20c, 50c, 100c\n"
				+ " Please enter coins as follows: \n"
				+ " num of 10 cents coins,num of 20 cents coins,num of 50 cents coins,num of 100 cents coins \n" + "\n"
				+ " Example: If you would like to enter 2 ten cents coins: 0,2,0,0 \n" + " Plese enter coins: \n";
		DisplayUtils.display(output);

		String userInput = DisplayUtils.getUserInput();

		String[] numberCoinsInText = userInput.split(",");
		int[] TotalPaidAmount = new int[numberCoinsInText.length];

		for (int index = 0; index < numberCoinsInText.length; index++) {
			TotalPaidAmount[index] = Integer.parseInt(numberCoinsInText[index]);
		}

		result = TotalPaidAmount[0] * 10 + TotalPaidAmount[1] * 20 + TotalPaidAmount[2] * 50 + TotalPaidAmount[3] * 100;
		if (result < PriceForProducSelected) {
			DisplayUtils.display(" The deposited amount is less than required, please try again");
			ResultForPaidAmout = result;
		}
		DisplayUtils.display(" You are Paid :  " + result + " Cents ");
		ResultForPaidAmout = result;

		return ResultForPaidAmout;
	}

	public boolean isCurrencyFake() {
		return false;
	}
}
