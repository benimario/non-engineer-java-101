import java.util.ArrayList;

public class ListOutOfBound {

    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<String>();

        foods.add("치킨");
        foods.add("피자");

        foods.remove(2);

        System.out.println(foods);
    }
}




