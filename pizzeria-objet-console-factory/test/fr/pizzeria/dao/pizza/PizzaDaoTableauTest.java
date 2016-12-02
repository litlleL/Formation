package fr.pizzeria.dao.pizza;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.pizzeria.enumeration.CategoriePizza;
import fr.pizzeria.model.Pizza;

public class PizzaDaoTableauTest {
	static List<Pizza> pizzas;

	@BeforeClass
	public static void beforeClass() {
		pizzas = new ArrayList<>();
	}

	@Before
	public void setUp() {
		pizzas.add(new Pizza("MAR", "margherita", 12.50, CategoriePizza.VIANDE));
	}

	@Test
	public void testFindAll() {
		PizzaDaoTableau daoTableau = new PizzaDaoTableau();
		Assert.assertEquals(pizzas.get(0).getCode(), daoTableau.findAll().get(0).getCode());
	}

}
