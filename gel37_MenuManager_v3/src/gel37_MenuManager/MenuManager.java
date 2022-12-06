package gel37_MenuManager;

import java.util.ArrayList;

public class MenuManager {
	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;
	
	public MenuManager(String dishesFile) {
		FileManager.readItems("dishes.txt");
		while(!=null) {
			entrees.add();
		}
	}
	
	public Menu randomMenu(String name){
		return null;
		
	}
	
	public Menu minCaloriesMenu(String name) {
		return null;
		
	}
	
	public Menu maxCaloriesMenu(String name) {
		return null;
		
	}
	
	public ArrayList<Entree> getEntrees() {
		return entrees;
	}

	public void setEntrees(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}

	public ArrayList<Side> getSides() {
		return sides;
	}

	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}

	public ArrayList<Salad> getSalads() {
		return salads;
	}

	public void setSalads(ArrayList<Salad> salads) {
		this.salads = salads;
	}

	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}

	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}
	
}
