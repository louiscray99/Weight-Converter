package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ounces extends Measurement {
	public int Number;
	public static List<String>KiloWeights = new ArrayList<>();
	public static List<String>GramWeights = new ArrayList<>();
	public static List<String>PoundsWeights = new ArrayList<>();
	public static List<String>StoneWeights = new ArrayList<>();
	
	
	public Ounces(int Number) {
		this.Number = Number;
	}
	
	public static void convertFromOunces(){
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
				System.out.print("Please Enter A Value In Ounces To Convert To Grams: ");
				double Number = input.nextInt();
				
				double answer = OunceCalculator.convertToGrams(Number, OunceCalculator.gramConversion);
				String output = ("\n" + Number + " * " + OunceCalculator.gramConversion + " = " + String.format("%.2f", answer) + " Grams");
				System.out.println(output);
				
				GramWeights.add(output);
				
				
				}
			 
			
			else if(choice == 2) {
				System.out.println("\n");
				System.out.print("Please Enter A Value In Ounces To Convert To Kilos: ");
				int Number = input.nextInt();
				
				double answer = OunceCalculator.convertToKilos(Number, OunceCalculator.kiloConversion);
				String output = ("\n" + Number + " % " + OunceCalculator.kiloConversion + " = " + String.format("%.2f", answer) + " Kilos");
				System.out.println(output);
				
				KiloWeights.add(output);
			
			}
			 
			
			else if(choice == 3) {
				System.out.println("\n");
				System.out.print("Please Enter A Value In Ounces To Convert To Pounds: ");
				int Number = input.nextInt();
				
				double answer = OunceCalculator.convertToPounds(Number, OunceCalculator.poundConversion);
				String output = ("\n" + Number + " % " + OunceCalculator.poundConversion + " = " + String.format("%.2f", answer) + " Pounds");
				System.out.println(output);
				
				PoundsWeights.add(output);
			
			}
			 
			 
			else if(choice == 4) {
				System.out.println("\n");
				System.out.print("Please Enter A Value In Ounces To Convert To Stone: ");
				int Number = input.nextInt();
				
				double answer = OunceCalculator.convertToStone(Number, OunceCalculator.stoneConversion);
				String output = ("\n" + Number + " % " + OunceCalculator.stoneConversion + " = " + String.format("%.2f", answer) +  "Stone");
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
	
	static String heading = ("Converting From Ounces");
	
	static String options[] = {"Grams", "Kilos", "Pounds", "Stone", "Chose A New Weight To Convert From"};
	
	static Scanner input = new Scanner(System.in);


}
