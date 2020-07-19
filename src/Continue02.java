public class Continue02 {
    public static void main(String[] args) {
        int i = 0;

        while(i < 10) {
            if (i % 2 == 0) {
                i = i + 1;
                continue;
            }
            System.out.println(i);
            i = i + 1;
        }
    }
}



