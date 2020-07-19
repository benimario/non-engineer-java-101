import java.util.HashMap;

public class MapRemove02 {

    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();

        dictionary.put("chicken", "닭");
        dictionary.put("hippo", "하마");
        dictionary.put("anteater", "개미핥기");

        System.out.println("put 메소드를 이용해 값을 null로 입력");
        dictionary.put("hippo", null);
        System.out.println(dictionary.get("hippo"));
        System.out.println(dictionary.size());

        System.out.println("remove 메소드 사용");
        dictionary.remove("hippo");
        System.out.println(dictionary.get("hippo"));
        System.out.println(dictionary.size());

        System.out.println(dictionary);
    }
}



