package fr.pizzeria.ihm;

import java.util.Scanner;

import fr.pizzeria.action.Create;
import fr.pizzeria.action.Delete;
import fr.pizzeria.action.Exit;
import fr.pizzeria.action.List;
import fr.pizzeria.action.MenuInterface;
import fr.pizzeria.action.Update;

public class Menu  {

	MenuInterface [] listeOutils = new  MenuInterface[5];

	Scanner reader = new Scanner(System.in);
	
	
	public Menu(IhmUtil ihmUtil){
		this.listeOutils[0] = new List(ihmUtil);
		this.listeOutils[1] = new Create(ihmUtil);
		this.listeOutils[2] = new Update(ihmUtil);
		this.listeOutils[3] = new Delete(ihmUtil);
		this.listeOutils[4] = new Exit(ihmUtil);

		start();
	}

	private void start() {
		do {
			showMenu();
			executeAction();
		} while (true);
	}

	private void showMenu() {
		for (int listeur = 0; listeur < listeOutils.length; listeur++) {
			if (listeur != 4) {
				System.out.print(listeur + 1 + " ");
				listeOutils[listeur].show();
			}
			else{
				System.out.print("99");
				listeOutils[listeur].show();
			}
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
