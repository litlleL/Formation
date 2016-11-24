package fr.pizzeria.action;

public class Delete extends MenuInterface{

	public Delete() {
		super();
		this.setLibelle("Supprimer une pizza");
	}

	@Override
	public void executeAction() {
		
	}

	@Override
	public void show() {
		System.out.println(this.getLibelle());
	}

}
