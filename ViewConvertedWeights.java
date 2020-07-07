package calculator;

import java.util.ArrayList;


public class ViewConvertedWeights {
	
	
	public static void Display() {
		System.out.println("\n" + heading);
		for(int i = 0; i<heading.length(); i++) {
			System.out.print("+");
		
		}
		System.out.println();
		
		//Grams Heading
		System.out.println("---->Grams<----");
		
		//Displaying kilos coonverted
		if(Grams.KiloWeights == null) {
			System.out.println("Kilos");
			System.out.println();

		}
		else {
			System.out.println("Kilos");
			System.out.println(Grams.KiloWeights);
			System.out.println();
		}
		
		//Displaying Ounces Converted
		if(Grams.OunceWeights == null) {
			System.out.println("Ounce");
			System.out.println();
		}
		else {
			System.out.println("Ounces");
			System.out.println(Grams.OunceWeights);
			System.out.println();
		}
		
		//Displaying Pounds Converted
		if(Grams.PoundsWeights == null) {
			System.out.println("Pounds");
			System.out.println();
		}
		else {
			
			System.out.println("Pounds");
			System.out.println(Grams.PoundsWeights);
			System.out.println();
		}
		
		//Displaying Stone Converted
		if(Grams.StoneWeights == null) {
			
			System.out.println("Stone");
			System.out.println();
		}
		else {
			System.out.println("Stone");
			System.out.println(Grams.StoneWeights);
			System.out.println();
		}
		
		
		
		//Kilo Headings
		System.out.println("---->Kilos<----");
		
		//Displaying Grams converted
		if(Kilos.GramWeights == null) {
			System.out.println("Grams");
			System.out.println();

		}
		else {
			System.out.println("Grams");
			System.out.println(Kilos.GramWeights);
			System.out.println();
		}
		
		//Displaying Ounces Converted
		if(Kilos.OunceWeights == null) {
			System.out.println("Ounce");
			System.out.println();
		}
		else {
			System.out.println("Ounces");
			System.out.println(Kilos.OunceWeights);
			System.out.println();
		}
		
		//Displaying Pounds Converted
		if(Kilos.PoundsWeights == null) {
			System.out.println("Pounds");
			System.out.println();
		}
		else {
			
			System.out.println("Pounds");
			System.out.println(Kilos.PoundsWeights);
			System.out.println();
		}
		
		//Displaying Stone Converted
		if(Kilos.StoneWeights == null) {
			
			System.out.println("Stone");
			System.out.println();
		}
		else {
			System.out.println("Stone");
			System.out.println(Kilos.StoneWeights);
			System.out.println();
		}
		
		
		
		
		//Ounce Heading
		System.out.println("---->Ounce<----");
		
		//Displaying kilos converted
		if(Ounces.KiloWeights == null) {
			System.out.println("Kilos");
			System.out.println();

		}
		else {
			System.out.println("Kilos");
			System.out.println(Ounces.KiloWeights);
			System.out.println();
		}
		
		//Displaying Ounces Converted
		if(Ounces.GramWeights == null) {
			System.out.println("Grams");
			System.out.println();
		}
		else {
			System.out.println("Grams");
			System.out.println(Ounces.GramWeights);
			System.out.println();
		}
		
		//Displaying Pounds Converted
		if(Ounces.PoundsWeights == null) {
			System.out.println("Pounds");
			System.out.println();
		}
		else {
			
			System.out.println("Pounds");
			System.out.println(Ounces.PoundsWeights);
			System.out.println();
		}
		
		//Displaying Stone Converted
		if(Ounces.StoneWeights == null) {
			
			System.out.println("Stone");
			System.out.println();
		}
		else {
			System.out.println("Stone");
			System.out.println(Ounces.StoneWeights);
			System.out.println();
		}
		
		
		
		
		//Pounds Heading
		System.out.println("---->Pounds<----");
		
		//Displaying Kilos converted
		if(Pounds.KiloWeights == null) {
			System.out.println("Kilos");
			System.out.println();

		}
		else {
			System.out.println("Kilos");
			System.out.println(Pounds.KiloWeights);
			System.out.println();
		}
		
		//Displaying Ounces Converted
		if(Pounds.OunceWeights == null) {
			System.out.println("Ounce");
			System.out.println();
		}
		else {
			System.out.println("Ounces");
			System.out.println(Pounds.OunceWeights);
			System.out.println();
		}
		
		//Displaying Pounds Converted
		if(Pounds.GramWeights == null) {
			System.out.println("Grams");
			System.out.println();
		}
		else {
			
			System.out.println("Grams");
			System.out.println(Pounds.GramWeights);
			System.out.println();
		}
		
		//Displaying Stone Converted
		if(Pounds.StoneWeights == null) {
			
			System.out.println("Stone");
			System.out.println();
		}
		else {
			System.out.println("Stone");
			System.out.println(Pounds.StoneWeights);
			System.out.println();
		}
		
		
		
		
		//Stone Heading
		System.out.println("---->Stone<----");
		
		//Displaying kilos converted
		if(Stone.KiloWeights == null) {
			System.out.println("Kilos");
			System.out.println();

		}
		else {
			System.out.println("Kilos");
			System.out.println(Stone.KiloWeights);
			System.out.println();
		}
		
		//Displaying Ounces Converted
		if(Stone.OunceWeights == null) {
			System.out.println("Ounce");
			System.out.println();
		}
		else {
			System.out.println("Ounces");
			System.out.println(Stone.OunceWeights);
			System.out.println();
		}
		
		//Displaying Pounds Converted
		if(Stone.PoundsWeights == null) {
			System.out.println("Pounds");
			System.out.println();
		}
		else {
			
			System.out.println("Pounds");
			System.out.println(Stone.PoundsWeights);
			System.out.println();
		}
		
		//Displaying Stone Converted
		if(Stone.GramWeights == null) {
			
			System.out.println("Grams");
			System.out.println();
		}
		else {
			System.out.println("Grams");
			System.out.println(Stone.GramWeights);
			System.out.println();
		}
		
		
		
	}

	static String heading = "Displaying Converted Weights";
}
