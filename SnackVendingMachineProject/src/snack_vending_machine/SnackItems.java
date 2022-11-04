package snack_vending_machine;

public enum SnackItems {
	CornNuts(0, 0, 20), ItalianTaralli(0, 1, 300), PopCorners(0, 2, 150), Newtons(0, 3, 20), JuniorMints(1, 0, 100),
	Skittles(1, 1, 130), Shrimpchips(1, 2, 50), Takis(1, 3, 10), Nerds(2, 0, 60), RoldGold(2, 1, 150),
	Twizzlers(2, 2, 10), Mounds(2, 3, 30), Triscuit(3, 0, 100), TortillaChips(3, 1, 80), BrownieBites(3, 2, 200),
	Pocky(3, 3, 10);

	private int row, col, price;
	String DetetmineProduct;

	SnackItems(int row, int col, int price) {
		this.row = row;
		this.col = col;
		this.price = price;
	}

	public int getrow() {
		return row;
	}

	public int getcol() {
		return col;
	}

	public int getprice() {
		return price;
	}

	public static int[] DetectProduct(String DetetmineProduct) {

		String[] productRowColId = DetetmineProduct.split(",");
		int[] result = new int[productRowColId.length];

		for (int index = 0; index < productRowColId.length; index++) {
			result[index] = Integer.parseInt(productRowColId[index]);
		}
		return result;
	}

}
