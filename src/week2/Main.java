package week2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	//	int age = 14;
		//System.out.println(age >=16);
		//age = 17;
		//System.out.println(age >=16);
		
//		boolean hasLicense = true;
	//	if (age >= 16 && hasLicense) {
		//	System.out.println("You can drive");
	//} else {
		//	System.out.println("You cannot drive");
			
		//	double costOfMilk = 3.5;
			//int thirstLevel = 7;
			
			//if (costOfMilk < 2.5|| thirstLevel > 6) {
				//System.out.println("Milk please");
			//} else {
				//	System.out.println("No thanks");
					
			int numberOfCookies = 17;
			int numberOfChildren = 6;
			
			if (numberOfCookies % numberOfChildren == 0) {
			 System.out.println("Sad face");
			} else if (numberOfCookies % numberOfChildren < 2){
				System.out.println("Yes");
			} else if(numberOfCookies % numberOfChildren < 5) {
				System.out.println("Whooohooo!");				
			} else if (numberOfCookies % numberOfChildren >= 5) {
				System.out.println("Jackpot!");
			}
					
			String loyaltyMemberStatus = "GOLD";
			double loyaltyMemberDiscount = 0.0;
			
			
			switch (loyaltyMemberStatus){
				case "SILVER":
					loyaltyMemberDiscount= 0.10;
					break;
				case "GOLD":
					loyaltyMemberDiscount = 0.15;
					break;
				case "PLATINUM":
					loyaltyMemberDiscount = .025;
					break;
								
			}
			
			System.out.println(loyaltyMemberDiscount);
		
	
			
		
			
			double billTotal = 785.50;
			double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;
			System.out.println(adjustedTotal); 
	
	 	if (adjustedTotal > 500) {
	   		if (loyaltyMemberStatus == "SILVER") {
				loyaltyMemberStatus = "GOLD";
	   		}else if (loyaltyMemberStatus == "GOLD") {
				loyaltyMemberStatus = "PLATINUM";
	   		}				
	   	}
	 	
		System.out.println(loyaltyMemberStatus);
			
	
	String username = "Tommy123";
	String password = "12345";
	
	if (username.equals("Tommy123")&& password.equals("12345")){
		System.out.println("login Successful");
	} else {
		System.out.println("access denied");
		}
	}
}
	
		
	
	

		

	

		
	
	
		
	


