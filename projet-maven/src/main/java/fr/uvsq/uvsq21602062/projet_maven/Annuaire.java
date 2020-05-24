package fr.uvsq.uvsq21602062.projet_maven;

import java.util.ArrayList;

/**
 * Classe représentant l'annuaire de l'organisation.
 * @author jean
 *
 */
public class Annuaire {
	/**
	 * Attribut liste stockant les groupes d'employé par leur hierarchie.
	 */
	private ArrayList<CompositePersonnel> listeGroupe;

	/**
	 * Constructeur
	 */
	public Annuaire() {
		this.listeGroupe = new ArrayList<CompositePersonnel>();
	}
	
	/**
	 * Méthode permettant d'ajouter un personnel dans la liste en indiquant son niveau de hierarchie
	 */
	public void ajouter(Personnel p, int niveau) {
		try {
			this.listeGroupe.get(niveau).ajouter(p);
		}
		catch(IndexOutOfBoundsException e) {
			CompositePersonnel nouveauGroupe = new CompositePersonnel();
			nouveauGroupe.ajouter(p);
			this.listeGroupe.add(nouveauGroupe);
		}
	}
	
	/**
	 * Get de l'attribut listeGroupe
	 * @return
	 */
	public ArrayList<CompositePersonnel> getListGroupe(){
		return listeGroupe;
	}
	
	/**
	 * Méthode permettant d'afficher les personnels groupés par leur fonction
	 */
	public void afficherParFonction() {
		
	}
	
	/**
	 * Méthode permettant d'afficher les personnels groupés par leur hierarchie
	 */
	public void afficherParHierarchie() {
		
	}
}
