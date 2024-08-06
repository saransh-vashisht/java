// Java allows us to use string since SE7 and the case statement should be string literal
// Java program to demonstrate the use of Java Switch
// Statement with string

public class Statement_13 {
    public static void main(String[] args) {
        // Declaring String variable
        String levelString="Expert";
        int level=0;
        // Using String in Switch expression
        switch (levelString) {
            case "Beginner":
                    level=1;
                    break;
            case "Intermediate":
                    level=2;
                    break;
            case "Expert":
                    level=3;
                    break;
            default:
                level=0;
                break;
        } 
        System.out.println("Your Level is: "+ level);
        
    }
}
