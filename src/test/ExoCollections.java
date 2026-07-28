package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class ExoCollections {
    public static void exo1() {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>(10);


        for(int i = 0; i < 10; i++) {
            list.add(rand.nextInt(50));
        }

        for (int elem: list) {
            System.out.println(elem);
        }
    }

    public static void exo2() {
        int start = 1;
        LinkedList<Integer> queue = new LinkedList<>();

        for(int i = 0; i < 10; i++) {
            // queue.add(start); start++;
            queue.add(start++);
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(queue.pop());
        }
    }

    public static void exo3() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(15);
        arr.add(8);
        arr.add(17);
        arr.add(10);

        int max = arr.getFirst();
        int min = arr.getFirst();
        int total = 0;

        for (int i = 0; i < arr.size(); i++) {
            total += arr.get(i);
            if(min > arr.get(i)) {
                min = arr.get(i);
            }

            if(max < arr.get(i)) {
                max = arr.get(i);
            }
        }

        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
        System.out.println("Mean : " + total / arr.size());
    }

    public static String present(String name, ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).equals(name)) {
                return name + " est à la position " + i;
            }
        }

        return name + " est absent";
    }

    public static void exo4() {
        ArrayList<String> presences = new ArrayList<>();
        presences.add("Zoé");
        presences.add("Admin");

        System.out.println(present("Zoé", presences));
        System.out.println(present("Test", presences));
        System.out.println(present("Admin", presences));
    }

    public static void exo5() {
        HashMap<String, String> numbers = new HashMap<>();
        numbers.put("Alice", "001122334455");

        if(numbers.containsKey("Alice")) {
            System.out.println(numbers.get("Alice"));
        }
    }

    public static void exo6() {
        String[] animals = {"chat", "chien", "chat", "oiseau", "chat", "chien"};
        HashMap<String, Integer> animalCount = new HashMap<>();

        for (String an: animals) {
            int val = 1;
            if(animalCount.containsKey(an)) {
                val = animalCount.get(an) + 1;
            }
            animalCount.put(an, val);
        }

        System.out.println("Animal count :");
        for(String key: animalCount.keySet()) {
            System.out.println(key + " " + animalCount.get(key));
        }
    }

    public static void main() {
        exo6();
    }
}
