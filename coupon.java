package coupon;

import java.util.Scanner;

public class coupon {

	public static void main(String args[]) {
		int Balanceamount;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount need to pay:");
		int amount = scanner.nextInt();
		System.out.println("Enter the promo code:");
		String code = scanner.next();
		String code1 = "ABCDE"; // Code 1
		String code2 = "FGHIJ"; // Code 2
		String code3 = "KLMNO"; // Code 3
		if (code.equals(code1)) {
			Balanceamount = amount - 100;
			System.out.println("Value of this promo code is Rs.100");
			System.out.println("Balance amount need to pay" + Balanceamount);
		} else if (code.equals(code2)) {
			Balanceamount = amount - 200;
			System.out.println("Value of this promo code is Rs.200");
			System.out.println("Balance amount need to pay is " + Balanceamount);
		} else if (code.equals(code3)) {
			Balanceamount = amount - 300;
			System.out.println("Value of this promo code is Rs.300");
			System.out.println("Balance amount need to pay" + Balanceamount);
		} else {
			System.out.println("Enter valid promo code");
		}
	}
}