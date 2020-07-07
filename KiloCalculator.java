package calculator;

public class KiloCalculator {
	public static double gramConversion = 1000;
	public static double ounceConversion = 0.02834952;
	public static double poundConversion = 0.45359237;
	public static double stoneConversion = 6.35029318;
	
	
	//Convert to kilos, multiply grams by 1000
	public static double convertToGrams(double Number, double gramConversion) {
		return Number * gramConversion;
	}
	
	//Convert to kilos, divide ounces by 0.02834952
	public static double convertToOunces(double Number, double ounceConversion) {
		return Number / ounceConversion;
	}
	
	//Convert to kilos, divide pounds by 0.45359237
	public static double convertToPounds(double Number, double poundConversion) {
		return Number / poundConversion;
	}
	
	//Convert to stone, divide kilos by 6.35029318
	public static double convertToStone(double Number, double stoneConversion) {
		return Number / stoneConversion;
	}


	
}
