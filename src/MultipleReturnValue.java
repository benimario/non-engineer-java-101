public class MultipleReturnValue {

    public static void main(String[] args) {
        int[] numbers = addAndMultiply(2, 3);
        int sum = numbers[0];
        int product = numbers[1];

        System.out.println("2 + 3 = " + sum);
        System.out.println("2 x 3 = " + product);
    }

    public static int[] addAndMultiply(int a, int b) {
        int sum = a + b;
        int product = a * b;

        int[] result = {sum, product};

        return result;
    }
}



