import java.util.ArrayList;
import java.util.List;

public class ListSet {

    public static void main(String[] args) {
        List<String> foods = new ArrayList<>();

        foods.add("파");
        foods.add("피자");
        foods.add("치킨");

        foods.set(0, "치킨");

        System.out.println(foods);
    }
}


