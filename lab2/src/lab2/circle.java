package lab2;
import javax.swing.JOptionPane;

public class circle {

	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("Input the radius of the circle");
		double r = Double.parseDouble(x);
		double pi = Math.PI;
		double perimeter = 2*r*pi;
		double area = r*r*pi;
		JOptionPane.showMessageDialog(null,"The perimeter is " + perimeter);
		JOptionPane.showMessageDialog(null,"The area is " + area);		
		
	}

}
