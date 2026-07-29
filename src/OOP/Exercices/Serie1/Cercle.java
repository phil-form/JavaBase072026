package OOP.Exercices.Serie1;

public class Cercle {
    public double rayon;

    public double aire() {
        return Math.PI * (rayon * rayon);
    }

    public double circonference() {
        return 2 * Math.PI * rayon;
    }
}
