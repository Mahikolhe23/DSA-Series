package company;

//Cumulas hitachi 
public class CheckDecimalOrNot {

	public static void main(String[] args) {
		System.out.println(isDecimal(6.25));
	}

	public static boolean isDecimal(double num) {
		return num % 1 != 0;
	}
}
