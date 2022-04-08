import java.text.DecimalFormat;
import java.util.Scanner;

public class main_test {
	public static String convertDecimalFormat1(Double input) {
		DecimalFormat numberFormat = new DecimalFormat("#.0");
		return numberFormat.format(input);
	}
	
	public static void main(String[] args) {

		// input numbers a and b
		System.out.print(" Given A and B, the percentage representation of the sum of these 2 numbers is returned.");
		System.out.print("\n A: ");
		Scanner scanner1 = new Scanner(System.in);
 		double a= scanner1.nextDouble();
 		System.out.print(" B: ");
 		Scanner scanner2 = new Scanner(System.in);
 		double b= scanner2.nextDouble();
 		
		
		double percA = a/(a+b)  * 100;
		double percB = b/(a+b) * 100;
		
		String percBStr = convertDecimalFormat1(percB);
		percBStr.replace(",", ".");
		percBStr = percBStr + "%";
		String percAStr = convertDecimalFormat1(percA);
		percAStr.replace(",", ".");
		percAStr = percAStr + "%";

		System.out.println("\n A: "+percAStr + "  B:" + percBStr);
	}

}

