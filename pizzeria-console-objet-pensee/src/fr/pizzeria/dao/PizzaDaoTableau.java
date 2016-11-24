package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza;

public class PizzaDaoTableau implements PizzaDao{
	
	private Pizza[] pizzas = {
			new Pizza(0, "PEP", "peperoni", 12.50),
			new Pizza(1, "MAR", "margherita", 14.00),
			new Pizza(2, "REIN", "la reine", 11.50),
			new Pizza(3, "FRO", "4 fromage", 12.00),
			new Pizza(4, "CAN", "cannibale", 12.50),
			new Pizza(5, "SAV", "savoyarde", 13.00),
			new Pizza(6, "IND", "indienne", 14.00)
	};

	@Override
	public Pizza[] findAll() {
		return pizzas;
	}

	@Override
	public void save(Pizza p) {
		
	}

}