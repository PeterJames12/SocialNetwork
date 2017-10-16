package total;


import social_network.model.User;

/**
 * @author Igor Hnes on 10/9/17.
 */
public class Service {

    public static void main(String[] args) {



        Pen pen = new Pen(Color.RED);

//        pen.getColor() + pen.getColor() + pen.getColor();

        Pen penGreen = new Pen(Color.GREEN);

        Pen penYellow = new Pen(Color.YELLOW);

        final User user = new User();
        user.setName("Ann");
        user.setAge(32);

        StringBuilder builder = new StringBuilder();

        builder.append(pen.getColor())
                .append(" ")
                .append(penGreen.getColor())
                .append(" ")
                .append(penYellow.getColor());

        System.out.println(builder.toString());

        builder.setLength(0);

        builder.append("Dear ")
                .append(user.getName())
                .append(" Your age is ")
                .append(user.getAge());

        System.out.println(builder.toString());

    }

}
