package fr.pizzeria.dao;

import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.model.Pizza;

public interface PizzaDao {
		
		Pizza[] findAll();
		void save(Pizza p) throws SavePizzaException;
		void updatePizza(int id, Pizza p) throws UpdatePizzaException;
		void deletePizza(int id) throws DeletePizzaException;
}

