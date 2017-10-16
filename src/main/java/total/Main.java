package total;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Igor Hnes on 10/9/17.
 */
public class Main {

    public static void main(String[] args) {

//        print();
//        System.out.println(getTrue());
//        System.out.println(getNum(7));
//        System.out.println(getName("Ana"));
//        System.out.println(Arrays.toString(getNumbers(2, 6)));
//        System.out.println(Arrays.toString(netNames("Ana", "Alex")));
//        System.out.println(getList("Olga", "Julia"));

        int[] mas = new int[5];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i;
        }

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(mas));
        System.out.println(Arrays.toString(arr));


        String[] arr1 = new String[8];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = "Hallo))";
        }

        String[] arr2 ={"Ana","Anton","Alex"};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


        print();
        print(5, 3);
        print("Ana","Alex");

    }

    private static void print(String ana, String alex) {

    }

    private static void print(int i, int i1) {

    }

    private static void print() {
        System.out.println("Hallo!");
    }

    public static boolean getTrue() {
        return 1!=1;

    }

    public static boolean getNum(int a) {
        return a!=0;
    }

    public static String getName(String name) {
        return name;

    }

    public static int[] getNumbers(int a, int b) {
        int[] mas = new int[4];
        return new int[]{a, b};
    }

    public static String[] netNames(String first, String second) {
        return new String[]{first, second};
    }

    public static List<String> getList(String first, String second) {
        List<String> names = new LinkedList<>();
        names.add(first);
        names.add(second);
        return names;
    }
}
