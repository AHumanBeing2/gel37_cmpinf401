package lab2;

import javax.swing.JOptionPane;

public class money {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Input an amount of money ranging from 1 to 9999 dollars");
			int money = Integer.parseInt(input);
				int grands = money / 1000;
				int Benjamins = (money % 1000)/100;
				int sawbucks = (money % 100)/10;
				int bucks = money % 10;

		JOptionPane.showMessageDialog(null,grands + " grands");						
		JOptionPane.showMessageDialog(null,Benjamins + " Benjamins");
		JOptionPane.showMessageDialog(null,sawbucks + " sawbucks");
		JOptionPane.showMessageDialog(null,bucks + " bucks");

	}

}
