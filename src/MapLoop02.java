import java.util.Collection;
import java.util.HashMap;

public class MapLoop02 {

    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();

        dictionary.put("chicken", "닭");
        dictionary.put("hippo", "하마");
        dictionary.put("anteater", "개미핥기");

        Collection<String> koreanWords = dictionary.values();

        for (String koreanWord : koreanWords) {
            System.out.println(koreanWord);
        }
    }
}



