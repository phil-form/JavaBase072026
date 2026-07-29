package OOP.Exercices.Serie1;

public class CompteBancaire {
    public double solde;
    public String numero;

    public CompteBancaire() {

    }

    public CompteBancaire(String numero, double soldeInitial) {
        this.solde = soldeInitial;
        this.numero = numero;
    }

    public void deposer(double montant) {
        if(montant < 0) {
            System.out.println("Montant négatif !!! ");
            return;
        }

        solde += montant;
    }

    public void retirer(double montant) {
        // Version 1
//        if(montant <= solde) {
//            solde -= montant;
//        } else {
//            System.out.println("Montant Insuffisant!");
//        }

        // Version 2
        if(montant > solde) {
            System.out.println("Montant Insuffisant!");
            return;
        }

        solde -= montant;
    }

    public void afficherSolde() {
        System.out.println("Solde du compte : " + solde + "€");
    }
}
