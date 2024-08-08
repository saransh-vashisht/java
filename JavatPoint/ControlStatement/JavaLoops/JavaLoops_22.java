
// Java Continue statement in do while loop 

// Java Program to demonstrate the use of continue statement inside the Jave do-while loop


public class JavaLoops_22 {
    public static void main(String[] args) {
        // declaring variable
        int i=1;
        // do-while loop
        do {
            if (i==5) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
            
        } while (i<=10);

    }
}
