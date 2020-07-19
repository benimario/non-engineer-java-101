public class EggPackage {

    public static void main(String[] args) {
        int totalEggs = 277; // 총 달걀 개수입니다.
        int eggCartonSize = 30; // 한 판에 포장되는 달걀의 수입니다.

        // totalEggs 를 eggCartonSize 로 나눈 나머지를 계산합니다.
        int remainingEggs = totalEggs % eggCartonSize;

        System.out.println("총" + remainingEggs + "개의 계란이 남습니다.");
    }
}


