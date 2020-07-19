public class String06 {
    public static void main(String[] args) {
        String birthday = "1970/01/01";
        String year = birthday.substring(0, 4);
        String day = birthday.substring(8);
        System.out.println("출생년도: " + year);
        System.out.println("출생일: " + day);
    }
}



