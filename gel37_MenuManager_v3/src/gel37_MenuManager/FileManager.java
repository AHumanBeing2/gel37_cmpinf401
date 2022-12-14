package gel37_MenuManager;

import java.util.ArrayList;
import java.io.*;

/**
 * 
 * @author George Li
 * @CREATED: 11/04/2022
 *
 *
 */

public class FileManager {
	
	/**
	 * Method readEntrees
	 * @param fileName
	 * @return A Separated ArrayList containing Entree details
	 */
	/*
	public static ArrayList<Entree> readEntrees(String fileName) {	
		ArrayList<Entree> entreeArrayList = new ArrayList<>();
		try {
			FileReader fr = new FileReader("data/entrees.txt"); 
		    BufferedReader br = new BufferedReader(fr); 
		    String line = br.readLine();
		    while (line != null) {
		    	String [] entreeParts = line.split("@@");
		    	String name, description;
		    	int calories;
		    	name = entreeParts[0] ;
		    	description = entreeParts[1];
		    	calories = Integer.valueOf(entreeParts[2]);
		    	Entree entree = new Entree(name, description, calories);
		    	entreeArrayList.add(entree);
		    	line = br.readLine();
		    }
		    
//		    System.out.println(line);
		    br.close();
		    fr.close();
		} catch (IOException e) {
		    System.out.println(e.getMessage());
		}
		return entreeArrayList;		
	}
	
	
	/**
	 * Method readSides
	 * @param fileName
	 * @return A separated ArrayList containing Side details
	 */
	/*
	public static ArrayList<Side> readSides(String fileName) {
		ArrayList<Side> sideArrayList = new ArrayList<>();
		try {
		    FileReader fr = new FileReader("data/sides.txt"); 
		    BufferedReader br = new BufferedReader(fr); 
		    String line = br.readLine();
		    while (line != null) {
		    	String [] sideParts = line.split("@@");
		    	String name, description;
		    	int calories;
		    	name = sideParts[0] ;
		    	description = sideParts[1];
		    	calories = Integer.valueOf(sideParts[2]);
		    	Side side = new Side(name, description, calories);
		    	sideArrayList.add(side);
		    	line = br.readLine();
		    }

//		    System.out.println(line);
		    br.close();
		    fr.close();
		} catch (IOException e) {
		    System.out.println(e.getMessage());
		}
		return sideArrayList;
	}
	*/	
	
	/**
	 * Method readSalads
	 * @param fileName
	 * @return A separated ArrayList containing salad details
	 */
	/*
	public static ArrayList<Salad> readSalads(String fileName) {
		ArrayList<Salad> saladArrayList = new ArrayList<>();
		try {
		    FileReader fr = new FileReader("data/salads.txt"); 
		    BufferedReader br = new BufferedReader(fr); 
		    String line = br.readLine();
		    while (line != null) {
		    	String [] saladParts = line.split("@@");
		    	String name, description;
		    	int calories;
		    	name = saladParts[0] ;
		    	description = saladParts[1];
		    	calories = Integer.valueOf(saladParts[2]);
		    	Salad salad = new Salad(name, description, calories);
		    	saladArrayList.add(salad);
		    	line = br.readLine();
		    }
		    br.close();
		    fr.close();
		} catch (IOException e) {
		    System.out.println(e.getMessage());
		}
		return saladArrayList;
	}
	*/
	/**
	 * Method readDesserts
	 * @param fileName
	 * @return A separated ArrayList containing desserts details
	 */
	/*
	public static ArrayList<Dessert> readDesserts(String fileName) {
		ArrayList<Dessert> dessertArrayList = new ArrayList<>();
		try {
		    FileReader fr = new FileReader("data/desserts.txt"); 
		    BufferedReader br = new BufferedReader(fr); 
		    String line = br.readLine();
//		    System.out.println(line);
		    while (line != null) {
		    	String [] dessertParts = line.split("@@");
		    	String name, description;
		    	int calories;
		    	name = dessertParts[0] ;
		    	description = dessertParts[1];
		    	calories = Integer.valueOf(dessertParts[2]);
		    	Dessert dessert = new Dessert(name, description, calories);
		    	dessertArrayList.add(dessert);
		    	line = br.readLine();
		    }
		    br.close();
		    fr.close();
		} catch (IOException e) {
		    System.out.println(e.getMessage());
		}
		return dessertArrayList;
	}
	*/
	public static ArrayList<MenuItem> readItems(String fileName){
		ArrayList<MenuItem> MenuItemArrayList = new ArrayList<>();
		try {
		    FileReader fr = new FileReader(fileName); 
		    BufferedReader br = new BufferedReader(fr); 
		    String line = br.readLine();
//		    System.out.println(line);
		    while (line != null) {
		    	String [] menuItemParts = line.split("@@");
		    	String name, description, dishType;
		    	int calories;
		    	double price;
		    	name = menuItemParts[0];
		    	dishType = menuItemParts[1];
		    	description = menuItemParts[2];
		    	calories = Integer.valueOf(menuItemParts[3]);
		    	price = Double.valueOf(menuItemParts[4]);
		    	
		    	if(dishType.equals("entree")) {
			    	Entree entree = new Entree(name, description, calories, price);
			    	//System.out.println(":) yay");
			    	MenuItemArrayList.add(entree);
		    	}
		    	else if(dishType.equals("side")) {
		    		Side side = new Side(name, description, calories, price);
			    	MenuItemArrayList.add(side);
		    	}
		    	else if(dishType.equals("salad")) {
		    		Salad salad = new Salad(name, description, calories, price);
			    	MenuItemArrayList.add(salad);
		    	}
		    	else if(dishType.equals("dessert")) {
			    	Dessert dessert = new Dessert(name, description, calories, price);
			    	MenuItemArrayList.add(dessert);
		    	}
		    	
		    	line = br.readLine();
		    }
		    br.close();
		    fr.close();
		} catch (IOException e) {
		    System.out.println(e.getMessage());
		}
		return MenuItemArrayList;
	}
	
	public static void writeMenu(String fileName, ArrayList<Menu> menus){
		try{
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			String a = "";
			String b = "";
			String c = "";
			String d = "";
		    for (int i=0; i != menus.size(); i++) {
		    	a += menus.get(i).getEntree().getPrice();
		    	b += menus.get(i).getSide().getPrice();
		    	c += menus.get(i).getSalad().getPrice();
		    	d += menus.get(i).getDessert().getPrice();
		    	bw.write(menus.get(i).getName());
		    	bw.write(menus.get(i).totalCalories());
		    	bw.write(menus.get(i).getEntree().toString());
		    	bw.write(menus.get(i).getEntree().getDescription());
		    	bw.write(menus.get(i).getEntree().getCalories());
		    	bw.write(a);
		    	bw.write(menus.get(i).getSide().toString());
		    	bw.write(menus.get(i).getSide().getDescription());
		    	bw.write(menus.get(i).getSide().getCalories());
		    	bw.write(b);
		    	bw.write(menus.get(i).getSalad().toString());
		    	bw.write(menus.get(i).getSalad().getDescription());
		    	bw.write(menus.get(i).getSalad().getCalories());
		    	bw.write(c);
		    	bw.write(menus.get(i).getDessert().toString());	
		    	bw.write(menus.get(i).getDessert().getDescription());
		    	bw.write(menus.get(i).getDessert().getCalories());
		    	bw.write(d);
		    	//bw.write(menus.get(i).());
		    }
		    	bw.close();
		    	fw.close();
		    }
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
