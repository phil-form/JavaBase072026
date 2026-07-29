package OOP.Class;

public class Employer {
     public String nom;
     public String prenom;
     public int salaire;

     // Constructeur par défaut.
     // -> Créer avec la class, donc s'il est vide pas besoin de l'ajouter.
     public Employer() {
         // Ici en général on va set les membres de l'objet
         // Pour s'assurer d'avoir un objet stable (donc avec des variables
         // initialisées), après l'appel du constructeur.
         this.salaire = 0;
         // En général pour ce genre de cas, on ne fais simplement pas de constructeur par
         // défaut, et on force le passage de valeur -> voir Person
         this.nom = "TOSET";
         this.prenom = "TOSET";
     }

     public Employer(String fullName) {
         // Je divise ma string sur les espaces avec split.
         // Ce qui va me retourner  un tableau de string
         // "Nom Prenom" -> { "Nom", "Prenom" }
         // \s -> expression régulières pour dire n'importe quel espace.
         String[] parts = fullName.split("\s");
         this.nom = parts[0];
         this.prenom = parts[1];
         this.salaire = 0;
     }

     public Employer(String nom, String prenom) {
         // Ici comme nom et prenom sont des paramètre de la fonction
         // ici le "this" est obligatoire !!
         this.nom = nom;
         this.prenom = prenom;
         this.salaire = 0;
     }

     public Employer(String nom, String prenom, int salaire) {
         this.prenom = prenom;
         this.nom = nom;
         this.salaire = salaire;
     }

     // public void augmenter(Employer this, int augmentation)
     public void augmenter(int augmentation) {
//         salaire += augmentation;
//         -> est égale à !!! SAUF SI UN PARAMÈTRE ou une variable du même nom se trouve dans ma methode !! :
         this.salaire += augmentation;
     }

     public void augmenter(float percent) {
        salaire += (salaire * percent);
     }

     public void augmenter(int augmentation, float increase) {
         salaire += augmentation + (salaire * increase);
     }

     public void augmentation() {
         salaire += salaire * 0.01f;
     }
}