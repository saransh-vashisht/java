
// Java Break Statement in do-while loop

public class JavaLoops_17 {
    public static void main(String[] args) {
        // declaring variable 
        int i=1;
        //do-while loop
        do {
            if (i==5) {
                //using the break statement
                break;// it will break the loop
            }
            System.out.println(i);
            i++;
        } while (i<=10);
    }
}
