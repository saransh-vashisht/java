class Throw1{
    public static void validate(int age){
        if (age>18) {
            throw new ArithmeticException("You are too young too vote");
        } else {
            System.out.println("Yay!! You can Vote!");
        }
    }
}


public class TestThrow1 {
    public static void main(String[] args) {
     Throw1 obj = new Throw1();
     
      obj.validate(17);

     System.out.println("Rest of the Code");

    }
}
