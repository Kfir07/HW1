public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i==j) {
            return 0;
        }
        int[] queue = new int[m.length];
        int[] d = new int[m.length];
        for (int k=0; k < d.length; k++) {
            d[k] = -1;
        }
        d[i] = 0;
        int current = 0, last=1;
        queue[0] = i;
        while (current < last) {
            last = addToQueue(queue, queue[current], m, last, d);
            if (d[j] != -1) {
                return d[j];
            }
            current++;
        }
        return -1;
    }

    public static int addToQueue(int[] queue, int kodkod, int[][] m, int last, int[] d) {
        for (int k=0; k < queue.length; k++) {
            if (m[kodkod][k] == 1 && d[k] == -1) {
                d[k] = d[kodkod] + 1;
                queue[last] = k;
                last++;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}