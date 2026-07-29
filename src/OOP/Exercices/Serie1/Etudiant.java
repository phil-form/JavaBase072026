package OOP.Exercices.Serie1;

import java.util.ArrayList;

public class Etudiant {
    public String nom;
    public int age;
    // Serie 1
    public double moyenne;

    // Serie 2
    public ArrayList<Integer> notes;

    public double getMoyenne() {
        int sum = 0;

        if(notes.size() == 0) {
            return sum;
        }

        for (int note : notes) {
            sum += note;
        }

        return ((double) sum) / notes.size();
    }

    public boolean aReussi() {
        return getMoyenne() >= 10;
    }
}
