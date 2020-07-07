package calculator;

import java.util.Scanner;

public class StartConversion {

	public static void main(String[] args) {
		int choice;
		do {
			System.out.println();
			myMenu.display();
			choice = myMenu.getChoice();
			if (choice != QUIT) {
				processChoice(choice);

			}
		}
		while( choice != QUIT );
		System.out.println("\nGoodbye!");
		input.hasNextLine();

	}
	
	
	
	static void processChoice(int choice) {
		switch(choice) {
		
		case 1 : Grams.convertFromGrams();
		break;
		
		case 2 : Kilos.convertFromKilos();
		break;
		
		case 3 : Ounces.convertFromOunces();
		break;
		
		case 4 : Pounds.convertFromPounds();
		break;
		
		case 5 : Stone.convertFromStone();
		break;
		
		case 6 : ViewConvertedWeights.Display();
		break;
		
	
		default : System.out.println("Invalid Option Choice");
		
		}
		/*System.out.println("\nGoodbye!");
		input.hasNextLine();*/
		
	}



	



	static Scanner input = new Scanner(System.in);
	
	static final String title = "Measurement Conversion";
	
	static final String options[] = {"Grams", "Kilograms", "Ounces", "Pounds", "Stone", "View Converted Weights"};
	
	static Menu myMenu = new Menu(title, options);
	
	static final int QUIT = options.length+1;

}
