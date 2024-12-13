/**
 * 
 */
package exemple.com.files;

/**
 * 
 */
public class Rectangle {
	
	//Variables
	private double longueur;
	private double largeur;
	
	//Constructeur
	public Rectangle() {
		this.longueur = 0;
		this.largeur = 0;
	}
	
	//Getters et Setters
	public double getLongueur() {
		return longueur;
	}
	
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	
	public double getLargeur() {
		return largeur;
	}
	
	
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	//Calculer la surface
	public double calculerSurface()
	{
		return (longueur * largeur);
	}
	
	//Calculer le primétre
	public double calculerPerimetre()
	{
		return 2 * (longueur + largeur);
	}
	
	public void afficherDetails() {
		System.out.println("Rectangle :");
		System.out.println("Longueur = " + longueur);
		System.out.println("Largueur = " + largeur);
		System.out.println("Surface = " + calculerSurface());
		System.out.println("Perimetre = " + calculerPerimetre());
	}
}
