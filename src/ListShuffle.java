import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListShuffle {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }

        Collections.shuffle(integers);

        System.out.println(integers);
    }
}



