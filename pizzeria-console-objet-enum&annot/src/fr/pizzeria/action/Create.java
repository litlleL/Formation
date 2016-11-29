package fr.pizzeria.action;

import fr.pizzeria.enumeration.CategoriePizza;
import fr.pizzeria.ihm.IhmUtil;
import fr.pizzeria.model.Pizza;

public class Create extends MenuInterface{

	private IhmUtil ihmUtil;
	
	public Create(IhmUtil ihmUtil) {
		super();
		this.setLibelle("Ajouter une pizza");
		this.setIhmUtil(ihmUtil);
	}

	@Override
	public void executeAction() {
		String codePizza;
		System.out.println("Veuillez saisir le code \n");
		codePizza = ihmUtil.getScanner().next();
		
		String nomPizza;
		System.out.println("Veuillez saisir le nom(sans espace) \n");
		nomPizza = ihmUtil.getScanner().next();
		
		Double prixPizza;
		System.out.println("Veuillez saisir le prix");
		prixPizza = ihmUtil.getScanner().nextDouble();
		
		this.ihmUtil.getPizzaDao().save(new Pizza(codePizza, nomPizza, prixPizza, CategoriePizza.VIANDE));
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
