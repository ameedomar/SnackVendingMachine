package money_slots;

import utils.DisplayUtils;

public class CardSlots implements MoneySlots {

	public String[] ReceiveCardSlots() {

		String output = " Thank you for choseing card slot.\n"
				+ " Thank you for choseing card slot, please enter your card details \n"
				+ " Please follow this pattern carefully \n" + " Card Holde,Card Number,CVV,Expire Date \n ";
		DisplayUtils.display(output);

		String userInput = DisplayUtils.getUserInput();

		String[] CardsInfo = userInput.split(",");
		if (CardsInfo.length != 4) {
			DisplayUtils.display("Please check card info again.");
		}
		String[] Info = { " Card Holder is : ", " Card Number is : ", " CVV Number is : ", " Expire Dats is : " };
		System.out.println(" ");
		int index = 0;
		for (String str : CardsInfo) {
			System.out.println(Info[index] + str);
			index++;
		}

		DisplayUtils.display(" ");
		DisplayUtils.display(
				" Your purchase has been successfully completed, \n Thank you for choosing us to have your snack,\n We hope you will have an entertaining snack!");

		return CardsInfo;
	}

	public boolean isCurrencyFake() {
		return false;
	}
}
