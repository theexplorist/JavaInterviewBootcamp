package Stair1;

public class AllPartitions {

	private static void isPalin() {
		// TODO Auto-generated method stub

	}
	private static void sol(String inp, String out) {
		// TODO Auto-generated method stub
		
		if(inp.length() == 0) {
			System.out.println(out);
			return;
		}
		
		for(int i = 1; i <= inp.length(); i++) {
			String ros = inp.substring(i);
			sol(ros, out + " " + inp.substring(0, i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 1;
		
		
	}

}
