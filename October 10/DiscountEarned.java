package javaExercise4;

import java.util.Scanner;

public class DiscountEarned {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		Scanner scanner = new Scanner(System.in);
		System.out.print("New customer? Y/N: ");
		char newCustomer = scanner.next().charAt(0);
		System.out.print("Have Loyalty Card? Y/N: ");
		char haveLoyaltyCard = scanner.next().charAt(0);
		System.out.print("Have Coupon? Y/N: ");
		char haveCoupon = scanner.next().charAt(0);
		
		scanner.close();
		
		
		int totalDiscount = calculateDiscount(newCustomer, haveLoyaltyCard, haveCoupon);
		long endTime = System.nanoTime();
		System.out.println("Total time: "+((endTime-startTime)/1000000));
		String discount = totalDiscount == -1 ? "Error discount combination" : Integer.toString(totalDiscount) + "%";
		System.out.println("Discount: " + discount);
		
	}
	
	static private int calculateDiscount(char newCustomer, char haveLoyalty, char haveCoupon) {
		
		int newCustomerDiscount = Character.toLowerCase(newCustomer) == 'y' ? 15: 0;
		int loyaltyDiscount = Character.toLowerCase(haveLoyalty) == 'y' ? 10: 0;
		int couponDiscount = Character.toLowerCase(haveCoupon) == 'y' ? 20: 0;
		
		if (newCustomerDiscount != 0 && loyaltyDiscount != 0) {
			
			return -1;
		}
		if (newCustomerDiscount == 15 && couponDiscount == 20) {
			
			return loyaltyDiscount + couponDiscount;
		}
		return loyaltyDiscount + couponDiscount + newCustomerDiscount; 
	}
	

}
