package fr.pizzeria.action;

import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.exception.UpdatePizzaException;

public abstract class MenuInterface {

	private String libelle;
	
	public abstract void executeAction() throws UpdatePizzaException, DeletePizzaException, SavePizzaException;
	public abstract void show();
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
}
