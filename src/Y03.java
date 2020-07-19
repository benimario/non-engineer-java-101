public class Y03 {
    public static void main(String[] args) {
        String S = ")(((((((((((((((((";
        System.out.println(solution(S));
    }

    static int solution(String S) {
        if(!S.contains("(") || !S.contains(")"))
            return S.length();

        int leftPosition = -1;
        int rightPosition = S.length();

        final int LEFT_TO_RIGHT = 0;
        final int RIGHT_TO_LEFT = 1;

        int direction = LEFT_TO_RIGHT;

        while (true) {

            if (direction == LEFT_TO_RIGHT) {
                if (S.charAt(++leftPosition) == '(') {
                    direction = RIGHT_TO_LEFT;
                }
            } else {
                if (S.charAt(--rightPosition) == ')') {
                    direction = LEFT_TO_RIGHT;
                }
            }

            if (leftPosition >= rightPosition) {
                String left = S.substring(0, leftPosition);
                if(!left.contains("("))
                    return S.length();

                return direction == LEFT_TO_RIGHT ? leftPosition : leftPosition;
            }
        }
    }
}
