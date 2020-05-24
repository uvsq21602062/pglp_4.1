package fr.uvsq.uvsq21602062.projet_maven;

/**
 * Application prncipal reposant sur le patern singleton.
 * @author jean
 *
 */
public class AppSingleton {
	/**
	 * Attribut stockant une instance de cettte classe.
	 */
	private static AppSingleton INSTANCE = null;
	/**
	 * Constructeur privé (suivant le patern singleton)
	 */
	private AppSingleton() {
		// Vide car rien à faire.
	}
	
	/**
	 * Permet d'obtenir une instance de la classe.
	 */
	public static AppSingleton getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new AppSingleton();
		}
		return INSTANCE;
	}
	
	public void run() {
		System.out.println("Bonjour");
		
		System.out.println("Au revoir");
	}
	
	
	/**
	 * Méthode Main
	 * @param args
	 */
	public static void main(String[] args) {
		getInstance().run();

	}

}
