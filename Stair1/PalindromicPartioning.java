package Stair1;

public class PalindromicPartioning {

	private static boolean isPalin(String str) {
		// TODO Auto-generated method stub
		
		int i = 0, j = str.length() - 1;
		
		while(i < j) {
			if(str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
		}
		
		return true;
	}
	public static void sol(String inp, String out) {
		
		if(inp.length() == 0) {
			System.out.println(out);
			return;
		}
		for(int i = 1; i <= inp.length(); i++) {
			if(isPalin(inp.substring(0, i)))
			sol(inp.substring(i), out + inp.substring(0, i) + "|");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol("nitin", "");
	}

}
