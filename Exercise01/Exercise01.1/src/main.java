import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//Output:
			// welcome message
			//total price before taxes
			//Total price after taxes
		
		//Input:
				//numberOfCups
				//pricePerCup
				//taxRate
		
		//Processing:
		
		//totalBeforeTaxes = pricePerCup * numberOfCups
		//totalAfterTaxes = totalBeforeTaxes * taxRate
		
		System.out.println("Welcome!");
		System.out.println("How many cups did you order?");
		int numberOfCups;
		numberOfCups = scan.nextInt();
				
		double pricePerCup = 1.25;
		double taxRate = 1.15;
		
		//Processing:
		double totalBeforeTaxes = pricePerCup * numberOfCups;
		double totalAfterTaxes = totalBeforeTaxes * taxRate;
		
		System.out.println("Your total before taxes is: " + String.format("%.2f", totalBeforeTaxes));
		System.out.println("Your total after taxes is: " + String.format("%.2f", totalAfterTaxes));
		
	}
}