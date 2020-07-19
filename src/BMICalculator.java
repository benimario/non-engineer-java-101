public class BMICalculator {

    public static void main(String[] args) {
        double height = 1.73; // 신장(m)
        double weight = 25.0; // 몸무게(kg)

        // 공식에 따라 BMI 를 계산합니다.
        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            // BMI 가 18.5 미만인 경우 저체중입니다.
            System.out.println("저체중입니다.");
        } else if (bmi >= 23) {
            // BMI 가 23 이상인 경우 과체중입니다.
            System.out.println("과체중입니다.");
        } else {
            // BMI가 18.5 이상 23 미만인 경우 정상체중입니다.
            System.out.println("정상체중입니다.");
        }
    }
}
