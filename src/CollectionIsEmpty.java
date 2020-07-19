import java.util.ArrayList;

public class CollectionIsEmpty {

    public static void main(String[] args) {
        ArrayList<String> videos = new ArrayList<>();

        if (videos.isEmpty()) {
            System.out.println("목록이 비어있습니다.");
        } else {
            System.out
                .println("총 " + videos.size() + "개의 동영상이 있습니다.");
        }
    }
}



