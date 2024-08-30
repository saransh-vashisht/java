
// Labelled for loop
// Labelled for loop is important as it helps us in specifically controlling the loops in the code 



public class JavaLoops_6 {
    public static void main(String[] args) {
        // Using Label for outer and inner for loop
        aa:
        for (int i = 1; i <=3; i++) {
            bb:
            for (int j = 1; j <= 3; j++) {
                if (i==2&&j==2) {
                    break aa;
                }
                System.out.println(i+" "+j);

            }
        }
    }
}
