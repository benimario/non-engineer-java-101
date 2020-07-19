import java.util.PriorityQueue;

public class Y04 {
    public static void main(String[] args) {
    }

    static class Pair {
        public int index;
        public int value;
        public Pair(int i, int v) {
            this.index = i;
            this.value = v;
        }
    }

    public static int solution(int[] arr) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((o1, o2) -> o1.value - o2.value);

        for(int i=1; i<arr.length ; i++) {
            pq.add(new Pair(i, arr[i]));
        }

        Pair minPair = pq.poll();
        Pair secondMinPair = new Pair(0,0);

        while(!pq.isEmpty()) {
            Pair p = pq.poll();
            if(Math.abs(minPair.index - p.index) == 1) {
                continue;
            } else {
                secondMinPair = p;
                break;
            }
        }

        return minPair.value + secondMinPair.value;
    }
}
