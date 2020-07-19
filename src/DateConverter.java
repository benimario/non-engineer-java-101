public class DateConverter {
    public static void main(String[] args) {
        String date = "1970/01/23";
        String year = date.substring(0, 4);
        String month = date.substring(5, 7);
        String day = date.substring(8);
        System.out.println(year + "년 " + month + "월 " + day + "일");
    }
}



