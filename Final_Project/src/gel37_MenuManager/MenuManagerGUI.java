package gel37_MenuManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.*;

public class MenuManagerGUI implements ActionListener, ListSelectionListener {
	private JFrame main;
	private JLabel entreesLabel;
	private JLabel sidesLabel;
	private JLabel saladsLabel;
	private JLabel dessertsLabel;
	private JLabel createMenuLabel, finMenuLabel, genMenuLabel;
	private JComboBox<Entree> entreesCombo;
	private JComboBox<Side> sidesCombo;
	private JComboBox<Salad> saladsCombo;
	private JComboBox<Dessert> dessertsCombo;
	private JButton createMenuButton;
	private JButton randomMenuButton;
	private JButton minMenuButton;
	private JButton maxMenuButton;
	private JButton detailsButton;
	private JButton deleteButton;
	private JButton saveButton;
	private JList<Menu> list;
	private DefaultListModel<Menu> listModel;

	MenuManager menuManager = new MenuManager("data/dishes.txt");	//MenuManager object of all menu items, and type array lists
	ArrayList<Menu> allMenus = new ArrayList<Menu>();			//array list of all created menus
	
	public static void main(String[] args) {
		MenuManagerGUI menuManagerGUI = new MenuManagerGUI();
	}
	
	/**
	 * Creates the main menu
	 */
	
