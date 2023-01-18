

import java.util.Scanner;

public class Solution_2070_Å«³ð_ÀÛÀº³ð_°°Àº³ð{
	static int n, m;
	static char d;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();

		for (int tc = 1; tc <= TC; tc++) {
			n = sc.nextInt();
			m = sc.nextInt();

			if (n > m) {
				d = '>';
			} else if (n < m) {
				d = '<';
			} else {
				d = '=';
			}

			System.out.println("#" + tc + " " + d);
		}

	}
}
