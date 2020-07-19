public class Y01 {
    public static void main(String[] args) {
        solution();
    }

    static void solution() {
        int cnt;
        int N = 24;
        for(int i = 1 ; i <= N ; i ++) {
            cnt = 0;
            if(i % 2 == 0) {
                System.out.print("Codility");
                cnt++;
            }
            if(i % 3 == 0) {
                System.out.print("Test");
                cnt++;
            }
            if(i % 5 == 0) {
                System.out.print("Coders");
                cnt++;
            }
            if(cnt == 0) {
                System.out.println(i);
            } else {
                System.out.println();
            }
        }
    }
}
