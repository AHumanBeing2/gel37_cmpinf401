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
	
//Overloaded Constructor
	
	public Menu(String name) {
		this.name = name;

	}
	
	public Menu(String name, Entree entree, Side side) {
		this.name = name;
		this.entree = entree;
		this.side = side;

	}
	
	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}
	
	/**
	 * Counter is the net amount of calories, starts at 0 and doesn't increase if the dish does not exist.
	 * If the dish does exist, then the calories for the respective dish is added to counter.
	 */
	
	@Override
	public String toString() {
		return name;
	}
	
	public int totalCalories() {
		
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

	/**
	 * Prints out line for dish category, then tests for whether or not there is an dish.
	 * If there is, then the name and description get printed out.
	 * If not, then N/A is printed out in its place.
	 */
	
	
	public String description() {
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

	public double totalPrice (){
		return entree.getPrice() + side.getPrice() + salad.getPrice() + dessert.getPrice();
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
