package Stair1;

import java.util.Stack;

public class StockSpanStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] price = { 11, 13, 21, 3 };

		int n = 4;

		int[] nge = new int[4];
		
		Stack<Integer> st = new Stack<>();
		st.push(0);
		
		for(int i = 1; i < n; i++) {
			while(!st.isEmpty() && price[i] > price[st.peek()]) {
				nge[st.pop()] = price[i];
				//System.out.println(price[st.pop()] + " " + price[i]);
			}
			//System.out.print(span[i] + " ");
			st.push(i);
		}
		
		while(!st.isEmpty()) {
			nge[st.pop()] = -1;
		}
		
		for(int i = 0; i < 4; i++) {
			System.out.println(price[i] + " " + nge[i]);
		}
	}

}
