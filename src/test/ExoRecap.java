package test;

public class ExoRecap {
    public static void exoA1() {
        double priceHT = 100.0;
        double vat = 0.21;
        double priceTax = priceHT * vat;
        double priceTTC = priceTax + priceHT;
        System.out.println("Price HT : " + priceHT);
        System.out.println("Price TVA %21 : " + priceTax);
        System.out.println("Price TTC : " + priceTTC);
    }

    public static void exoA2() {
        int a = 17;
        int b = 5;
        int quotient = a / b;
        int reste = a % b;

        System.out.println(a + "/" + b + " = " + quotient);
        System.out.println(a + "%" + b + " = " + reste);
    }

    public static void exoB1() {
        int note = 19;

        String mention;
        if(note < 10) {
            mention = "Echec";
        } else if (note < 12) {
            mention = "Passable";
        } else if (note < 14) {
            mention = "Assez bien";
        } else if (note < 16) {
            mention = "Bien";
        } else {
            mention = "Très bien";
        }

        System.out.println("une note de " + note + " a une mention de " + mention);
    }

    public static void exoB2() {
        int jour = 3;
        String nom;

        switch (jour){
            case 1:
                nom = "Lundi";
                break;
            case 2:
                nom = "Mardi";
                break;
            case 3:
                nom = "Mercredi";
                break;
            case 4:
                nom = "Jeudi";
                break;
            case 5:
                nom = "Vendredi";
                break;
            case 6:
                nom = "Samdi";
                break;
            case 7:
                nom = "Dimanche";
                break;
            default:
                // Dans un vrais programme -> throw exception
                System.out.println("Error -> unknown day");
                nom = "ERREUR !!!";
                break;
        }

        System.out.println("Le jour " + jour + " est le " + nom);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return n;
        }
        return n * factorial(n - 1);
    }

    public static void exoC2() {
        int n = 5;
        long factorielle = 1;

        int i = 1;
        while(i <= n) {
            factorielle *= i;
            i++;
        }
        System.out.println("La factorielle de " + n + " est égale à " + factorielle);
    }

    public static void exoC3() {
        int n = 40725;
        // Manière 1
        int nombre = n;
        int cmp = 0;
        do {
            nombre /= 10;
            cmp++;
        } while (nombre != 0);
        System.out.println("n = " + n + " est composé de " + cmp + " chiffres");


        System.out.println("n = " + n + " est composé de " + String.valueOf(n).length() + " chiffres");
    }

    public static void exoE1() {
        int[][] matrice = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };

        for (int i = 0; i < matrice.length; i++) {
            int lineTotal = 0;
            for (int j = 0; j < matrice[i].length; j++) {
                lineTotal += matrice[i][j];
            }
            System.out.println("Le total de la ligne est de : " + lineTotal);
        }
    }

    public static void exoE2() {
        int[][] matrice = {
            {4, 17, 6},
            {9, 2, 25},
            {13, 8, 1}
        };

        int max = matrice[0][0];
        int maxX = 0;
        int maxY = 0;

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if(max < matrice[i][j]) {
                    max = matrice[i][j];
                    maxX = i;
                    maxY = j;
                }
            }
        }

        System.out.println("Le max de la matrice est : " + max + " En position (" + maxX + ", " + maxY + ")");
    }

    public static void exoF1() {
        String text = "Programmation";

        int cmp = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));
            if (
               c == 'a'
               || c == 'e'
               || c == 'i'
               || c == 'o'
               || c == 'u'
               || c == 'y'
            ) {
                cmp++;
            }
        }

        System.out.println("Le mot " + text + " contient " + cmp + " voyelles.");
    }

    public static void exoF2() {
        String mot = "radar";
        boolean palindrome = true;
        int left = 0;
        int right = mot.length() - 1;

        while(left < right) {
            if(Character.toLowerCase(mot.charAt(left)) != Character.toLowerCase(mot.charAt(right))) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }

        if(palindrome) {
            System.out.println(mot + " est un palindrome");
        } else {
            System.out.println(mot + " n'est pas un palindrome");
        }
    }

    public static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }

        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void exoG1() {
        int n = 13;
        if(isPrime(n)) {
            System.out.println(n + " is a prime number");
        }else {
            System.out.println(n + " is not a prime number");
        }
    }

    public static void main() {
        exoA1();
        exoA2();
        exoB1();
        exoB2();
        exoC2();
        exoC3();
        exoE1();
        exoE2();
        exoF1();
        exoF2();
        exoG1();
    }
}
