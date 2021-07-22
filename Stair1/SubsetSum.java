package Stair1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubsetSum {

	static int l = Integer.MAX_VALUE;
	static ArrayList<Integer> ans;
	private static List<Integer> sol(int[] arr, int target, int n, ArrayList<Integer> sol, Map<String, ArrayList<Integer>> dp) {
		// TODO Auto-generated method stub

		if(target == 0) {
			if(l > sol.size()) {
				ans = new ArrayList<>(sol);
				l = sol.size();
			}	
			return ans;
		}
		
		if(n == 0) {
			return ans;
		}
		String key = target + "|" + n + "|" + l;
		System.out.println(key);
		if(dp.containsKey(key)) {
			System.out.println(key);
			return dp.get(key);
		}

		if(arr[n - 1] <= target) {
			sol.add(arr[n - 1]);
			sol(arr, target - arr[n - 1], n, sol, dp);
			sol.remove(sol.size() - 1);
		}
		
		
		sol(arr, target, n - 1, sol, dp);
		dp.put(key, ans);
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 1, 3};
		int target = 3;
		System.out.println(sol(arr, target, 3, new ArrayList<>(), new HashMap<>()));
	}

}
