
// Java Continue statement in while loop
//JAVA PROgram to demonstrate the use of continue statement inside the while loop


public class JavaLoops_21 {
    public static void main(String[] args) {
        // while loop
        int i=1;
        while (i<=10) {
            if (i==5) {
                // using continue statement 
                i++;
                // we used an i++ because when this if statement will continue the loop then it will not execute the below i++ statement
                
                continue;
            }System.out.println(i);
            i++;
        }
    }
}
