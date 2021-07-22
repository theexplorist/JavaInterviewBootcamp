package Stair1;

import java.util.List;

public class GenerateParenthesis {

	public void generateParenthesis(int n, int oc, int cc, List<String> ans, String brac) {
		
		
		if(oc == n && cc == n) {
			ans.add(brac);
			return;
		}
		
		if(oc < n) {
			generateParenthesis(n, oc + 1, cc, ans, brac + '(');
		} 
		
		if(cc < oc) {
			generateParenthesis(n, oc, cc + 1, ans, brac + ')');
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
