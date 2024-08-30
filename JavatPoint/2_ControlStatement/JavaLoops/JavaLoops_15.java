
// Java break statement with labelled for loop

// Java Program to illustrate the use of break statement with the label inside an inner loop to break outer loop


public class JavaLoops_15 {
    public static void main(String[] args) {
        aa:
            for (int i = 0; i <= 3; i++) {
                bb:
                    for (int j = 1; j <= 3; j++) {

                        if (i==2&j==2) {
                            // Using break statement with label
                            break aa;

                            
                        }
                        System.out.println(i+" "+j);

                    
                    }
            }
    }
}
