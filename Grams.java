package calculator;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Grams extends Measurement {
	public int Number;
	public static List<String>KiloWeights = new ArrayList<>();
	public static List<String>OunceWeights = new ArrayList<>();
	public static List<String>PoundsWeights = new ArrayList<>();
	public static List<String>StoneWeights = new ArrayList<>();
	
	
	
	public Grams(int Number) {
		this.Number = Number;
	}
	
	
	public static int convertFromGrams(){
		
		while(true) {
		
		//For the length of the heading a + is placed under each letter
		System.out.println("\n" + heading);
		for(int i=0;i<heading.length();i++) {
			System.out.print("+");
		}
		System.out.println("\n");
		//Displays the options which have been set at the bottom
		int count = 1;
		for(String str : options) {
			System.out.println(count+". "+str);
			count++;
			
		}
		System.out.println("\n");
		System.out.print("Please Select A Weight To Convert To: ");
		//the next input will be the users choice
		int choice = input.nextInt();
		
		 if(choice == 1) {
			System.out.println("\n");
			System.out.print("Please Enter A Value In Grams To Convert To Kilograms: ");
			double Number = input.nextInt();
			
			double answer = GramsCalculator.convertToKilos(Number, GramsCalculator.kiloConversion);
			String output = ("\n" + Number + " % " + GramsCalculator.kiloConversion + " = " + String.format("%.2f", answer) + " Kilograms");
			System.out.println(output);
			
			KiloWeights.add(output);
			
			
			}
		
		else if(choice == 2) {
			System.out.println("\n");
			System.out.print("Please Enter A Value In Grams To Convert To Ounces: ");
			int Number = input.nextInt();
			
			double answer = GramsCalculator.convertToOunces(Number, GramsCalculator.ounceConversion);
			String output = ("\n" + Number + " % " + GramsCalculator.ounceConversion + " = " + String.format("%.2f", answer) + " Ounces");
			System.out.println(output);
			
			OunceWeights.add(output);
		
		}
		
		else if(choice == 3) {
			System.out.println("\n");
			System.out.print("Please Enter A Value In Grams To Convert To Pounds: ");
			int Number = input.nextInt();
			
			double answer = GramsCalculator.convertToPounds(Number, GramsCalculator.poundConversion);
			String output = ("\n" + Number + " % " + GramsCalculator.poundConversion + " = " + String.format("%.2f", answer) + " Pounds");
			System.out.println(output);
			
			PoundsWeights.add(output);
		}
		 
		else if(choice == 4) {
			System.out.println("\n");
			System.out.print("Please Enter A Value In Grams To Convert To Stone: ");
			int Number = input.nextInt();
			
			double answer = GramsCalculator.convertToStone(Number, GramsCalculator.stoneConversion);
			String output = ("\n" + Number + " % " + GramsCalculator.stoneConversion + " = " + String.format("%.2f", answer) +  " Stone");
			System.out.println(output);
			
			StoneWeights.add(output);
			
		}
		 
		else if(choice == 5) {
			StartConversion.main(options);
			
		}
		 
		else {
			System.out.println("\n");
			System.out.println("Sorry, This Option Is Not Valid");
		}
		
	}
		
}

	
	
	
	static String heading = ("Converting From Grams");
	
	static String options[] = {"Kilograms", "Ounces", "Pounds", "Stone", "Chose A New Weight To Convert From"};
	
	static Scanner input = new Scanner(System.in);
	

}
