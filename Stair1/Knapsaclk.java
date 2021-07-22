package Stair1;

import java.util.Scanner;

public class Knapsaclk {

	private static int sol(int[] profit, int[] weight, int n, int bagW, int[][] cache) {
		// TODO Auto-generated method stub

		if(bagW == 0 || n == 0) {
			return 0;
		}
		
		if(cache[bagW][n] != -1) {
			return cache[bagW][n];
		}
		int c1 = 0, c2 = 0;
		if (weight[n - 1] <= bagW) {
			c1 = profit[n - 1] + sol(profit, weight, n, bagW - weight[n - 1], cache);
		}

		c2 = sol(profit, weight, n - 1, bagW, cache);

		return cache[bagW][n] = Math.max(c1, c2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int s = scn.nextInt();

		int[]weight = new int[n];
		int[]value = new int[n];

		for(int i = 0; i < n; i++) {
			weight[i] = scn.nextInt();
		}

		for(int i = 0; i < n; i++) {
			value[i] = scn.nextInt();
		}
		
		int[][] cache = new int[s + 1][n + 1];

		for(int i = 0; i < cache.length; i++) {
			for(int j = 0; j < cache[0].length; j++) {
				cache[i][j] = -1;
			}
		}

		System.out.println(sol(value, weight, n, s, cache));
	}

}
