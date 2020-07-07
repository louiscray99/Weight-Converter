package calculator;

public class OunceCalculator  {
	public static double gramConversion = 28.34952;// multiply
	public static double kiloConversion = 0.02834952; //multiply
	public static double poundConversion = 16; //divided
	public static double stoneConversion = 224; //divided
	
	
	//Convert to grams, multiply Ounces by 28.34952
	public static double convertToGrams(double Number, double gramConversion) {
		return Number * gramConversion;
	}
	
	//Convert to kilograms, multiply Ounces by 0.02834952
	public static double convertToKilos(double Number, double kiloConversion) {
		return Number * kiloConversion;
	}
	
	//Convert to pounds, divide Ounces by 16
	public static double convertToPounds(double Number, double poundConversion) {
		return Number / poundConversion;
	}
	
	//convert to stone, divide Ounces by 224
	public static double convertToStone(double Number, double stoneConversion) {
		return Number / stoneConversion;
	}

}
