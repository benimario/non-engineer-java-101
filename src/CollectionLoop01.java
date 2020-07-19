import java.util.ArrayList;

public class CollectionLoop01 {

    public static void main(String[] args) {
        ArrayList<String> myFavoriteFoods = new ArrayList<>();

        myFavoriteFoods.add("치킨");
        myFavoriteFoods.add("피자");
        myFavoriteFoods.add("고구마말랭이");

        for (String food : myFavoriteFoods) {
            System.out.println(food + " 맛있어요.");
        }
    }
}



