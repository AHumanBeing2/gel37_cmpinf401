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
