import java.util.ArrayList;

public class ContainsExample {

    public static void main(String[] args) {
        ArrayList<String> myFavoriteFoods = new ArrayList<String>();

        myFavoriteFoods.add("치킨");
        myFavoriteFoods.add("피자");

        boolean containsChicken = myFavoriteFoods.contains("치킨");

        System.out.println("목록에 치킨이 있는가? : " + containsChicken);
    }
}




