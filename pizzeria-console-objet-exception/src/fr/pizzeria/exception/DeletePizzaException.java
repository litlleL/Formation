package fr.pizzeria.exception;

public class DeletePizzaException extends Exception{

	@Override
	public String getMessage() {
		System.out.println("La pizza que vous avez rentrée n'a pas pu être"
				+ " supprimé de la liste");
		return super.getMessage();
	}
}
