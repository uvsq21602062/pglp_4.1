package fr.uvsq.uvsq21602062.projet_maven;

import java.util.ArrayList;

/**
 * Classe utilisant le patern de conception Composite
 * pour materialiser un groupe de personnel.
 * @author jean
 *
 */
public class CompositePersonnel {
	/**
	 * Collection de Personnel
	 */
	ArrayList<Personnel> listePersonnel;
	
	/**
	 * Constructeur
	 */
	public CompositePersonnel() {
		this.listePersonnel = new ArrayList<Personnel>();
	}
	
	/**
	 * Méthode s'occuppant de l'ajout
	 */
	public void ajouter(Personnel p) {
		this.listePersonnel.add(p);
	}
	
	/**
	 * Méthode permettant d'obtenir un Personnel par son nom et son prénom
	 */
	public Personnel obtenir(String nom, String prenom) {
		for(int i = 0; i < this.listePersonnel.size(); i++) {
			if(this.listePersonnel.get(i).getNom() == nom && this.listePersonnel.get(i).getPrenom() == prenom)
				return this.listePersonnel.get(i);
		}
		return null;
	}
}
