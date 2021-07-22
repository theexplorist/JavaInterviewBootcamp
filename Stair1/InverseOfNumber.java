package Stair1;

import java.util.Scanner;

public class InverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		int number = scan.nextInt(); // 213
		
		int place = 0;
		int ans = 0;
		
		while(number > 0) {
			int digit = number % 10;
			
			place++;
			
			//
			int invPlace = digit;
			int invDigit = place;
			ans += invDigit * Math.pow(10, invPlace - 1);
			number = number / 10;
		}
		System.out.println(ans);
	}

}
