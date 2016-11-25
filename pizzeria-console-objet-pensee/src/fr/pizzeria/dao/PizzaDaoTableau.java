package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza;

public class PizzaDaoTableau implements PizzaDao{
	
	private Pizza[] pizzas = {
			new Pizza(0, "PEP", "peperoni", 12.50)
	};

	@Override
	public Pizza[] findAll() {
		return pizzas;
	}

	@Override
	public void save(Pizza p) {
		
		Pizza[] pizzaTemp = new Pizza[pizzas.length+1];
		
		for (int listeur = 0; listeur < pizzas.length; listeur++) {
			pizzaTemp[listeur] = pizzas[listeur];
		}
			pizzaTemp[pizzas.length] = p;
			pizzas = pizzaTemp;
			
	}

	@Override
	public void updatePizza(int id, Pizza p) {
		pizzas[id] = p;
	}

	@Override
	public void deletePizza(int id) {
		
		Pizza[] pizzaTemp = new Pizza[pizzas.length - 1];
		int index = 0;
		System.out.println(pizzaTemp.length);
		for (int listeur = 0; listeur < pizzas.length; listeur++) {
			System.out.println(pizzas[listeur].getId() + ") " + pizzas[listeur].getCode() + " -> " + pizzas[listeur].getNom() + " (" + pizzas[listeur].getPrix() +")");
			if(pizzas[listeur] != pizzas[id]){
				pizzaTemp[index] = pizzas[listeur];
				index++;
			}
		}
		
		pizzas = pizzaTemp;
	}

}