package lab10;

import javax.swing.*;

public class Lab10 {
	public static void main(String[] args) {
		String Y = JOptionPane.showInputDialog("Input a number, the digits will be added");
		int y = Integer.parseInt(Y);
		int asdf = sumOfDigits(y);
		System.out.println(asdf + "\n ------------- printed out Array Elements below -------------");
//		String Z = JOptionPane.showInputDialog("Input a number, the digits will be added");
//		int z = Integer.parseInt(Z);

		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		printArrayElements(a, 8);

//		int h =factorial(4);
//		System.out.println(h);
	
	}
	
	public static int sumOfDigits(int z) {
		int summed = 0;
			if(z>9) {
				summed = summed + z%10 + sumOfDigits(z/10);
			}
			
			else if(z<=9 && z>=0) {
				summed = summed + z;
			}
	
			else if (z <= -1) {
				z*=-1;
				summed = summed + z%10 + sumOfDigits(z/10);
			}
			
		return summed;
	}
	
	public static void printArrayElements(int a[], int index) {
		int temp;
			if (index > 0) {
				temp = a[index];
				System.out.println(temp + "\n");
				printArrayElements(a, index - 1);
			}
			else {
				System.out.println(a[0]);
			}
	}
	
	/*
	public static void printArrayElements(int a[]) {
		for (int index = 0; index < a.length; index++) {
				System.out.println(a[index]);
		}
	}

	public static int factorial (int x) {
		int temp;
			if(x > 1){
			temp = x * factorial(x-1);
		}
		else{
			temp = 1;
		}
			return temp;
		}
	*/
}
