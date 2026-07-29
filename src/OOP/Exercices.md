# Chapitre 2 — Le concept de Classe

*On écrit des classes avec des attributs, on crée des objets (`new`) et on lit/écrit leurs attributs. Pas encore de méthodes ni de constructeurs.*

### Exo 2.1 — Classe `Livre`
Écris une classe `Livre` avec les attributs `titre` (String), `auteur` (String) et `nombrePages` (int).
Dans le `main`, crée un objet, remplis ses attributs, puis affiche-les.

Squelette de départ :
```java
class Livre {
    public String titre;
    public String auteur;
    public int nombrePages;
}
```
**Résultat attendu**
```
Titre  : Le Petit Prince
Auteur : Saint-Exupery
Pages  : 96
```

### Exo 2.2 — Classe `Point`
Écris une classe `Point` avec deux attributs `x` et `y` (int).
Crée **deux** points, donne-leur des coordonnées, puis affiche-les au format `(x, y)`.

**Résultat attendu**
```
Point A : (3, 5)
Point B : (-2, 7)
```

### Exo 2.3 — Un tableau d'objets `Etudiant`
Écris une classe `Etudiant` avec `nom` (String), `age` (int) et `moyenne` (double).
Dans le `main`, crée un **tableau de 3 étudiants**, remplis-les, puis affiche chacun sur une ligne.

**Résultat attendu**
```
Alice, 20 ans, moyenne 14.5
Bob, 22 ans, moyenne 11.0
Chloe, 19 ans, moyenne 16.2
```

### Exo 2.4 — Classe `Rectangle` (le calcul reste dans le `main`)
Écris une classe `Rectangle` avec `largeur` et `hauteur` (double).
Crée un rectangle, affiche ses dimensions, puis **calcule son aire dans le `main`** à partir de ses attributs (à ce stade, la classe ne sait encore rien « faire » elle-même).

**Résultat attendu** (avec largeur 4, hauteur 3)
```
Rectangle 4.0 x 3.0
Aire : 12.0
```
> 💡 Garde ce constat en tête : au chapitre suivant, ce calcul deviendra une **méthode** de la classe `Rectangle`.
 
---

# Chapitre 3 — Les méthodes

*On ajoute aux classes des méthodes d'instance : les comportements de l'objet, qui utilisent ses attributs. Toujours pas de constructeur.*

### Exo 3.1 — `Rectangle` qui sait se mesurer
Reprends `Rectangle` et ajoute deux méthodes : `aire()` et `perimetre()` (elles renvoient un `double`).
Depuis le `main`, crée un rectangle et affiche les résultats des deux méthodes.

Squelette :
```java
class Rectangle {
    public double largeur;
    public double hauteur;
 
    public double aire() {
        // à compléter
    }
 
    public double perimetre() {
        // à compléter
    }
}
```
**Résultat attendu** (largeur 4, hauteur 3)
```
Aire      : 12.0
Perimetre : 14.0
```

### Exo 3.2 — `CompteBancaire`
Écris une classe `CompteBancaire` avec un attribut `solde` (double) et trois méthodes :
- `deposer(double montant)` — ajoute au solde,
- `retirer(double montant)` — retire du solde **seulement si** le solde est suffisant (sinon affiche un message),
- `afficherSolde()` — affiche le solde courant.
  **Résultat attendu** (solde initial 100, on dépose 50, on retire 30, puis on tente de retirer 200)
```
Solde : 100.0
Solde : 150.0
Solde : 120.0
Retrait refuse : solde insuffisant
Solde : 120.0
```

### Exo 3.3 — `Cercle`
Écris une classe `Cercle` avec un attribut `rayon` (double) et les méthodes `aire()` et `circonference()` (utilise `Math.PI`).

**Résultat attendu** (rayon 2)
```
Aire          : 12.566370614359172
Circonference : 12.566370614359172
```
> (Oui, pour r = 2 les deux valeurs coïncident : c'est une bonne occasion de vérifier ses formules !)

### Exo 3.4 — `Etudiant` qui calcule sa moyenne
Écris une classe `Etudiant` avec `nom` (String) et un tableau `notes` (int[]).
Ajoute :
- `moyenne()` — renvoie la moyenne des notes (`double`),
- `aReussi()` — renvoie `true` si la moyenne est ≥ 10.
  **Résultat attendu** (notes {12, 15, 8})
```
Moyenne de Alice : 11.666666666666666
A reussi : true
```

### Exo 3.5 — `Compteur`
Écris une classe `Compteur` avec un attribut `valeur` (int) et les méthodes `incrementer()`, `decrementer()` et `reset()`. Teste-les dans le `main` en affichant `valeur` après chaque opération.

**Résultat attendu**
```
0
1
2
1
0  (apres reset)
```
 
---

# Chapitre 4 — Les constructeurs

*On ajoute des constructeurs pour initialiser l'objet dès sa création, avec le mot-clé `this`. On peut aussi en écrire plusieurs (surcharge).*

### Exo 4.1 — Constructeur de `Point`
Reprends `Point` et ajoute un constructeur `Point(int x, int y)`.
Dans le `main`, crée les points **en une seule ligne** : `Point a = new Point(3, 5);`.

Squelette :
```java
class Point {
    public int x;
    public int y;
 
    public Point(int x, int y) {
        // initialiser this.x et this.y
    }
}
```
**Résultat attendu**
```
Point A : (3, 5)
Point B : (-2, 7)
```

### Exo 4.2 — Constructeur de `Livre`
Ajoute à `Livre` un constructeur qui reçoit `titre`, `auteur` et `nombrePages` et initialise les trois attributs (avec `this`).
Crée un livre en une ligne et affiche ses infos.

**Résultat attendu**
```
Le Petit Prince, de Saint-Exupery (96 pages)
```

### Exo 4.3 — Surcharge : `Rectangle` et carré
Donne à `Rectangle` **deux** constructeurs :
- `Rectangle(double largeur, double hauteur)`,
- `Rectangle(double cote)` — pour un carré (largeur = hauteur = côté).
  Crée un rectangle 4×3 et un carré de côté 5, puis affiche l'aire de chacun (méthode `aire()` du chapitre 3).

**Résultat attendu**
```
Aire du rectangle : 12.0
Aire du carre     : 25.0
```

### Exo 4.4 — `CompteBancaire` avec solde de départ
Ajoute à `CompteBancaire` un constructeur qui reçoit le `numero` (String) et le `soldeInitial` (double).
Crée un compte avec un solde de départ, effectue un dépôt, puis affiche le numéro et le solde.

**Résultat attendu**
```
Compte BE-001 - Solde : 250.0
Compte BE-001 - Solde : 300.0
```

### Exo 4.5 — Récapitulatif : classe `Voiture`
Écris une classe `Voiture` complète, qui réunit les trois chapitres :
- **Attributs** : `marque` (String), `vitesse` (int, en km/h).
- **Constructeur** : `Voiture(String marque)` qui initialise la marque et met la vitesse à 0.
- **Méthodes** : `accelerer(int dv)` (augmente la vitesse), `freiner(int dv)` (diminue la vitesse sans passer sous 0), `afficher()` (affiche marque + vitesse).
  Dans le `main` : crée une voiture, accélère deux fois, freine une fois, et affiche l'état après chaque action.

**Résultat attendu**
```
Citroen roule a 0 km/h
Citroen roule a 30 km/h
Citroen roule a 80 km/h
Citroen roule a 60 km/h
```