package week2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// conditional statements 
		String name = "Sam";
		
		if (name == "Sam"){
			System.out.println("Hello Sam!"); 
		} else {
			System.out.println("You are not Sam, " + name);
		}	
		
		int age = 14;
		
		if (age >= 16) {
			System.out.println("You can get your license");
		} else {
			//System.out.println("please wait until you are 16 years old");
			System.out.println("please wait " + ( 16 - age ) + " year(s) to get your license");
		}
		double costOfMilk = 2;
		
		if (costOfMilk <= 2) {
		System.out.println("buying 2");	
		} else if (costOfMilk <=3) {
			System.out.println("Buying 1");
		} else {
				System.out.println("Not buying any milk.");
			}
			char grade = 'C';
			
			switch (grade) {
			case 'A':
				System.out.println("90%");
				break;
			case 'B':
			System.out.println("80%");
				break;
			case 'C':
				System.out.println("70%");
				break;
			default:
				System.out.println("0%");
			
			}
		}
		
	}
	

		
	
	
		
	


