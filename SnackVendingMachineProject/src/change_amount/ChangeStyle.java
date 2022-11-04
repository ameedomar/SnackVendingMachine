package change_amount;

public class ChangeStyle {
	public int[] changestyle(int Change_Amount) {
		final int _10Cents = 10;
		final int _20Cents = 20;
		final int _50Cents = 50;
		final int _100Cents = 100;

		int numOf10Cents, numOf20Cents, numOf50Cents, numOf100Cents;
		int numOf20$, numOf50$;

		int[] ChangeStyleContenet = new int[6];

		final int _20$ = 2000;
		final int _50$ = 5000;

		numOf50$ = Change_Amount / _50$;
		Change_Amount = Change_Amount % _50$;
		ChangeStyleContenet[0] = numOf50$;

		numOf20$ = Change_Amount / _20$;
		Change_Amount = Change_Amount % _20$;
		ChangeStyleContenet[1] = numOf20$;

		numOf100Cents = Change_Amount / _100Cents;
		Change_Amount = Change_Amount % _100Cents;
		ChangeStyleContenet[2] = numOf100Cents;

		numOf50Cents = Change_Amount / _50Cents;
		Change_Amount = Change_Amount % _50Cents;
		ChangeStyleContenet[3] = numOf50Cents;

		numOf20Cents = Change_Amount / _20Cents;
		Change_Amount = Change_Amount % _20Cents;
		ChangeStyleContenet[4] = numOf20Cents;

		numOf10Cents = Change_Amount / _10Cents;
		ChangeStyleContenet[5] = numOf10Cents;

		return ChangeStyleContenet;
	}

}
