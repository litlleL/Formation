package fr.pizzeria.action;

import fr.pizzeria.ihm.IhmUtil;
import fr.pizzeria.model.Pizza;

public class Delete extends MenuInterface{

	private IhmUtil ihmUtil;
	
	

	public Delete(IhmUtil ihmUtil) {
		super();
		this.setIhmUtil(ihmUtil);
		this.setLibelle("Supprimer une pizza");
	}

	@Override
	public void executeAction() {
		for(Pizza p : this.ihmUtil.getPizzaDao().findAll()) {
			System.out.println(p);
		}
		

		System.out.println("Veuillez choisir la pizza à supprimer\n");
		
		int choix;
		choix = this.ihmUtil.getScanner().nextInt();

		
		this.ihmUtil.getPizzaDao().deletePizza(this.ihmUtil.getPizzaDao().findAll()[choix].getId());
	}

	@Override
	public void show() {
		System.out.println(this.getLibelle());
	}
	
	public IhmUtil getIhmUtil() {
		return ihmUtil;
	}

	public void setIhmUtil(IhmUtil ihmUtil) {
		this.ihmUtil = ihmUtil;
	}
}
