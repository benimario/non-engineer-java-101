import java.util.HashMap;

public class MapIsEmpty01 {

    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();

        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
        }
    }
}



