package StackTemplate;

import java.util.Stack;

public class HistogramAreaMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2, 1, 5, 6, 2, 3};
		int n = 6;
		
		int[] psl = new int[n];
		Stack<Integer> st = new Stack<>();
		st.push(0);
		psl[0] = -1;
		
		for(int curr = 1; curr < n; curr++) {
			
			while(!st.isEmpty() && arr[curr] <= arr[st.peek()]) {
				st.pop();
			}
			
			if(!st.isEmpty()) {
				psl[curr] = st.peek();
			} else {
				psl[curr] = -1;
			}
			st.push(curr);
		}
		
		st = new Stack<>();
		st.push(0);
		
		int[] nsl = new int[n];
		
		for(int curr = 1; curr < n; curr++) {
			
			while(!st.isEmpty() && arr[curr] < arr[st.peek()]) {
				nsl[st.pop()] = curr;
			}
			
			st.push(curr);
		}
		
		while(!st.isEmpty()) {
			nsl[st.pop()] = n;
		}
		
		int maxArea = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			int area =  (nsl[i] - psl[i] - 1) * arr[i];
			maxArea = Math.max(maxArea, area);
		}
		
		System.out.println(maxArea);
	}
}
