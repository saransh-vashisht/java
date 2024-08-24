public class DistanceCovered {
    public static void main(String[] args) {
        int n = 4; // Example input
        System.out.println( waysToCoverDistance(n));
    }

    public static int waysToCoverDistance(int x) {
        // Handle base cases
        if (x == 0) return 1;
        if (x == 1) return 1;
        if (x == 2) return 2;

        // Create a array to store results of subproblems
        int[] y = new int[x + 1];
        y[0] = 1;
        y[1] = 1;
        y[2] = 2;

        // Filling the  array using the recurrence relation
        for (int i = 3; i <= x; i++) {
            y[i] = y[i - 1] + y[i - 2] + y[i - 3];
        }

        return y[x];
    }
}
