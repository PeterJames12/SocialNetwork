package total;

import java.util.*;

/**
 * @author Igor Hnes on 10/9/17.
 */
public class Generate {

    public static void main(String[] args) {


        int[] mas = {1, 1, 1, 1, 1, 1};

        List<Integer> listNum = new LinkedList<>();

        Set<Integer> setNum = new HashSet<>();

        for (int elem : mas) {
            listNum.add(elem);
        }

        for (int elem : mas) {
            setNum.add(elem);
        }

        System.out.println(listNum);
        System.out.println(setNum);


//        System.out.println(setListByScanner());

//        System.out.println(setListByRandom());

        System.out.println(setSetByRandom());
    }

    private static Set<Integer> setSetByRandom() {

        Random random = new Random();
        Set<Integer> setInt = new HashSet<>();

        final int limit = 20;

        for (int i = 0; i < limit; i++) {
            setInt.add(random.nextInt(20));
        }

        System.out.println(limit);
        System.out.println("Length is: " + setInt.size());

        boolean is = limit == setInt.size();
        System.out.println(is);

        return setInt;

    }

    private static List<Integer> setListByRandom() {

        Random random = new Random();

        List<Integer> listInt = new LinkedList<>();

        final int limit = 20;

        for (int i = 0; i < limit; i++) {
            listInt.add(random.nextInt(100));
        }

        System.out.println(limit);
        System.out.println("length is: " + listInt.size());

        boolean is = limit == listInt.size();
        System.out.println(is);

        return listInt;
    }





    private static List<String> setListByScanner() {

        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();

        list.add(scanner.nextLine());
        list.add(scanner.nextLine());
        list.add(scanner.nextLine());

        scanner.close();

        return list;
    }
}
