import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TwoArrAndSumOfFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long[] a = new long[n];
		Integer[] b = new Integer[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = s.nextInt() * (i + 1) * (n - i);
		}
		
		for(int i = 0; i < n; i++) {
			b[i] = s.nextInt();
		}
		
		//sort a in ascending order
		Arrays.sort(a);
		//sort b in desc order
		//Collections.reverseOrder()
		Arrays.sort(b, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		long sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum +=  (a[i] % 998244353) * (b[i] % 998244353);
			sum = sum % 998244353;
		}
		
		System.out.println(sum);
		
	}

}
