# Récapitulatif Java — Énoncés

---

## A. Variables, types, opérateurs

### A1 — Prix HT → TTC
À partir d'un prix hors taxe, calcule la TVA (21 %) et le prix TTC, puis affiche les trois montants.
*Notions : `double`, opérateurs `*` et `+`, concaténation.*

**Résultat attendu**
```
Prix HT   : 100.0 EUR
TVA (21%) : 21.0 EUR
Prix TTC  : 121.0 EUR
```

### A2 — Quotient et reste
Pour deux entiers `a` et `b`, affiche le quotient de la division entière et le reste.
*Notions : division entière `/` vs modulo `%`.*

**Résultat attendu** (avec `a = 17`, `b = 5`)
```
17 / 5 = 3 reste 2
```

---

## B. Conditions

### B1 — Mention d'une note
Pour une note sur 20, affiche la mention : `< 10` Échec, `10–11` Passable, `12–13` Assez bien, `14–15` Bien, `≥ 16` Très bien.
*Notions : `if` / `else if` / `else`.*

**Résultat attendu** (avec `note = 14`)
```
Note 14/20 -> Bien
```

### B2 — Nom du jour
À partir d'un numéro de 1 à 7, affiche le nom du jour ; sinon « Jour invalide ».
*Notions : `switch`, `break`, cas `default`.*

**Résultat attendu** (avec `jour = 3`)
```
Jour 3 = Mercredi
```

---

## C. Boucles

### C2 — Factorielle
Calcule `n!` (produit de 1 à n) avec une boucle `while`.
*Notions : `while`, accumulateur.*

**Résultat attendu** (avec `n = 5`)
```
5! = 120
```

### C3 — Nombre de chiffres
Compte combien de chiffres possède un entier, avec une boucle `do-while`.
*Notions : `do-while`, division entière répétée.*

**Résultat attendu** (avec `n = 40725`)
```
40725 possede 5 chiffres
```

---

## E. Tableaux 2D

### E1 — Somme de chaque ligne
Pour une matrice d'entiers, affiche la somme de chaque ligne.
*Notions : double boucle, `matrice.length` et `matrice[i].length`.*

**Résultat attendu** (avec une matrice 3×3 de 1 à 9)
```
Ligne 0 -> somme = 6
Ligne 1 -> somme = 15
Ligne 2 -> somme = 24
```

### E2 — Plus grand élément et sa position
Trouve la plus grande valeur de la matrice et affiche sa position `(ligne, colonne)`.
*Notions : mémoriser valeur + indices pendant le parcours.*

**Résultat attendu** (avec `{{4,17,6},{9,2,25},{13,8,1}}`)
```
Max = 25 en (1, 2)
```

---

## F. Chaînes de caractères (String)

### F1 — Compter les voyelles
Compte le nombre de voyelles dans une chaîne (insensible à la casse).
*Notions : `.length()`, `.charAt(i)`, `Character.toLowerCase`, comparaison de `char`.*

**Résultat attendu** (avec `"Programmation"`)
```
"Programmation" contient 5 voyelles
```

### F2 — Palindrome
Détermine si un mot se lit pareil de gauche à droite et de droite à gauche.
*Notions : deux indices qui se rapprochent, comparaison de caractères.*

**Résultat attendu** (avec `"radar"`)
```
"radar" est un palindrome
```

---

## G. Méthodes

### G1 — Nombres premiers
Écris une méthode `estPremier(int n)` qui renvoie `true` si `n` est premier, puis affiche tous les premiers de 1 à 20.
*Notions : méthode `static` renvoyant un `boolean`, `return` anticipé.*

**Résultat attendu**
```
Premiers de 1 a 20 : 2 3 5 7 11 13 17 19
```

---

## Imports utiles

```java
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
```