package total;

/**
 * @author Igor Hnes on 10/9/17.
 */
public class Winter {

    private String name = "Alex";
    private int number = 8;
    private String global;

    public static void main(String[] args) {

        Winter winter = new Winter();
        winter.something("Bob");

        System.out.println(winter.number);

        int a = 7;
        System.out.println(a);
    }

    private void something(String name) {

        System.out.println(this.name);
        System.out.println(name);

        String local = " ";

        System.out.println(local);
        System.out.println(global);

    }
}
