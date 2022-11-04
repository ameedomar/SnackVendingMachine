package snack_vending_machine;

public class Main {

	public static void main(String[] args) {
		SnackMachine snackMachineObj = new SnackMachine();

		snackMachineObj.displayWelcomingMsg();
		snackMachineObj.displaySnackItems();
		snackMachineObj.determineItem();
		snackMachineObj.statusMessage();
		snackMachineObj.chooseMethodToPay();
		snackMachineObj.ChangeAmount();
	}

}
