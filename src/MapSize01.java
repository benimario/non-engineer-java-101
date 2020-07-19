import java.util.HashMap;

public class MapSize01 {

    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();

        contacts.put("저스틴 비버", "010-1234-abcd");
        contacts.put("오바마", "010-abcd-abcd");
        contacts.put("개미핥기", "010-ab12-ab34");

        int size = contacts.size();

        System.out.println(size + "개의 연락처가 있습니다.");
    }
}



