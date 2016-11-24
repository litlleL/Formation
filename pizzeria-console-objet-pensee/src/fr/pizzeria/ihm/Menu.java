package fr.pizzeria.ihm;

import java.util.Scanner;

import fr.pizzeria.action.Create;
import fr.pizzeria.action.Delete;
import fr.pizzeria.action.Exit;
import fr.pizzeria.action.List;
import fr.pizzeria.action.MenuInterface;
import fr.pizzeria.action.Update;
import fr.pizzeria.dao.PizzaDao;

public class Menu  {

	MenuInterface [] listeOutils = new  MenuInterface[5];
	boolean exit;

	Scanner reader = new Scanner(System.in);
	
	
	public Menu(IhmUtil ihmUtil){
		this.listeOutils[0] = new List(ihmUtil);
		this.listeOutils[1] = new Create(ihmUtil);
		this.listeOutils[2] = new Update();
		this.listeOutils[3] = new Delete();
		this.listeOutils[4] = new Exit();

		start();
	}

	private void start() {
		do {
			showMenu();
			executeAction();
		} while (!exit);
	}

	private void showMenu() {
		for (int listeur = 0; listeur < listeOutils.length; listeur++) {
			System.out.print(listeur + 1 + " ");
			listeOutils[listeur].show();
		}
	}

	private void executeAction() {
		System.out.println("Faites un choix");
		String value = reader.next();
		
		if(Integer.parseInt(value) < 5){
			this.listeOutils[Integer.parseInt(value) - 1].executeAction();
		}
		else if (Integer.parseInt(value) == 99) {
			this.listeOutils[listeOutils.length - 1].executeAction();
		}
	}

}