	public MenuManagerGUI() {
		main = new JFrame("Menu Manager");
		main.setLayout(null);
		main.setBounds(100,100,620,450);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setAlwaysOnTop(true);

		createMenuLabel = new JLabel("Create your own menu:");
		createMenuLabel.setBounds(10, 5, 135, 25);
		finMenuLabel = new JLabel("Created menus:");
		finMenuLabel.setBounds(350, 10, 100, 25);
		genMenuLabel = new JLabel("Or generate a menu:");
		genMenuLabel.setBounds(10, 250, 120, 25);

		entreesLabel = new JLabel("Entrees:");
		entreesLabel.setBounds(15, 30, 70, 25);

		saladsLabel = new JLabel("Salads:");
		saladsLabel.setBounds(15, 65, 70, 25);

		sidesLabel = new JLabel("Sides:");
		sidesLabel.setBounds(15, 100, 70, 25);

		dessertsLabel = new JLabel("Desserts:");
		dessertsLabel.setBounds(15, 135, 70, 25);

		main.add(entreesLabel);
		main.add(sidesLabel);
		main.add(saladsLabel);
		main.add(dessertsLabel);
		main.add(createMenuLabel);
		main.add(finMenuLabel);
		main.add(genMenuLabel);

		entreesCombo = new JComboBox<Entree>();
		entreesCombo.setBounds(90,30,195,25);

		sidesCombo = new JComboBox<Side>();
		sidesCombo.setBounds(90,65,195,25);
		
		saladsCombo = new JComboBox<Salad>();
		saladsCombo.setBounds(90,100,195,25);

		dessertsCombo = new JComboBox<Dessert>();
		dessertsCombo.setBounds(90,135,195,25);

		main.add(entreesCombo);
		main.add(saladsCombo);
		main.add(sidesCombo);
		main.add(dessertsCombo);

		createMenuButton = new JButton("Create Menu with Dishes Above");
		createMenuButton.setBounds(15,170,270,30);

		randomMenuButton = new JButton("Generate a Random Menu");
		randomMenuButton.setBounds(15,280,270,30);

		minMenuButton = new JButton("Generate a Minimum Calorie Menu");
		minMenuButton.setBounds(15,315,270,30);

		maxMenuButton = new JButton("Generate a Maximum Calorie Menu");
		maxMenuButton.setBounds(15,350,270,30);
		
		detailsButton = new JButton("Details");
		detailsButton.setBounds(320,350,90,25);

		deleteButton = new JButton("Delete All");
		deleteButton.setBounds(410,350,90,25);

		saveButton = new JButton("Save All");
		saveButton.setBounds(500,350,90,25);
		
		listModel = new DefaultListModel<Menu>();
		list = new JList<Menu>(listModel);
		list.setBounds(350,40,210,300);
		list.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		list.addListSelectionListener(this);

		main.add(createMenuButton);
		main.add(randomMenuButton);
		main.add(minMenuButton);
		main.add(maxMenuButton);
		main.add(detailsButton);
		main.add(deleteButton);
		main.add(saveButton);
		main.add(list);

		//create menu button, reads combo boxes, creates new menu, adds it to list box, and adds it to Menu array list
		
		createMenuButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Entree sEntree = (Entree) entreesCombo.getSelectedItem();
				Side sSide = (Side) sidesCombo.getSelectedItem();
				Salad sSalad = (Salad) saladsCombo.getSelectedItem();
				Dessert sDessert = (Dessert) dessertsCombo.getSelectedItem();

				String menuName = JOptionPane.showInputDialog("Name for the menu?");
				if(menuName != null){
					Menu m = new Menu(menuName,sEntree,sSide,sSalad,sDessert);
					listModel.addElement(m);
					allMenus.add(m);
				}
			}
		});

		//delete button, removes all items from list box and arraylist of menus
		
		deleteButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				allMenus.removeAll(allMenus);
				listModel.removeAllElements();
			}
		});

		//save button, writes all menus to menus.txt and displays message
		
		saveButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				FileManager.writeMenu("data/menus.txt", allMenus);
				JOptionPane.showMessageDialog(null,allMenus.size() + " Menus saved to menus.txt");
			}
		});

		//random button, creates a random menu and adds it to box and array
		
		randomMenuButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String menuName = JOptionPane.showInputDialog("Name the menu");
				Menu randMenu = menuManager.randomMenu(menuName.toString());
				listModel.addElement(randMenu);
				allMenus.add(randMenu);
			}
		});

		//minimum calorie menu button, calls method and adds new menu to list and array
		
		minMenuButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Menu minMenu = menuManager.minCaloriesMenu("Lowest Calorie Menu");
				listModel.addElement(minMenu);
				allMenus.add(minMenu);
			}
		});

		//maximum calorie menu button, calls method and adds new menu to list and array
		
		maxMenuButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Menu maxMenu = menuManager.maxCaloriesMenu("Highest Calorie Menu");
				listModel.addElement(maxMenu);
				allMenus.add(maxMenu);
			}
		});

		//details button, reads selected menu from list and calls the details pane method
		
		detailsButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					detailsPane(listModel.elementAt(list.getSelectedIndex()));
				}
				catch (Exception f){
				}
			}
		});

		fillComboBoxes();
		main.setVisible(true);		
	}

	/**
	 * Method that reads each array list of item types and fills in the comboboxes
	 */
	
	public void fillComboBoxes(){
		for (Entree entree: menuManager.getEntrees()) entreesCombo.addItem(entree); 
		for (Side side: menuManager.getSides()) sidesCombo.addItem(side); 
		for (Salad side: menuManager.getSalads()) saladsCombo.addItem(side); 
		for (Dessert dessert: menuManager.getDesserts()) dessertsCombo.addItem(dessert); 
	}

	/**
	 * Details Pane form. Receives menu and displays all the details
	 * @param menu
	 */
	
	public static void detailsPane(Menu menu){
		JFrame frameDetails = new JFrame("Menu: " + menu);
		frameDetails.setLayout(null);
		frameDetails.setBounds(250,250,520,500);
		frameDetails.setResizable(false);
		frameDetails.setAlwaysOnTop(true);
		//Insets margins = new Insets(1,3,1,1);

		JLabel entreesLabel1 = new JLabel("Entree:");
		entreesLabel1.setBounds(15, 30, 70, 25);

		JLabel sidesLabel1 = new JLabel("Side:");
		sidesLabel1.setBounds(15, 170, 70, 25);
		
		JLabel saladsLabel1 = new JLabel("Salad:");
		saladsLabel1.setBounds(15, 100, 70, 25);

		JLabel dessertsLabel1 = new JLabel("Dessert:");
		dessertsLabel1.setBounds(15, 240, 70, 25);

		JLabel caloriesLabel = new JLabel("Total Calories (Kc):");
		caloriesLabel.setBounds(15, 320, 90, 35);

		JLabel priceLabel = new JLabel("Total Price:");
		priceLabel.setBounds(15, 400, 90, 35);

		JTextArea textArea1 = new JTextArea(3,40);
		textArea1.setBounds(90,30,375,50);
		textArea1.setBorder(BorderFactory.createLineBorder(Color.RED));

		JTextArea textArea2 = new JTextArea(3,40);
		textArea2.setBounds(90,100,375,50);
		textArea2.setBorder(BorderFactory.createLineBorder(Color.BLUE));

		JTextArea textArea3 = new JTextArea(3,40);
		textArea3.setBounds(90,170,375,50);
		textArea3.setBorder(BorderFactory.createLineBorder(Color.GREEN));

		JTextArea textArea4 = new JTextArea(3,40);
		textArea4.setBounds(90,240,375,50);
		textArea4.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		JTextArea textArea5 = new JTextArea(1,10);
		textArea5.setBounds(110,325,60,20);
		textArea5.setBorder(BorderFactory.createLineBorder(Color.ORANGE));

		JTextArea textArea6 = new JTextArea(1,10);
		textArea6.setBounds(110,410,60,20);
		textArea6.setBorder(BorderFactory.createLineBorder(Color.CYAN));

		frameDetails.add(entreesLabel1);
		frameDetails.add(sidesLabel1);
		frameDetails.add(saladsLabel1);
		frameDetails.add(dessertsLabel1);
		frameDetails.add(caloriesLabel);
		frameDetails.add(priceLabel);
		frameDetails.add(textArea1);
		frameDetails.add(textArea2);
		frameDetails.add(textArea3);
		frameDetails.add(textArea4);
		frameDetails.add(textArea5);
		frameDetails.add(textArea6);

		textArea1.setText(menu.getEntree() + "\n" + menu.getEntree().getDescription() + "\nCalories: " + menu.getEntree().getCalories() + "   Price: $" + menu.getEntree().getPrice());
		textArea2.setText(menu.getSalad() + "\n" + menu.getSalad().getDescription() + "\nCalories: " + menu.getSalad().getCalories() + "   Price: $" + menu.getSalad().getPrice());
		textArea3.setText(menu.getSide() + "\n" + menu.getSide().getDescription() + "\nCalories: " + menu.getSide().getCalories() + "   Price: $" + menu.getSide().getPrice());
		textArea4.setText(menu.getDessert() + "\n" + menu.getDessert().getDescription() + "\nCalories: " + menu.getDessert().getCalories() + "   Price: $" + menu.getDessert().getPrice());
		textArea5.setText("" + menu.totalCalories());
		textArea6.setText("$  " + menu.totalPrice());

		frameDetails.setVisible(true);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}