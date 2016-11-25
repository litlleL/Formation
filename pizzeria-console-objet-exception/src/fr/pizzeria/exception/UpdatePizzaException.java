package fr.pizzeria.exception;

public class UpdatePizzaException extends Exception{

	
	@Override
	public String getMessage() {
		System.out.println("La pizza que vous avez rentrée n'a pas pu être"
				+ " mise à jour à la liste");
		return super.getMessage();
	}
}
