package StackTemplate;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] prices = {2, 1, 5, 6, 2, 3};
		int n = 6;
		
		Stack<Integer> st = new Stack<>();
		st.push(0);
		
		int[] nsl = new int[n];
		
		for(int curr = 1; curr < n; curr++) {
			
			while(!st.isEmpty() && prices[curr] < prices[st.peek()]) {
				nsl[st.pop()] = curr;
			}
			
			st.push(curr);
		}
		
		while(!st.isEmpty()) {
			nsl[st.pop()] = n;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(prices[i] + "->" + nsl[i]);
		}
	}

}
