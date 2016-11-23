package fr.pizzeria.console;

import java.util.Scanner;

public class PizzeriaAdminConsoleApp {


	static int COLONNE = 3;
	static int LIGNE = 100000;

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value;

		String[][] tableauPizza= new String[COLONNE][LIGNE];
		init(tableauPizza);
		
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
				
				String codePizza;
				System.out.println("Veuillez saisir le code \n");
				codePizza = sc.next();
				
				String nomPizza;
				System.out.println("Veuillez saisir le nom(sans espace) \n");
				nomPizza = sc.next();
				
				String prixPizza;
				System.out.println("Veuillez saisir le prix");
				prixPizza = sc.next();
				
				int tailleTableau;
				tailleTableau = tableauPizza[0].length;
				int tailleTableauNextPosition = 0 ;
				for(int listeur = 0; listeur < tailleTableau; listeur ++ ){
					if(tableauPizza[0][listeur] != null){
						tailleTableauNextPosition = listeur + 1;
					}
				}

				System.out.println(tailleTableauNextPosition);
				tableauPizza[0][tailleTableauNextPosition] = codePizza;
				tableauPizza[1][tailleTableauNextPosition] = nomPizza;
				tableauPizza[2][tailleTableauNextPosition] = prixPizza;
					
			break;
			
			case 3:
				System.out.println("Mise à jour d'une pizza");
				tailleTableau = tableauPizza[0].length;
					update(tableauPizza);
			break;
			
			case 4:
				System.out.println("Suppression d'une pizza");
				delete(tableauPizza);
			break;
			
			case 99:
				System.out.println("Au revoir ^^\'");
			break;

			default:
				break;
			}
		}while(value != 99);
		
		sc.close();
	}


	private static void delete(String[][] tableauPizza) {
		// TODO Auto-generated method stub
		int tailleTableau;
		int pizzaChoisi;
		boolean quit = false;
		boolean abandon = false;
		tailleTableau = tableauPizza[0].length;
		
		do{
			tailleTableau = tableauPizza[0].length;
		
			for(int listeur = 0; listeur < tailleTableau; listeur ++ ){
				if(tableauPizza[0][listeur] != null){
					System.out.println(listeur + ") " + tableauPizza[0][listeur] + " -> " + tableauPizza[1][listeur] + "(" +  tableauPizza[2][listeur] + ")");
				}
			}
			System.out.println(" Veuillez choisir une pizza dans la liste à supprimer ou entrez 99 pour quitter");

			pizzaChoisi = sc.nextInt();
			if(pizzaChoisi == 99){
				abandon = true;
				quit = true;
			}
			else{
				if(tableauPizza[0][pizzaChoisi] != null){
					quit = true;
				}
			}
		}while(quit == false );
		
		if(abandon == false){
			System.out.println(pizzaChoisi);
			
			tableauPizza[0][pizzaChoisi] = null;
			tableauPizza[1][pizzaChoisi] = null;
			tableauPizza[2][pizzaChoisi] = null;
		}
	}


	private static void update(String[][] tableauPizza) {
		// TODO Auto-generated method stub
			int tailleTableau;
			int pizzaChoisi;
			boolean quit = false;
			boolean abandon = false;
			do{
				tailleTableau = tableauPizza[0].length;
			
				for(int listeur = 0; listeur < tailleTableau; listeur ++ ){
					if(tableauPizza[0][listeur] != null){
						System.out.println(listeur + ") " + tableauPizza[0][listeur] + " -> " + tableauPizza[1][listeur] + "(" +  tableauPizza[2][listeur] + ")");
					}
				}
				System.out.println(" Veuillez choisir une pizza dans la liste à modifier ou entrez 99 pour quitter");

				pizzaChoisi = sc.nextInt();
				if(pizzaChoisi == 99){
					abandon = true;
					quit = true;
				}
				else{
					if(tableauPizza[0][pizzaChoisi] != null){
						quit = true;
					}
				}
			}while(quit == false );
			
			if(abandon == false){
				System.out.println(pizzaChoisi);
				
				String codePizza;
				System.out.println("Veuillez saisir le nouveau code \n");
				codePizza = sc.next();
				
				String nomPizza;
				System.out.println("Veuillez saisir le nouveau nom(sans espace) \n");
				nomPizza = sc.next();
				
				String prixPizza;
				System.out.println("Veuillez saisir le nouveau prix");
				prixPizza = sc.next();
				
				tableauPizza[0][pizzaChoisi] = codePizza;
				tableauPizza[1][pizzaChoisi] = nomPizza;
				tableauPizza[2][pizzaChoisi] = prixPizza;
			}
			
	}


	private static void init(String[][] tableauPizza) {
		int tailleTableau;
		tailleTableau = tableauPizza[0].length;
		
		for(int listeur = 0; listeur < tailleTableau; listeur ++ ){
			tableauPizza[0][0] = "PEP";
			tableauPizza[1][0] = "pépéroni";
			tableauPizza[2][0] = "12.50";
			
			tableauPizza[0][1] = "MAR";
			tableauPizza[1][1] = "Marghérita";
			tableauPizza[2][1] = "14.00";
			
			tableauPizza[0][2] = "REI";
			tableauPizza[1][2] = "reine";
			tableauPizza[2][2] = "11.50";
			
			tableauPizza[0][3] = "FRO";
			tableauPizza[1][3] = "4 fromage";
			tableauPizza[2][3] = "12.00";
			
			tableauPizza[0][4] = "CAN";
			tableauPizza[1][4] = "Cannibale";
			tableauPizza[2][4] = "12.50";
			
			tableauPizza[0][5] = "SAV";
			tableauPizza[1][5] = "savoyarde";
			tableauPizza[2][5] = "13.00";
			
			tableauPizza[0][6] = "ORI";
			tableauPizza[1][6] = "L'oriental";
			tableauPizza[2][6] = "13.50";
			
			tableauPizza[0][7] = "IND";
			tableauPizza[1][7] = "Indienne";
			tableauPizza[2][7] = "14.00";
			
		}
	}


	private static void liste(String[][] tableauPizza) {
		// TODO Auto-generated method stub
		int tailleTableau;
		tailleTableau = tableauPizza[0].length;
		
		for(int listeur = 0; listeur < tailleTableau; listeur ++ ){
			if(tableauPizza[0][listeur] != null){
				System.out.println(listeur + ") " + tableauPizza[0][listeur] + " -> " + tableauPizza[1][listeur] + "(" +  tableauPizza[2][listeur] + ")");
			}
		}
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
