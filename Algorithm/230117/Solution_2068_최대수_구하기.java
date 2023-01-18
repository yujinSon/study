import java.util.Scanner;

public class Solution_2068_최대수_구하기 {
	static int[] list;
	static int max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int TC = sc.nextInt();
		list = new int[10];
		for (int tc = 1; tc <= TC; tc++) {
			max = Integer.MIN_VALUE;
			for (int i = 0; i < 10; i++) {
				list[i] = sc.nextInt();
				if(max < list[i]) max = list[i];
			}
			
			System.out.println("#"+tc+" "+ max);
		}
	}
}
