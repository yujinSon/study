import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2071_평균값구하기_D1 {
	static int sum;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		int TC = Integer.parseInt(st.nextToken());
		
		for (int t = 1; t <= TC; t++) {
			sum=0;
			st = new StringTokenizer(br.readLine().trim());
			for (int i = 0; i < 10; i++) {
				int now = Integer.parseInt(st.nextToken());
				sum += now;
			}
			double res = (double)sum/10;
			System.out.println("#"+t+" "+Math.round(res));
		}		
	}
}
