import java.util.Scanner;

public class MonthToEnglish {
    public static void main(String[] args) {
        System.out.println("월을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int month;

        try {
            String input = scanner.nextLine();
            month = Integer.parseInt(input);
        } catch (Exception e) {
            month = -1;
        }

        if (month == 1) {
            System.out.println("January");
        } else if (month == 2) {
            System.out.println("February");
        } else if (month == 3) {
            System.out.println("March");
        } else if (month == 4) {
            System.out.println("April");
        } else {
            System.out.println("1부터 4까지만 입력할 수 있습니다.");
        }
    }
}


