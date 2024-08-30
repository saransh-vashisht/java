
// Java Switch Example where we are omitting the break statement
// Switch statement is fall-through 
// it will execute all the statements after the first match if a break statement is not present



public class Statement_12 {
    public static void main(String[] args) {
        int number=20;
        // switch expression with int value 
        switch (number) {
            // switch cases without break statement
            case 10: System.out.println("10");
            case 20:System.out.println("20");
            case 30:System.out.println("30");
            default:System.out.println("Not in 10,20 or 30");
        }
    }
}
