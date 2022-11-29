package gel37_MenuManager;

/**

* Class Side

* author : George Li

* created: 10/14/2022

*/

/**
 * 
 * Side has three properties, its name, its calorie count, and its description.
 *
 */

public class Side extends MenuItem{
	public Side() {
		super();
	}
	
	public Side(String name, String desc, int cal) {
		this.name = name;
		this.calories = cal;
		this.description = desc;
	}

}
