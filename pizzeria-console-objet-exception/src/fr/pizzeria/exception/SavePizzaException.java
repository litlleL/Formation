package fr.pizzeria.exception;

public class SavePizzaException extends Exception{

	@Override
	public String getMessage() {
		System.out.println("La pizza que vous avez rentrée n'a pas pu être"
				+ " ajouté à la liste");
		return super.getMessage();
	}
}
