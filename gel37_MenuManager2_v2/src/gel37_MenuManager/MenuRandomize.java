package gel37_MenuManager;

import java.util.ArrayList;
import java.util.*;

public class MenuRandomize {
	private ArrayList<Entree> entrees = new ArrayList<>();
	private ArrayList<Salad> salads = new ArrayList<>();
	private ArrayList<Side> sides = new ArrayList<>();
	private ArrayList<Dessert> desserts = new ArrayList<>();
	

	
	public MenuRandomize(String entreeFile, String sideFile, String SaladeFile, String DessertFile) {
		entrees = FileManager.readEntrees(entreeFile);
		sides = FileManager.readSides(entreeFile);
		salads = FileManager.readSalads(entreeFile);
		desserts = FileManager.readDesserts(entreeFile);
		
	}
	
	public Menu randomMenu() {
		String menuName = "menu1";
		int entreeIndex = (int) (Math.random()*entrees.size());
		int sideIndex = (int)(Math.random()*sides.size());
		int saladIndex = (int) (Math.random()*salads.size());
		int dessertIndex = (int) (Math.random()*desserts.size());
		
		return new Menu(menuName, entrees.get(entreeIndex), sides.get(sideIndex), salads.get(saladIndex), desserts.get(dessertIndex));
	}
}
