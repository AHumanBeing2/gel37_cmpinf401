package gel37_MenuManager;

/**

* Class Menu

* author : George Li

* created: 10/14/2022

*/

public class Menu {

	private String name;
	private Entree entree;
	private Salad salad;
	private Side side;
	private Dessert dessert;
	
	
	public Menu(String name) {
		this.name = name;
		entree = null;
		side = null;
		salad = null;
		dessert = null;

	}
	
	public Menu(String name, Entree entree, Side side) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		salad = null;
		dessert = null;

	}
	
	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}
	
	public int getTotalCalories() {
		
		int counter = 0;
		if(entree == null) {

			counter += 0;
		}
		else {
			counter += entree.getCalories();

		}
		
		counter += 0;
		if(side == null) {
			counter += 0;
		}
		else {
			counter += side.getCalories();
		}		
		counter += 0;
		
		if(salad == null) {
			counter += 0;
		}
		else {
			counter += salad.getCalories();
		}
		
		counter += 0;
		if(dessert == null) {
			counter += 0;
		}
		else {
			counter += dessert.getCalories();
			
		}		
		return counter;
	}

	public String getDescription() {
		String menuDescript;
		menuDescript = "Entree: ";
		
		if(entree == null) {
			menuDescript += "N/A \n";
		}
		else {
			menuDescript += entree.getName() + ", " + entree.getDescription() + "\n";
		}
		
			menuDescript += "Side: ";
		if(side == null) {
			menuDescript += "N/A \n";
		}
		else {
			menuDescript += side.getName() + ", " + side.getDescription() + "\n";
		}		

			menuDescript += "Salad: ";		
		if(salad == null) {
			menuDescript += "N/A \n";
		}
		else {
			menuDescript += salad.getName() + ", " + salad.getDescription() + "\n";
		}
		
			menuDescript += "Dessert: ";
		if(dessert == null) {
			menuDescript += "N/A \n";
		}
		else {
			menuDescript += dessert.getName() + ", " + dessert.getDescription() + "\n";
			
		}		
		return(menuDescript);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Entree getEntree() {
		return entree;
	}

	public void setEntree(Entree entree) {
		this.entree = entree;
	}

	public Salad getSalad() {
		return salad;
	}

	public void setSalad(Salad salad) {
		this.salad = salad;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public Dessert getDessert() {
		return dessert;
	}

	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}

	
}
