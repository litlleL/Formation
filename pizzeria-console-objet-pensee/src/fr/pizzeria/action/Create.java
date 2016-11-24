package fr.pizzeria.action;

import fr.pizzeria.ihm.IhmUtil;

public class Create extends MenuInterface{

	private IhmUtil ihmUtil;
	
	public Create(IhmUtil ihmUtil) {
		super();
		this.setLibelle("Ajouter une pizza");
		this.setIhmUtil(ihmUtil);
	}

	@Override
	public void executeAction() {
		// TODO Auto-generated method stub
		
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
