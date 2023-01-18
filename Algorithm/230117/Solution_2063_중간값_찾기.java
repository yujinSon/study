import java.util.Arrays;
import java.util.Scanner;

public class Solution_2063_중간값_찾기 {
	static int[] list;
	static int max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int TC = sc.nextInt();
		list = new int[TC];
		for (int i = 0; i < TC; i++) {
			list[i] = sc.nextInt();
		}
		Arrays.sort(list);
		System.out.println(list[TC/2]);
	}
}
