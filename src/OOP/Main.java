package OOP;

import OOP.Class.Employer;
import OOP.Class.Person;

import java.util.ArrayList;

public class Main {
    public static void main() {
        Employer employer = new Employer();
        employer.salaire = 1234;
        employer.nom = "Test";
        employer.prenom = "Asdf";


        Employer employer2 = new Employer();
        employer2.salaire = 4323;
        employer2.nom = "ASdf";
        employer2.prenom = "Qwer";

        System.out.println("employer salaire : " + employer.salaire);
        System.out.println("employer2 salaire : " + employer2.salaire);
        // employer.augementer(employer, 100);
        employer.augmenter(100);
        System.out.println("employer salaire : " + employer.salaire);
        System.out.println("employer2 salaire : " + employer2.salaire);
        employer2.augmenter(0.1f);
        System.out.println("employer salaire : " + employer.salaire);
        System.out.println("employer2 salaire : " + employer2.salaire);

        // Ici java refuse de compiler car le constructeur par défaut n'existe pas.
//        Person p = new Person();
        // Le seul constructeur existant m'oblige à passer le nom et le prénom.
        Person p = new Person("Test", "Asdf");

        ArrayList<Person> persons = new ArrayList<>(3);

    }
}
