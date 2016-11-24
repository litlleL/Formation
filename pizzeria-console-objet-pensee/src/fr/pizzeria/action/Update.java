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
