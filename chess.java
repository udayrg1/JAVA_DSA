package chess;

public class chess {

	public static void main(String args[]) {
		for (int i = 1; i <= 8; i++) {
			System.out.print("\n");
			if (i % 2 == 0) {
				for (int j = 1; j <= 8; j++) {
					// via remainder
					if (j % 2 == 0) {
						System.out.print("B");
					}

					else {
						System.out.print("W");
					}
				}

			} else {
				for (int j = 1; j <= 8; j++) {
					// via remainder
					if (j % 2 == 0) {
						System.out.print("W");
					}

					else {
						System.out.print("B");
					}
				}
			}
		}
	}
}
