package Base;

import java.util.ArrayList;
import java.util.HashMap;

public class ExoMethods {
    //region Exo 1

    public static int carre(int n) {
        return n * n;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int max(int a, int b) {
        if(a > b) {
            return a;
        }

        return b;
    }

    public static void exo1() {

    }

    //endregion

    // region exo 2

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static void exo2() {

    }

    //endregion

    // region exo 3
    public static double mean(ArrayList<Integer> notes) {
        int total = 0;

        for (int elem: notes) {
            total += elem;
        }

        return total / 2.0;
    }

    public static void exo3() {

    }

    //endregion

    // region exo 4
    public static HashMap<String, Integer> count(String[] words) {
        HashMap<String, Integer> ret = new HashMap<>();

        for(String w: words) {
            int val = 1;
            if(ret.containsKey(w)) {
                val = ret.get(w) + 1;
            }
            ret.put(w, val);
        }

        return ret;
    }

    public static void exo4() {

    }

    //endregion

    // region exo 5
    public static ArrayList<Integer> evenFilter(ArrayList<Integer> arr) {
        ArrayList<Integer> ret = new ArrayList<>();

        for(int elem: arr) {
            if(elem % 2 == 0) {
                ret.add(elem);
            }
        }

        return ret;
    }

    public static void exo5() {

    }

    //endregion

    // region exo 6
    public static void addItem(HashMap<String, Integer> inv, String product, int qty) {
        if(qty < 0) {
            return;
        }

        if(inv.containsKey(product)) {
            qty += inv.get(product);
        }

        inv.put(product, qty);
    }

    public static void removeItem(HashMap<String, Integer> inv, String product, int qty) {
        if(inv.containsKey(product)) {
            if(inv.get(product) > qty) {
                inv.put(product, inv.get(product) - qty);
            } else {
                inv.remove(product);
            }
        }
    }

    public static void showItem(HashMap<String, Integer> inv, String product) {
        System.out.println("Inventory : ");
        for (String key: inv.keySet()) {
            System.out.println(key + " " + inv.get(key));
        }
    }

    public static void exo6() {

    }

    //endregion
    public static void main() {
        exo1();
        exo2();
        exo3();
        exo4();
        exo5();
        exo6();
    }
}
