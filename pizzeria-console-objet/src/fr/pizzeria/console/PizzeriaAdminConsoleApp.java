package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {

	static Scanner sc = new Scanner(System.in);
	
	public static Pizza[]tableauPizza ={ 					
			new Pizza(0, "PEP", "peperoni", 12.50),
			new Pizza(1, "MAR", "margherita", 14.00),
			new Pizza(2, "REIN", "la reine", 11.50),
			new Pizza(3, "FRO", "4 fromage", 12.00),
			new Pizza(4, "CAN", "cannibale", 12.50),
			new Pizza(5, "SAV", "savoyarde", 13.00),
			new Pizza(6, "IND", "indienne", 14.00)
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value;
		Pizza.nbPizzas = 8;
		do{
			menu();
			value = sc.nextInt();
			switch (value) {
			case 1:
				System.out.println("Liste des pizzas");
				liste(tableauPizza);
				break;
			case 2:
				System.out.println("Ajout d'une nouvelle pizza");
				add(tableauPizza);
				break;
			case 3:
				System.out.println("Mise à jour d'une pizza");
				update(tableauPizza);
				break;
			case 4:
				System.out.println("Suppression d'une pizza");
				delete(tableauPizza);
			break;
			default:
				break;
			}
			
		}while(value != 99);
		sc.close();
	}
	

	private static void delete(Pizza[] tableauPizza2) {
		// TODO Auto-generated method stub
		boolean quit = false;
		boolean abandon = true;
		int pizzaChoisi;
		
		do{
			for (int listeur = 0; listeur < tableauPizza2.length; listeur++) {
				System.out.println(tableauPizza[listeur].id + ") " + tableauPizza2[listeur].code + " -> " + tableauPizza2[listeur].nom + " (" + tableauPizza2[listeur].prix +")");
			}
			
			System.out.println(" \n Veuillez choisir une pizza dans la liste à supprimer ou entrez 99 pour quitter");
			
			pizzaChoisi = sc.nextInt();
			
			if(pizzaChoisi == 99){
				abandon = false;
				quit = true;
			}
			else{
				if(tableauPizza[pizzaChoisi] != null){
					quit = true;
				}
			}
			
		}while(quit == false);
		if(abandon == true){
			Pizza[] pizzaTemp = new Pizza[tableauPizza2.length - 1];
			int index = 0;
			for (int listeur = 0; listeur < tableauPizza2.length; listeur++) {
				System.out.println(tableauPizza2[listeur].id + ") " + tableauPizza2[listeur].code + " -> " + tableauPizza2[listeur].nom + " (" + tableauPizza2[listeur].prix +")");
				if(tableauPizza2[listeur] != tableauPizza2[pizzaChoisi]){
					pizzaTemp[index] = tableauPizza2[listeur];
					index++;
				}
			}

			tableauPizza = pizzaTemp;
		}
	}


	private static void update(Pizza[] tableauPizza2) {
		// TODO Auto-generated method stub
		boolean quit = false;
		boolean abandon = false;

		int pizzaChoisi;
		do{
			for (int listeur = 0; listeur < tableauPizza2.length; listeur++) {
				System.out.println(tableauPizza[listeur].id + ") " + tableauPizza2[listeur].code + " -> " + tableauPizza2[listeur].nom + " (" + tableauPizza2[listeur].prix +")");
			}
			
			System.out.println(" \n Veuillez choisir une pizza dans la liste à modifier ou entrez 99 pour quitter");
			
			pizzaChoisi = sc.nextInt();
			
			if(pizzaChoisi == 99){
				abandon = true;
				quit = true;
			}
			else{
				if(tableauPizza[pizzaChoisi] != null){
					quit = true;
				}
			}
			
		}while(quit == false);
		
		if(abandon == false){
			System.out.println("Vous avez choisi la pizza : " + pizzaChoisi);
			String codePizza;
			System.out.println("Veuillez saisir le nouveau code \n");
			codePizza = sc.next();
			
			String nomPizza;
			System.out.println("Veuillez saisir le nouveau nom(sans espace) \n");
			nomPizza = sc.next();
			
			double prixPizza;
			System.out.println("Veuillez saisir le nouveau prix");
			prixPizza = sc.nextDouble();
			
			tableauPizza[pizzaChoisi].code = codePizza;
			tableauPizza[pizzaChoisi].nom = nomPizza;
			tableauPizza[pizzaChoisi].prix = prixPizza;
		}
	}


	private static void add(Pizza[] tableauPizza2) {
		// TODO Auto-generated method stub
		String codePizza;
		System.out.println("Veuillez saisir le code \n");
		codePizza = sc.next();
		System.out.println(codePizza);
		String nomPizza;
		System.out.println("Veuillez saisir le nom(sans espace) \n");
		nomPizza = sc.next();
		System.out.println(nomPizza);
		
		Double prixPizza;
		System.out.println("Veuillez saisir le prix");
		prixPizza = sc.nextDouble();
		System.out.println(prixPizza);
		
		Pizza[] pizzaTemp = new Pizza[tableauPizza2.length+1];
		
		for (int listeur = 0; listeur < tableauPizza2.length; listeur++) {
			pizzaTemp[listeur] = tableauPizza2[listeur];
		}
		
		pizzaTemp[tableauPizza2.length] = new Pizza((tableauPizza2[tableauPizza2.length-1].id + 1), codePizza, nomPizza, prixPizza);
		
		tableauPizza = pizzaTemp;
		Pizza.nbPizzas ++;
	}


	private static void liste(Pizza[] tableauPizza2) {
		// TODO Auto-generated method stub
		for (int listeur = 0; listeur < tableauPizza2.length; listeur++) {
			System.out.println(tableauPizza[listeur].id + ") " + tableauPizza2[listeur].code + " -> " + tableauPizza2[listeur].nom + " (" + tableauPizza2[listeur].prix +")");
		}
		System.out.println("-----------" + Pizza.nbPizzas + " pizzas crée depuis l'initialisation du prog");
	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("***** Pizzeria Administration ***** \n"
				+ "1. Lister les pizzas \n"
				+ "2. Ajouter une nouvelle pizza \n"
				+ "3. Mettre à jour une pizza \n"
				+ "4. Supprimer une pizza \n"
				+ "99. Sortir");
	}

	

}
