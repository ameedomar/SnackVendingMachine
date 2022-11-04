package snack_vending_machine;

import change_amount.ChangeAmount;
import change_amount.ChangeStyle;
import money_slots.CardSlots;
import money_slots.CoinSlots;
import money_slots.NoteSlots;
import utils.DisplayUtils;

public class SnackMachine {
	private int itemPrice = 0;
	private int coinDeposite = 0;
	private boolean cardFlag = false;

	public void displayWelcomingMsg() {
		String output = " Hi User, You are welcomed in our vending snack machine, we hope you to enjoy your snack \n ";
		DisplayUtils.display(output);
	}

	public void displaySnackItems() {
		DisplayUtils.display(" Please choose your snack : \n");
		DisplayUtils.display(" " + "Rows#" + " " + "Column#" + "  Product Name  " + "       Price:");
		for (SnackItems product : SnackItems.values()) {
			if (product.name().length() < 7) {
				DisplayUtils.display("   " + product.getrow() + "     " + product.getcol() + "       " + product.name()
						+ "	             " + product.getprice() + " Cents");
			} else {
				DisplayUtils.display("   " + product.getrow() + "     " + product.getcol() + "       " + product.name()
						+ "	     " + product.getprice() + " Cents");
			}
		}
	}

	public void determineItem() {
		DetermineItem DetermineItemObj = new DetermineItem();
		itemPrice = DetermineItemObj.selectYourSnack();
	}

	public void statusMessage() {
		DisplayUtils.display("\n Would you like to complete this process?   plase type  Y/N only ");
		if (ProccesStatus.proccesStatus()) {
			DisplayUtils.display(" Please choose the payment method would like to use:\n" + " 1. Coin Slots" + "\n"
					+ " 2. Card Slots \n" + " 3. Notes Slots" + "\n");
			DisplayUtils.display(
					" Please Type the number for prefered method, please notice that we only accept USD currency");
		} else {
			DisplayUtils.display(" You have selected not to continuo! Hope to see you soon");
		}
	}

	public void chooseMethodToPay() {
		String userInput = DisplayUtils.getUserInput();
		int MethodToPay = Integer.parseInt(userInput);

		if (MethodToPay == 1) {
			CoinSlots coinslots = new CoinSlots();
			coinDeposite = coinslots.ReceiveCoinSlots();
		} else if (MethodToPay == 2) {
			CardSlots cardslots = new CardSlots();
			cardslots.ReceiveCardSlots();
			cardFlag = true;

		} else if (MethodToPay == 3) {
			NoteSlots noteslots = new NoteSlots();
			coinDeposite = noteslots.ReceiveNoteSlots();
		}
	}

	public void ChangeAmount() {
		if (cardFlag) {
			return;
		}
		ChangeAmount changeAmountObj = new ChangeAmount();
		ChangeStyle changeStyleObj = new ChangeStyle();

		int[] ResultforChangeStyle = changeStyleObj.changestyle(changeAmountObj.changeAmount(itemPrice, coinDeposite));
		if (ResultforChangeStyle[0] == 0 && ResultforChangeStyle[1] == 0) {
			System.out.println(" You wil have the change in this format \n [#1$, #50c, #20c, #10c] \n in order : [ "
					+ ResultforChangeStyle[2] + ", " + ResultforChangeStyle[3] + ", " + ResultforChangeStyle[4] + ", "
					+ ResultforChangeStyle[5] + " ]");
		} else {
			System.out.println(
					" You wil have the change in this format \n [#50$, #20$, #1$, #50c, #20c, #10c] \n in order : [ "
							+ ResultforChangeStyle[0] + ", " + ResultforChangeStyle[1] + ", " + ResultforChangeStyle[2]
							+ ", " + ResultforChangeStyle[3] + ", " + ResultforChangeStyle[4] + ", "
							+ ResultforChangeStyle[5] + " ]");
		}
	}
}
