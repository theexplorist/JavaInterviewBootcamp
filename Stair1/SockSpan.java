package Stair1;

import java.util.Arrays;

public class SockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] price = {31, 27, 14, 21, 30, 22};
		
		int n = 6;
		
		int[] span = new int[6];
		span[0] = 1;
		for(int i = 1; i < n; i++) {
			span[i] = 1;
			
			for(int j = i - 1; j >= 0; j--) {
				if(price[j] >= price[i]) {
					break;
				}
				
				span[i]++;
			}
		}
		
		System.out.println(Arrays.toString(span));
	}

}
