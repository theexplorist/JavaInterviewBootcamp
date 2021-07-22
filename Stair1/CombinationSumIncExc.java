package Stair1;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIncExc {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<>();
		combinationSum(candidates, target, 0, new ArrayList<>(), res);
		return res;
	}
	
	public void combinationSum(int[] candidates, int target, int ci, List<Integer> temp, List<List<Integer>> res) {

		if(target == 0) {
			res.add(new ArrayList<>(temp));
			return;
		}
		
		if(ci == candidates.length) {
			return;
		}
		
		if(candidates[ci] <= target) {
			temp.add(candidates[ci]);
			combinationSum(candidates, target - candidates[ci], ci, temp, res);
			temp.remove(temp.size() - 1);
		}
		
		combinationSum(candidates, target, ci + 1, temp, res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
