package calculator;

public class PoundCalculator {
	public static double gramConversion = 453.59237; 
	public static double kiloConversion = 0.45359237; 
	public static double ounceConversion = 16; 
	public static double stoneConversion = 14; 
	
	
	//Convert to grams, multiply pounds by 453.59237
	public static double convertToGrams(double Number, double gramConversion) {
		return Number * gramConversion;
	}
	
	//Convert to kilos, multiply pounds by 0.45359237
	public static double convertToKilos(double Number, double kiloConversion) {
		return Number * kiloConversion;
	}
	
	//Convert to Ounces, multiply pounds by 16
	public static double convertToOunces(double Number, double ounceConversion) {
		return Number * ounceConversion;
	}
	
	//Convert to stone, divide pounds by 14
	public static double convertToStone(double Number, double stoneConversion) {
		return Number / stoneConversion;
	}

}
