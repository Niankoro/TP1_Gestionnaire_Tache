import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.management.openmbean.ArrayType;

public class main {

	static ArrayList<Membre> arrMembre = new ArrayList<Membre>();
	static ArrayList<Tache> arrTache = new ArrayList<Tache>();
	static ArrayList<Assigne> arrAssigne = new ArrayList<Assigne>();

	static Scanner sc = new Scanner(System.in);

	// Ajouter un membre
	
	public static void addMembre() {
		System.out.println("=====================================");
		System.out.println("Enter ID: ");
		int id = 0;
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Entrer le nom de la personne: ");
		String nom = sc.nextLine();
		Membre mem = new Membre(id, nom);
		arrMembre.add(mem);

		System.out.println("=====================================");

	}

	// Supprimer un membre
	
	public static void deleteMembre(int id) {
		for (int i = 0; i < arrMembre.size(); i++) {
			if (arrMembre.get(i).getId_Membre() == id) {
				arrMembre.remove(i);
			} else {
				System.out.println("Ce membre n'existe pas");
				break;
			}
		}
		System.out.println("=====================================");
		
	}

	// Modifier un membre
	
	public static void modifierMembre() {
		System.out.println("=====================================");
		System.out.println("Entrer ID membre pour la modification: ");
		int id = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < arrMembre.size(); i++) {
			if (arrMembre.get(i).getId_Membre() == id) {
				System.out.println("Changer le nom de la personne: ");
				String nom = sc.nextLine();
				arrMembre.get(i).setNomMembre(nom);
			} else {
				System.out.println("Ce membre n'existe pas");
				break;
			}
		}
		System.out.println("=====================================");
	}

	// Lister tous les membres
	
	public static void showAllMembre() {
		System.out.println("=====================================");
		for (int i = 0; i < arrMembre.size(); i++) {
			System.out.println(arrMembre.get(i).toString());
			System.out.println("--------------------------");
		}
		System.out.println("=====================================");
	}

	// Ajouter une tache
	
	public static void addTache() {
		System.out.println("=====================================");
		System.out.println("Entrer ID tache: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Entrer le nom de tache: ");
		String nom = sc.nextLine();
		System.out.println("Entrer la description de tache: ");
		String description = sc.nextLine();
		System.out.println("Entrer le status de tache: ");
		String status = sc.nextLine();
		Tache ta = new Tache(id, nom, description, status);
		arrTache.add(ta);
		

		System.out.println("=====================================");
	}

	// Supprimer une tache
	
	public static void deleteTache(int id) {
		System.out.println("=====================================");
		System.out.println("Entrer ID de tache: ");
		for (int i = 0; i < arrTache.size(); i++) {
			if (arrTache.get(i).getId_tache() == id) {
				arrTache.remove(i);
			} else {
				System.out.println("Ce tache n'existe pas");
				break;
			}
		}
		System.out.println("=====================================");

	}

	// Modifier une tache
	
	public static void modifierTache() {
		System.out.println("=====================================");
		System.out.println("Entrer ID pour la modification: ");
		int id = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < arrTache.size(); i++) {
			if (arrTache.get(i).getId_tache() == id) {
				System.out.println("Entrer le nouveau nom de tache: ");
				String nom = sc.nextLine();
				System.out.println("Entrer la nouvelle description de tache: ");
				String description = sc.nextLine();
				System.out.println("Entrer le nouveau status de tache: ");
				String status = sc.nextLine();
				arrTache.get(i).setNom(nom);
				arrTache.get(i).setDescription(description);
				arrTache.get(i).setStatus(status);
			} else {
				System.out.println("Ce tache n'existe pas");
				break;
			}
		}
		System.out.println("=====================================");
			}

	public static void showAllTache() {

		for (int i = 0; i < arrTache.size(); i++) {
			System.out.println(arrTache.get(i).toString());
			System.out.println("--------------------------");
		}
	}

	public static void assigneTache() {
		System.out.println("=====================================");
		System.out.println("Entrer ID Assigne: ");
		int idAssigne = sc.nextInt();

		System.out.println("Entrer ID tache: ");
		int idTache = sc.nextInt();
		Tache ta = new Tache();

		for (int i = 0; i < arrTache.size(); i++) {
			if (arrTache.get(i).getId_tache() == idTache) {
				ta.setId_tache(idTache);
				ta.setNom(arrTache.get(i).getNom());
				ta.setDescription(arrTache.get(i).getDescription());
				ta.setStatus(arrTache.get(i).getStatus());

			}
		}
		System.out.println("Entrer ID du membre: ");
		int idMembre = sc.nextInt();

		Membre mem = new Membre();

		for (int i = 0; i < arrMembre.size(); i++) {
			if (arrMembre.get(i).getId_Membre() == idMembre) {
				mem.setId_Membre(idMembre);
				mem.setNomMembre(arrMembre.get(i).getNomMembre());

			}
		}

		Assigne ass = new Assigne(idAssigne, mem, ta);
		arrAssigne.add(ass);
		System.out.println("=====================================");
	}

	public static void showAllAssigne() {

		for (int i = 0; i < arrAssigne.size(); i++) {
			System.out.println(arrAssigne.get(i).show());
			System.out.println("--------------------------");
		}
	}

	// Lister les taches d'une personne
	
	public static void show_Own_Tache() {
		System.out.println("Entrer ID membre pour la recherche: ");
		int id = sc.nextInt();
		System.out.println("=====================================");
		System.out.println("Les taches du membre ID: " + id);
		for (int j = 0; j < arrAssigne.size(); j++) {
			if (id == arrAssigne.get(j).getMembre().getId_Membre()) {
				System.out.println(arrAssigne.get(j).getTache());
			}
		}
		System.out.println("=====================================");
	}

	// Chercher une tache par status
	
	public static void searchTache() {
		System.out.println("Entrer le status pour la recherche: ");
		String status_tache;
		status_tache = sc.nextLine();
		System.out.println("=====================================");
		System.out.println("Les taches avec status " + "(" + status_tache + "): ");
		for (int j = 0; j < arrTache.size(); j++) {
			if (status_tache.compareTo(arrTache.get(j).getStatus()) == 0) {
				System.out.println(arrTache.get(j).toString());
				break;
			}
		}
		System.out.println("=====================================");
	}

	public static String menu() {
		System.out.println("===>Gestion des Taches<===");
		System.out.println("1. Ajouter un membre.");
		System.out.println("2. Supprimer un membre");
		System.out.println("3. Modifier un membre");
		System.out.println("4. Lister tous les membres");
		System.out.println("5. Ajouter une tache.");
		System.out.println("6. Supprimer une tache");
		System.out.println("7. Modifier une tache");
		System.out.println("8. Lister tous les taches");
		System.out.println("9. Assigner une tache");
		System.out.println("10. Lister tous les assigne");
		System.out.println("11. Lister tous les taches d'un membre");
		System.out.println("12. Chercher une tache par status");
		System.out.println("Choisissez une option ci-dessus:");

		return sc.nextLine();
	}

	public static boolean verifyInput(Object val) {
		boolean rep = true;
		try {
			int v = Integer.parseInt(val.toString());
			return rep = true;
		} catch (Exception ex) {
			System.out.println("Valeur Saisie invalide !");
			return rep = false;
		}
	}

	public void lancer() {
		String choix = "";
		do {
			choix = menu();
			if (verifyInput(choix))
				operation(Integer.parseInt(choix));
			else
				choix = "";

		} while((choix != "1") || (choix != "2") || (choix != "3")  || (choix != "4")|| (choix != "5")|| (choix != "6")|| (choix != "7")|| (choix != "8")|| (choix != "9")|| (choix != "10")|| (choix != "11") || (choix != "12"));
	}

	public static void operation(int key) {
		switch (key) {
		case 1:
			System.out.println("Ajouter un membre:");
			addMembre();
			break;
		case 2:
			System.out.println("Supprimer un membre:");
			System.out.println("=====================================");
			System.out.println("Entrer ID membre pour l'élimination: ");
			deleteMembre(sc.nextInt());
			break;
		case 3:
			System.out.println("Modifier un membre");
			modifierMembre();
			break;
		case 4:
			System.out.println("Lister tous les membres:");
			showAllMembre();
			break;
		case 5:
			System.out.println("Ajouter une tache:");
			addTache();
			break;
		case 6:
			System.out.println("Supprimer une tache:");
			deleteTache(sc.nextInt());
			break;
		case 7:
			System.out.println("Modifier une tache:");
			modifierTache();
			break;
		case 8:
			System.out.println("Lister tous les taches:");
			showAllTache();
			break;
		case 9:
			System.out.println("Assigner une tache:");
			assigneTache();
			break;
		case 10:
			System.out.println("Lister tout les assignes:");
			showAllAssigne();
			break;
		case 11:
			System.out.println("Lister tous les taches d'un membre:");
			show_Own_Tache();
			break;
		case 12:
			System.out.println("Chercher une tache par status:");
			searchTache();
			break;
		case 13:
			break;
		}
	}

	public static void main(String[] args) {
		String choix = "";
		do {
			choix = menu();
			if (verifyInput(choix))
				operation(Integer.parseInt(choix));
			else
				choix = "";

		} while ((choix != "1") || (choix != "2") || (choix != "3")  || (choix != "4")|| (choix != "5")|| (choix != "6")|| (choix != "7")|| (choix != "8")|| (choix != "9")|| (choix != "10")|| (choix != "11") || (choix != "12"));
	}

}