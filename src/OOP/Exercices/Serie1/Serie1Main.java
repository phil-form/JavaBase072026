package OOP.Exercices.Serie1;

import java.util.ArrayList;

public class Serie1Main {
    public static void main() {
        // 2.1
        Livre livre = new Livre();
        livre.titre = "Le petit prince";
        livre.auteur = "Saint-Exupery";
        livre.nombrePages = 96;

        System.out.println("Titre : " + livre.titre);
        System.out.println("Auteur : " + livre.auteur);
        System.out.println("Nombre de pages : " + livre.nombrePages);

        // 2.2
        Point a = new Point();
        a.x = 3;
        a.y = 5;
        Point b = new Point();
        b.x = -2;
        b.y = 7;

        System.out.println("Point A(" + a.x +", " + a.y + ")");
        System.out.println("Point B(" + b.x +", " + b.y + ")");

        // 2.3
        Etudiant[] etudiants = new Etudiant[3];
        ArrayList<Etudiant> etudiants1 = new ArrayList<>(3);
        etudiants[0] = new Etudiant();
        Etudiant currentStudent = etudiants[0];
        currentStudent.nom = "Alice";
        currentStudent.age = 20;
        currentStudent.moyenne = 14.5;
        etudiants[1] = new Etudiant();
        currentStudent = etudiants[1];
        currentStudent.nom = "Bob";
        currentStudent.age = 22;
        currentStudent.moyenne = 11.0;
        etudiants[2] = new Etudiant();
        currentStudent = etudiants[2];
        currentStudent.nom = "Chloe";
        currentStudent.age = 19;
        currentStudent.moyenne = 16.2;

        for (Etudiant std: etudiants) {
            System.out.println(std.nom + ", " + std.age + ", moyenne " + std.moyenne);
        }

        // 2.4
        Rectangle r = new Rectangle();
        r.largeur = 4;
        r.hauteur = 3;
        System.out.println("Rectangle " + r.largeur + " x " + r.hauteur);
        double air = r.largeur * r.hauteur;
        System.out.println("Air : " + air);

        // 3.1
        System.out.println("Air (methode) : " + r.aire());
        System.out.println("Perimetre : " + r.perimetre());

        // 3.2
        CompteBancaire cb = new CompteBancaire();
        cb.solde = 100;
        cb.afficherSolde();
        cb.deposer(50);
        cb.afficherSolde();
        cb.deposer(-50);
        cb.afficherSolde();
        cb.retirer(50);
        cb.afficherSolde();
        cb.retirer(5000);
        cb.afficherSolde();

        Cercle cer = new Cercle();
        cer.rayon = 2;
        System.out.println("Cercle Aire :" + cer.aire());
        System.out.println("Cercle Circonference :" + cer.circonference());

        // 3.4
        Etudiant std1 = new Etudiant();
        std1.nom = "Alice";
        std1.age = 12;
        std1.notes = new ArrayList<>();
        std1.notes.add(10);
        std1.notes.add(14);
        std1.notes.add(17);
        std1.notes.add(13);

        System.out.println(std1.nom + " Moyenne : " + std1.getMoyenne());
        System.out.println(std1.nom + " A reussi : " + std1.aReussi());

        // 3.5
        Compteur cmp = new Compteur();
        cmp.reset();
        System.out.println(cmp.val);
        cmp.increment();
        System.out.println(cmp.val);
        cmp.increment();
        System.out.println(cmp.val);
        cmp.decrement();
        System.out.println(cmp.val);
        cmp.reset();
        System.out.println(cmp.val);

        // 4.1
        Point c = new Point(3, 5);
        Point d = new Point(-2, 7);

        System.out.println("Point C : (" + c.x + ", " + c.y + ")");
        System.out.println("Point d : (" + d.x + ", " + d.y + ")");

        // 4.2
        Livre l1 = new Livre("Le petit prince", "Saint-Exubery", 100);
        System.out.println("Titre : " + l1.titre);
        System.out.println("Auteur : " + l1.auteur);
        System.out.println("Nombre de pages : " + l1.nombrePages);

        // 4.3
        Rectangle r1 = new Rectangle(4, 3);
        Rectangle r2 = new Rectangle(5);

        System.out.println("Aire rectangle 1 : " + r1.aire());
        System.out.println("Aire rectangle 2 : " + r2.aire());

        // 4.4
        CompteBancaire c2 = new CompteBancaire("BE-001", 250);
        c2.afficherSolde();
        c2.deposer(50);
        c2.afficherSolde();

        // 4.5
        Voiture v = new Voiture("Citroen");
        v.afficher();
        v.accelerer(30);
        v.afficher();
        v.accelerer(50);
        v.afficher();
        v.freiner(20);
        v.afficher();
    }
}
