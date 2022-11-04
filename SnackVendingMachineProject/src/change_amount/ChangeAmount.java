package change_amount;

import utils.DisplayUtils;

public class ChangeAmount {

	public static int changeAmount(int itemPrice, int coinSlots) {

		int CoinsPaid = coinSlots;
		int ProductChoosedPrice = itemPrice;

		DisplayUtils.display(" Snack Price is : " + ProductChoosedPrice + " - Paid amount is :  " + CoinsPaid);

		int ResultForChangeAmount = CoinsPaid - ProductChoosedPrice;
		if (ResultForChangeAmount > 0) {
			DisplayUtils.display(" Your change amount is : " + ResultForChangeAmount);
			return ResultForChangeAmount;
		} else if (ResultForChangeAmount == 0) {
			DisplayUtils.display("Change is 0 ! Have a nice day");
			return 0;

		} else if (ResultForChangeAmount < 0) {
			DisplayUtils.display(" Please check input amount again ");
			return -1;
		}
		return -1;
	}
}
