public class WhileBreak01 {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            System.out.println("반복문 진입");
            if(i == 2) {
                break;
            }
            i = i + 1;
            System.out.println("반복문 끝");
        }
    }
}



