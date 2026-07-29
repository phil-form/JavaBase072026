package OOP.Exercices.Serie1;

public class Livre {
    public String titre;
    public String auteur;
    public int nombrePages;

    // pour éviter les conflits
    public Livre() {

    }

    public Livre(String titre, String auteur, int nombrePages) {
        this.titre = titre;
        this.auteur = auteur;
        this.nombrePages = nombrePages;
    }
}
