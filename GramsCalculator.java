package calculator;

public class GramsCalculator {
	public static double kiloConversion = 1000;
	public static double ounceConversion = 28.34952;
	public static double poundConversion = 453.59237;
	public static double stoneConversion = 6350.29318;

	
	//Convert to kilograms, divide grams by a 1000
	public static double convertToKilos(double Number, double kiloConversion) {
		return Number / kiloConversion;
	}
	
	//convert to ounces, divide grams by 28.34952:
	public static double convertToOunces(double Number, double ounceConversion) {
		return Number / ounceConversion;
	}
	
	//convert to pounds, divide grams by 453.59237
	public static double convertToPounds(double Number, double poundConversion) {
		return Number / poundConversion;
	}
	
	//convert to stone, divide grams by 6350.29318
	public static double convertToStone(double Number, double stoneConversion) {
		return Number / stoneConversion;
	}
}
