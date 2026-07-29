package OOP.Exercices.Serie1;

public class Rectangle {
    // Serie 2
    public double largeur;
    public double hauteur;

    public Rectangle() {

    }

    // Serie 4
    public Rectangle(double cote) {
        this.hauteur = cote;
        this.largeur = cote;
    }

    public Rectangle(double largeur, double longeur) {
        this.largeur = largeur;
        this.hauteur = longeur;
    }

    // Serie 3
    public double aire() {
        return hauteur * largeur;
    }

    public double perimetre() {
        return 2 * (hauteur + largeur);
    }
}
