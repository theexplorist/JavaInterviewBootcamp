package Stair1;

public class Subsequences {

	private static int subse(String inp, String out) {
		// TODO Auto-generated method stub

		if(inp.length() == 0) {
			System.out.println(out);
			return 1;
		}
		int count = 0;
		char cc = inp.charAt(0);
		count = count + subse(inp.substring(1), out);
		count = count + subse(inp.substring(1), out + cc);
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		int count = subse(str, "");
		System.out.println(count);
	}

}
