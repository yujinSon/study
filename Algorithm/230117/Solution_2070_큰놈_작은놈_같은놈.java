

import java.util.Scanner;

public class Solution_2070_ū��_������_������{
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
