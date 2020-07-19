import java.util.ArrayList;
import java.util.Collections;

public class Sort01 {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("장민호");
        students.add("이찬원");
        students.add("정동원");
        students.add("임영웅");

        Collections.sort(students);

        System.out.println(students);
    }
}


