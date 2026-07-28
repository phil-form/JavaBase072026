import test.Hello;

void main() {
    Hello.hello();

    int i = 5;

    switch (i){
        case 1:
            System.out.println("Case 1");
            break;
        case 2:
            System.out.println("Case 2");
            break;
        case 3:
            System.out.println("Case 3");
            break;
        case 4:
            System.out.println("Case 4");
            break;
        case 5:
            System.out.println("Case 5");
            break;
        case 6:
            System.out.println("Case 6");
            break;
        default:
            System.out.println("Case default");
            break;
    }

    long val = 1;
    char type = 'M';

    switch (type) {
        case 'T':
            val = val * 1024;
        case 'G':
            val = val * 1024;
        case 'M':
            val = val * 1024;
        case 'K':
            val = val * 1024;
    }

    System.out.println(val);
    Scanner  sc = new Scanner(System.in);

    int nbr = -1;
//    do {
//        System.out.println("Entrer un nombre : ");
//        nbr = sc.nextInt();
//    } while(nbr > 10 || nbr < 1);

    System.out.println("ArrayList --------------------");
    ArrayList<Integer> arr = new ArrayList<>();

    arr.add(1);
    arr.add(2);
    arr.add(3);
    for (Integer el : arr) {
        System.out.println(el);
    }

    System.out.println("---------------------");

    arr.remove(2);

    for (Integer el : arr) {
        System.out.println(el);
    }

    ArrayList<Integer> arr2 = new ArrayList<>();
    arr2.add(5);

//    int test = arr2[0];
    int test = arr2.get(0);
//    arr2[0] = 5;
    arr.set(0, 5);

    System.out.println("Stack -------");
    Stack<Integer> s = new Stack<>();

    s.add(1);
    s.add(5);
    // le pop supprime l'élément au dernière index et le renvoie sa valeur
    System.out.println("Pop last element : " + s.pop());
    System.out.println("Stack size : " + s.size());

    System.out.println("Queue -------");
    LinkedList<Integer> q = new LinkedList<>();

    q.add(1);
    q.add(5);
    // le pop supprime l'élément au dernière index et le renvoie sa valeur
    System.out.println("Pop first element : " + q.pop());
    System.out.println("Stack size : " + q.size());

    System.out.println("Map ----------------------------");
    HashMap<String, Integer> map = new HashMap<>();

    map.put("key", 5);
    System.out.println(map.get("key"));
}
