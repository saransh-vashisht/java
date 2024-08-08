
// Labelled for loop example 2


public class JavaLoops_7 {
    public static void main(String[] args) {
        aa:
            for (int i = 1; i <= 3; i++) {
                bb:
                    for (int j = 1; j <=3; j++) {
                        if (i==2&j==2) {
                            break bb;
                            // breaks from inner loop but the outer loop will keep on working
                            
                        }
                        System.out.println(i+" "+j);

                    }
            }
    }
}
