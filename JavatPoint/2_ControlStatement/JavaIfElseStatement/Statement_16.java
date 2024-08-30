// Java Wrapper in Switch Statement
// Java Program to demonstrate the use of Wrapper Class
// in switch statement


public class Statement_16 {
    public static void main(String[] args) {
        Integer age=69;
        switch (age) {
            case (16):
                System.out.println("You are under 18");
                break;
            case (18):
                System.out.println("You are eligible to vote");
                break;
            case (65):
                System.out.println("You are senior citizen");
                break;
            default:
                System.out.println("Please give the valid age");
                break;
        }
    }
}
