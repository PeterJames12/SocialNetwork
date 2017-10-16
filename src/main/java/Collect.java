import java.util.*;
import java.util.stream.IntStream;

/**
 * @author Igor Hnes on 10/7/17.
 */
public class Collect {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        List<Integer> listInt = new LinkedList<>();
        List<String> listString = new LinkedList<>();

        map.put(9, "Hello");
        map.put(0, "Hello");
        map.put(2, "Hello");
        map.put(8, "Hello");
        map.put(6, "Hello");
        map.put(4, "Hello"); // string builder for all list

        final Set<Integer> set = map.keySet();
        listInt.addAll(set);

        final Collection<String> values = map.values();
        listString.addAll(values);

        System.out.println(listInt + " " + listString);
    }

    private static void collect() {

        List<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);

        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);

        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);


        Set<Integer> set = new HashSet<>();

        for (Integer elem : list) {
            set.add(elem);
        }
        System.out.println(set);



        List<String> listText = new LinkedList<>();

        listText.add("Hallo");
        listText.add("Hallo");
        listText.add("Hallo");
        listText.add("Hallo");
        listText.add("Hallo");
        listText.add("Hallo");
        listText.add("Hallo");
        listText.add("Hallo");
        listText.add("Hallo");
        listText.add("Hallo");

        Set<String> setText = new HashSet<>();

        for (String s : listText) {
            setText.add(s);
        }
        System.out.println(setText);


    }

    private static void newFilter(Object item) {
        if (item instanceof String) {
            System.out.println("Type is String");
        } else if (item instanceof Integer) {
            System.out.println("Type is Integer");
        }
    }

    private static void filter(List list) {

        List<String> listText = new LinkedList<>();
        List<Integer> listNum = new LinkedList<>();


        for (Object o : list) {
            if (o instanceof String) {
                listText.add((String) o);
            }
            if (o instanceof Integer) {
                listNum.add((Integer) o);
            }
        }
        System.out.println(listText);
        System.out.println(listNum);
    }
}
