package fr.pizzeria.action;

import fr.pizzeria.ihm.IhmUtil;
import fr.pizzeria.model.Pizza;

public class Update extends MenuInterface{

	private IhmUtil ihmUtil;
	
	public Update(IhmUtil ihmUtil) {
		super();
		this.setIhmUtil(ihmUtil);
		this.setLibelle("Mettre à jour une pizza");
	}

	@Override
	public void executeAction() {
		for(Pizza p : this.ihmUtil.getPizzaDao().findAll()) {
			System.out.println(p);
		}
		
		System.out.println("Veuillez choisir la pizza à modifier\n");
		
		int choix;
		choix = this.ihmUtil.getScanner().nextInt() - 1;

		
		String codePizza;
		System.out.println("Veuillez saisir le nouveau code \n");
		codePizza = ihmUtil.getScanner().next();
		
		String nomPizza;
		System.out.println("Veuillez saisir le nouveau nom(sans espace) \n");
		nomPizza = ihmUtil.getScanner().next();
		
		Double prixPizza;
		System.out.println("Veuillez saisir le nouveau prix");
		prixPizza = ihmUtil.getScanner().nextDouble();
		
		this.ihmUtil.getPizzaDao().updatePizza(this.ihmUtil.getPizzaDao().findAll().get(choix).getId(), new Pizza(this.ihmUtil.getPizzaDao().findAll().get(choix).getId(), codePizza, nomPizza, prixPizza, null));
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
