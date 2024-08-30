import java.io.Console;

public class ConsoleClass3 {
    public static void main(String[] args) {
        // we can write the password in the console using this without showing it into the console
        
        Console c= System.console();

        System.out.println("Enter password: ");
        char[] ch= c.readPassword();
        String pass= String.valueOf(ch);
        // converting char array into the string
        System.out.println("Password is "+ pass);

    }
}
