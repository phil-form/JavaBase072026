package OOP.Exercices.Serie1;

public class Voiture {
    public String marque;
    public int vitesse;

    public Voiture(String marque) {
        this.marque = marque;
    }

    public void accelerer(int dv) {
        vitesse += dv;
    }

    public void freiner(int dv) {
        if(vitesse < dv) {
            vitesse = 0;
            return;
        }

        vitesse -= dv;
    }

    public void afficher() {
        System.out.println(marque + " roule a " + vitesse + "kph");
    }
}
