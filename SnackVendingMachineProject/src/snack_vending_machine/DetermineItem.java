package snack_vending_machine;

import utils.DisplayUtils;

public class DetermineItem {
	String DetetmineProduct;
	public static int PriceForProducSelected = 0;

	public static int[] DetectProduct(String DetetmineProduct) {

		String[] productRowColId = DetetmineProduct.split(",");
		int[] result = new int[productRowColId.length];

		for (int index = 0; index < productRowColId.length; index++) {
			result[index] = Integer.parseInt(productRowColId[index]);
		}
		return result;
	}

	public int selectYourSnack() {
		String userInput = DisplayUtils.getUserInput();

		DetermineItem ProductEnteredByUser = new DetermineItem();

		System.out.println(" The chosen product is : ");
		System.out.println("  ");
		int[] enterdId = SnackItems.DetectProduct(userInput);
		for (SnackItems product : SnackItems.values()) {
			if (product.getrow() == enterdId[0] && product.getcol() == enterdId[1]) {
				System.out.println(" Row #" + product.getrow() + "  Col #" + product.getcol() + "     " + product.name()
						+ "     - The Price for " + product.name() + " is  " + product.getprice() + " Cents");
				PriceForProducSelected = product.getprice();
			}
		}
		return PriceForProducSelected;
	}
}
