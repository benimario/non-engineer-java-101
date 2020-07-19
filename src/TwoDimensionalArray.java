import java.util.Arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        String[][] days = {
            {"월", "화", "수", "목", "금", "토", "일"},
            {"일", "화", "수", "목", "금", "토", "일"},
            {"월", "화", "수", "목", "금", "금", "금"},
        };

        System.out.println(Arrays.toString(days[0]));
        System.out.println(Arrays.toString(days[1]));
        System.out.println(Arrays.toString(days[2]));

        System.out.println(days[2][6]);
    }
}



