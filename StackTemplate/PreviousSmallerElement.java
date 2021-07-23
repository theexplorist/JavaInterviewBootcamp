package StackTemplate;

import java.util.Stack;

public class PreviousSmallerElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] prices = {2, 1, 5, 6, 2, 3};
		int n = 6;
		
		int[] psl = new int[n];
		Stack<Integer> st = new Stack<>();
		st.push(0);
		psl[0] = -1;
		
		for(int curr = 1; curr < n; curr++) {
			
			while(!st.isEmpty() && prices[curr] <= prices[st.peek()]) {
				st.pop();
			}
			
			if(!st.isEmpty()) {
				psl[curr] = st.peek();
			} else {
				psl[curr] = -1;
			}
			st.push(curr);
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(prices[i] + "->" + psl[i]);
		}
	}

}
