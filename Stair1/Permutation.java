package Stair1;

public class Permutation {
	
	private static int sol(String inp, String out) {
		// TODO Auto-generated method stub

		if(inp.length() == 0) {
			System.out.println(out);
			return 1;
		}
		
		int count = 0;
		for(int i = 0; i < inp.length(); i++) {
			char cc = inp.charAt(i);
			String ros = inp.substring(0, i) + inp.substring(i + 1);
			count = count + sol(ros, out + cc);
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = sol("abcd", "");
		System.out.println(c);
	}

}
