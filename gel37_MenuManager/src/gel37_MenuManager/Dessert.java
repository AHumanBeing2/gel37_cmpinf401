package gel37_MenuManager;

/**

* Class Dessert

* author : George Li

* created: 10/14/2022

*/

public class Dessert {
	private String name;
	private String description;
	private int calories;
	
	public Dessert(String name, String desc, int cal) {
		this.name = name;
		this.calories = cal;
		this.description = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	
}
