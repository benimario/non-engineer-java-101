import java.util.HashSet;
import java.util.Set;

public class SetExample01 {

    public static void main(String[] args) {
        Set<String> myFavoriteFoods = new HashSet<>();

        myFavoriteFoods.add("치킨");
        myFavoriteFoods.add("피자");
        myFavoriteFoods.add("치킨");

        System.out.println(myFavoriteFoods);
    }
}



