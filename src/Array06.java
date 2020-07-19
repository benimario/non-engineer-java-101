import java.util.Arrays;

public class Array06 {
    public static void main(String[] args) {
        String[] days = {"월", "화", "수", "목", "금", "토", "일"};
        String[] days2 = Arrays.copyOf(days, 8);

        days2[7] = "일";

        for (String s : days2) {
            System.out.println(s);
        }
    }
}


