package Stair1;

public class KeyPadCodes {

	static String[] arr = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	private static void sol(String inp, String ans) {
		// TODO Auto-generated method stub

		if (inp.length() == 0) {
			System.out.println(ans);
			return;
		}
		char cc = inp.charAt(0);
		String alpha = arr[cc];

		for (int i = 0; i < alpha.length(); i++) {
			char option = alpha.charAt(i);

			sol(inp.substring(1), ans + option);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
