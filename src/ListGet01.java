import java.util.ArrayList;

public class ListGet01 {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();

        students.add("에드 시런");
        students.add("저스틴 비버");
        students.add("브루노 마스");

        String student = students.get(0);

        System.out.println("0번 학생: " + student);
    }
}



