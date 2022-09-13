package lab2;
import javax.swing.JOptionPane;

public class Pythag {

	public static void main(String[] args) {
		String  something = JOptionPane.showInputDialog("Input the length of the triangle's side");
		String other = JOptionPane.showInputDialog("Input the other side's length");
		double s = Double.parseDouble(something);
		double o = Double.parseDouble(other);
		s = Math.pow(s,2);
		o = Math.pow(o,2);
		
		double c = Math.sqrt(o+s);
		
		c=c*100;
		c= Math.round(c);
		c=c/100;		
		
		JOptionPane.showMessageDialog(null,"The Hypotenuse is "+ c);

		
	}
}
