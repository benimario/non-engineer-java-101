public class Y02 {
    public static void main(String[] args) {
        int[] A = {1, 1, 4, 1, 4, 4, 5, 5, 5};
        System.out.println(solution(A));
    }

    static int solution(int[] A) {
        int nCastle = 0;
        int gradient = 0;

        for(int i = 1; i < A.length; i++) {
            int diff = A[i] - A[i -1];
            int nextGradient = Integer.compare(diff, 0);

            if(gradient == nextGradient)
                continue;

            if(gradient <= 0 && nextGradient > 0) {
                nCastle++;
                gradient = nextGradient;
                continue;
            }

            if(gradient >= 0 && nextGradient < 0) {
                nCastle++;
                gradient = nextGradient;
            }
        }

        return nCastle + (gradient != 0 ? 1 : 0) + (nCastle == 0 ? 1 : 0);
    }
}
