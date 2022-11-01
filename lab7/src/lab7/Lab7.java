package lab7;

import javax.swing.JOptionPane;


public class Lab7 {
	public static void main(String[] args) {
		String m = JOptionPane.showInputDialog("How many items will be entered?");
		
		int mm = Integer.parseInt(m);
	
		double[] data = new double[mm];
		
		for(int i=0; i<data.length; i++) {
			if(i==0) {
				data[i] = Math.random();
			}
			else {
			data[i] = i * Math.random();
		}
		}
		for (double elements : data) {
			System.out.println(elements);
		}
				
		System.out.println("\n\n" + "Max: " + max(data) + "\n" + "Min: " + min(data) + "\n" + "Sum: " + sum(data) + "\n" + "Average: " + ave(data));
		
	}
	
		public static double max(double [] data) {
			double idk = 0;
			for(int i=0; i < data.length; i++) {
				if(data.length == i+1) {
					if(data[i] <  data[i-1]) {
						idk = data[i-1];
				}
					
				}
			else if(data[i] <  data[i+1]) {
					idk = data[i+1];
			}
			}
			return idk;
		}
		
		public static double min(double [] data) {
			double idk = 0;
			for(int i=0; i < data.length; i++) {
				if(data.length == i+1) {
					if(data[i] <  data[i-1]) {
						idk = data[i];
				}
					
				}
			else if(data[i] <  data[i+1]) {
					idk = data[i];
			}
			}
			return idk;
		}
		
		public static double sum(double [] data) {
			double idk = 0;
			for(int i=0; i < data.length; i++) {
				idk = idk + data[i];
			}
				return idk;
		}
		
		public static double ave(double [] data) {
			double ave = 0;
			double total = 0;
			for(int i=0; i < data.length; i++) {
				total = total + data[i];
			}
			ave = total/data.length;
			return ave;
		}

}
