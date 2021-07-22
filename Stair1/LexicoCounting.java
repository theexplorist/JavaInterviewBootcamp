package Stair1;

public class LexicoCounting {

	private static void sol(int st, int end) {
		// TODO Auto-generated method stub
		if(st > end) {
			return;
		}
		
		System.out.println(st);
		
		int  i = 0;
		if(st == 0) {
			i = 1;
		}
		
		while(i <= 9) {
			sol(st * 10 + i, end);
			i++;
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol(0, 1000);
	}

}
