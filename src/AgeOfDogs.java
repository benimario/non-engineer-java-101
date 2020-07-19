public class AgeOfDogs {
    public static void main(String[] args) {
        int ageOfWinter = 3;
        int ageOfMax = 7;
        boolean sameAge = ageOfWinter == ageOfMax;
        boolean winterIsOlder = ageOfWinter > ageOfMax;
        boolean maxIsOlder = ageOfMax > ageOfWinter;
        System.out.println("윈터는 맥스와 동갑: " + sameAge);
        System.out.println("윈터가 더 늙었다: " + winterIsOlder);
        System.out.println("맥스가 더 늙었다: " + maxIsOlder);
    }
}




