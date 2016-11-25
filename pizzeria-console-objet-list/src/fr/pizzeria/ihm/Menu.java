package fr.pizzeria.ihm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import fr.pizzeria.action.Create;
import fr.pizzeria.action.Delete;
import fr.pizzeria.action.Exit;
import fr.pizzeria.action.List;
import fr.pizzeria.action.MenuInterface;
import fr.pizzeria.action.Update;

public class Menu  {

	Map<Integer, MenuInterface> listeOutils = new HashMap<Integer, MenuInterface>();
	IhmUtil reader;
	
	
	public Menu(IhmUtil ihmUtil){
		listeOutils.put(0,new List(ihmUtil));
		listeOutils.put(1,new Create(ihmUtil));
		listeOutils.put(2,new Update(ihmUtil));
		listeOutils.put(3,new Delete(ihmUtil));
		listeOutils.put(4,new Exit(ihmUtil));
		this.reader = ihmUtil;
	}

	public void start() {
			showMenu();
			executeAction();
	}

	private void showMenu() {
		for(Entry<Integer, MenuInterface> entry : listeOutils.entrySet()){
			if (entry.getKey() != 4) {
				System.out.println((entry.getKey() + 1 )+" " + entry.getValue().getLibelle());
			}else{
				System.out.println("99 " + entry.getValue().getLibelle());
			}
		}
	}

	private void executeAction() {
		
		System.out.println("Faites un choix  \n");
		
		String value = reader.getScanner().next();
		
		if(Integer.parseInt(value) < 5){
			listeOutils.get(Integer.parseInt(value) - 1).executeAction();
			start();
		}else if (Integer.parseInt(value) == 99) {
			listeOutils.get(listeOutils.size() - 1).executeAction();
		}
	
	}

}
