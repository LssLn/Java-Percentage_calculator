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
		Scanner scanner_1 = new Scanner(System.in);
 		double a= scanner_1.nextDouble();
 		System.out.print(" B: ");
 		Scanner scanner_2 = new Scanner(System.in);
 		double b= scanner_2.nextDouble();
 		
		
		double perc_a = a/(a+b)  * 100;
		double perc_b = b/(a+b) * 100;
		
		String perc_b_str = convertDecimalFormat1(perc_b);
		perc_b_str.replace(",", ".");
		perc_b_str = perc_b_str + "%";
		String perc_a_str = convertDecimalFormat1(perc_a);
		perc_a_str.replace(",", ".");
		perc_a_str = perc_a_str + "%";

		System.out.println("\n A: "+perc_a_str + "  B:" + perc_b_str);
	}

}
