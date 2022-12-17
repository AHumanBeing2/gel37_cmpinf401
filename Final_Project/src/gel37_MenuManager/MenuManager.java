package gel37_MenuManager;

import java.util.ArrayList;

public class MenuManager {
	private ArrayList<Entree> entrees = new ArrayList<Entree>();
	private ArrayList<Side> sides = new ArrayList<Side>();
	private ArrayList<Salad> salads = new ArrayList<Salad>();
	private ArrayList<Dessert> desserts = new ArrayList<Dessert>();
	
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
	
	public Menu minCaloriesMenu(String name) {
		Menu minMenu = new Menu(name);
		
		minMenu.setEntree(entrees.get(entrees.size()-1));
		for (Entree item: entrees){
			if (minMenu.getEntree().getCalories() > item.getCalories()) 
				minMenu.setEntree(item);		
		}

		minMenu.setSalad(salads.get(salads.size()-1));
		for (Salad item: salads){
			if (minMenu.getSalad().getCalories() > item.getCalories()) 
				minMenu.setSalad(item);		
		}
		
		minMenu.setSide(sides.get(sides.size()-1));
		for (Side item: sides){
			if (minMenu.getSide().getCalories() > item.getCalories()) 
				minMenu.setSide(item);		
		}
		
		minMenu.setDessert(desserts.get(desserts.size()-1));
		for (Dessert item: desserts){
			if (minMenu.getDessert().getCalories() > item.getCalories()) 
				minMenu.setDessert(item);		
		}
		
		return minMenu;
		
	}
	
	public Menu maxCaloriesMenu(String name) {
		Menu maxMenu = new Menu(name);
		
		maxMenu.setEntree(entrees.get(entrees.size()-1));
		for (Entree item: entrees){
			if (maxMenu.getEntree().getCalories() < item.getCalories()) 
				maxMenu.setEntree(item);		
		}

		maxMenu.setSalad(salads.get(salads.size()-1));
		for (Salad item: salads){
			if (maxMenu.getSalad().getCalories() < item.getCalories()) 
				maxMenu.setSalad(item);		
		}
		
		maxMenu.setSide(sides.get(sides.size()-1));
		for (Side item: sides){
			if (maxMenu.getSide().getCalories() < item.getCalories()) 
				maxMenu.setSide(item);		
		}
		
		maxMenu.setDessert(desserts.get(desserts.size()-1));
		for (Dessert item: desserts){
			if (maxMenu.getDessert().getCalories() < item.getCalories()) 
				maxMenu.setDessert(item);		
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
