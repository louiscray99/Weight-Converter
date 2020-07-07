package calculator;

public class StoneCalculator {
	public static double gramConversion = 6350.29318;
	public static double kiloConversion = 6.35029318; 
	public static double ounceConversion = 224; 
	public static double poundConversion = 14;
	
	
	//Convert to grams, multiply Stone by 6350.29318
	public static double convertToGrams(double Number, double gramConversion) {
		return Number * gramConversion;
	}
	
	//Convert to kilos, multiply Stone by 6.35029318
	public static double convertToKilos(double Number, double kiloConversion) {
		return Number * kiloConversion;
	}
	
	//Convert to ounces, multiply Stone by 224
	public static double convertToOunces(double Number, double ounceConversion) {
		return Number * ounceConversion;
	}
	
	//Convert to pounds, multiply Stone by 14
	public static double convertToPounds(double Number, double poundConversion) {
		return Number * poundConversion;
	}

}
