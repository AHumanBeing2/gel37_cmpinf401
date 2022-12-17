package gel37_MenuManager;

import java.util.ArrayList;

public class MenuManager {
	private ArrayList<Entree> entrees = new ArrayList<Entree>();
	private ArrayList<Side> sides = new ArrayList<Side>();
	private ArrayList<Salad> salads = new ArrayList<Salad>();
	private ArrayList<Dessert> desserts = new ArrayList<Dessert>();
	
	/**
	 * tests incoming arraylist elements to see what kind of dish it is, moves thoses dishes into their respective ArrayList.
	 * ie, Entrees to the entrees arraylist
	 */
	
	public MenuManager(String dishesFile) {
		ArrayList<MenuItem> asdf = new ArrayList<MenuItem>();
		asdf =	FileManager.readItems(dishesFile);
		for(int i = 0; i < asdf.size(); i++){
			//System.out.println("hi");
			if(asdf.get(i) instanceof Entree) {
				entrees.add((Entree)asdf.get(i));
			}
			else if (asdf.get(i) instanceof Side) {
				sides.add((Side) asdf.get(i));
			}
			else if (asdf.get(i) instanceof Salad) {
				salads.add((Salad) asdf.get(i));
			}
			else if (asdf.get(i) instanceof Dessert) {
				desserts.add((Dessert) asdf.get(i));
			}
		}
	
	}
	
	public static void idk() {
		
	}
	
	public Menu randomMenu(String name) {
		int entreeIndex = (int) (Math.random()*entrees.size());
		int sideIndex = (int)(Math.random()*sides.size());
		int saladIndex = (int) (Math.random()*salads.size());
		int dessertIndex = (int) (Math.random()*desserts.size());
		
		return new Menu(name, entrees.get(entreeIndex), sides.get(sideIndex), salads.get(saladIndex), desserts.get(dessertIndex));
	}
	
	/**
	 * compares each dish type element with each other, if the calorie value is lower that dish is kept
	 */
	
	public Menu minCaloriesMenu(String name) {
		Menu minMenu = new Menu(name);
		
		minMenu.setEntree(entrees.get(entrees.size()-1));
		for (Entree entree: entrees){
			if (minMenu.getEntree().getCalories() > entree.getCalories()) 
				minMenu.setEntree(entree);		
		}
		
		minMenu.setSide(sides.get(sides.size()-1));
		for (Side side: sides){
			if (minMenu.getSide().getCalories() > side.getCalories()) 
				minMenu.setSide(side);		
		}
		
		minMenu.setSalad(salads.get(salads.size()-1));
		for (Salad salad: salads){
			if (minMenu.getSalad().getCalories() > salad.getCalories()) 
				minMenu.setSalad(salad);		
		}
		
		minMenu.setDessert(desserts.get(desserts.size()-1));
		for (Dessert dessert: desserts){
			if (minMenu.getDessert().getCalories() > dessert.getCalories()) 
				minMenu.setDessert(dessert);		
		}
		
		return minMenu;
		
	}
	
	/**
	 * compares each dish type element with each other, if the calorie value is higher that dish is kept
	 */
	
	public Menu maxCaloriesMenu(String name) {
		Menu maxMenu = new Menu(name);
		
		maxMenu.setEntree(entrees.get(entrees.size()-1));
		for (Entree entree: entrees){
			if (maxMenu.getEntree().getCalories() < entree.getCalories()) 
				maxMenu.setEntree(entree);		
		}

		maxMenu.setSide(sides.get(sides.size()-1));
		for (Side side: sides){
			if (maxMenu.getSide().getCalories() < side.getCalories()) 
				maxMenu.setSide(side);		
		}
		
		maxMenu.setSalad(salads.get(salads.size()-1));
		for (Salad salad: salads){
			if (maxMenu.getSalad().getCalories() < salad.getCalories()) 
				maxMenu.setSalad(salad);		
		}
		
		maxMenu.setDessert(desserts.get(desserts.size()-1));
		for (Dessert dessert: desserts){
			if (maxMenu.getDessert().getCalories() < dessert.getCalories()) 
				maxMenu.setDessert(dessert);		
		}
				
		return maxMenu;
		
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
