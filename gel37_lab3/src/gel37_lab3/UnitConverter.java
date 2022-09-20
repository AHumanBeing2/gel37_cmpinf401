package gel37_lab3;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class UnitConverter {

//converts metric to imperial and vice versa
// in to cm, yd to m, oz to gm, kg to lb
	
	public static void main(String[] args) {


		Scanner something = new Scanner(System.in);
		System.out.println("Input a distance or a weight and the Unit of measurement. Make sure Units and number are separated by a space");
		Double number = something.nextDouble();
		String Unit = something.next();
		
		System.out.println(Unit);
		
//		Unit = " in";
		
		if (Unit.equals("in")) {
			number=number*2.54;
			Unit = " cm";
		}
		
		else if (Unit.equals("cm")) {
			number=number*(1/2.54);
			Unit = " in";	
		}
		
		else if (Unit.equals("yd")) {
			number=number*(1/1.09361);
			Unit = " cm";	
			
		}
		else if (Unit.equals("m")) {
			number=number*1.09361;	
			Unit = " cm";	
			
		}
		else if (Unit.equals("oz")) {
			number=number*28.3495;	
			Unit = " cm";	
			
		}
		else if (Unit.equals("gm")) {
			number=number*(1/28.3495);	
			Unit = " cm";
			
		}
		else if (Unit.equals("kg")) {
			number=number*2.20462;
			Unit = " cm";
			
		}
		else if (Unit.equals("lb")) {
			number=number*(1/2.20462);
			Unit = " cm";
			
		}
		else
			System.out.println("whoops");

		System.out.println(number+Unit);

			/*		
		String x = JOptionPane.showInputDialog("Input a distance or a weight and the Unit of measurement. Make sure Units and number are separated by a space");
		String[] arrOfx = x.split(" ",0);
		double number = 0;
		String Units = "";
		System.out.println(x);
		System.out.println(number+Units);

	}

	public static String happythoughts(String happy) {
		for (int i=0; i < x.length() && i == x.length; i--) {
			
		}
		return happy;
	}

	public static String happynumbers(String yay) {
		String top;
		for (int i=0; i != 32; i++) {
			char number = x.charAt(i);
			top = top + number;
		}
		return top;
		*/		
	}
	
}
