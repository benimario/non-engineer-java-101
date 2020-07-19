import java.util.HashSet;

public class CollectionLoop02 {

    public static void main(String[] args) {
        HashSet<String> myFavoriteFoods = new HashSet<>();

        myFavoriteFoods.add("치킨");
        myFavoriteFoods.add("피자");
        myFavoriteFoods.add("고구마말랭이");

        for (String food : myFavoriteFoods) {
            System.out.println(food + " 맛있어요.");
        }
    }
}



