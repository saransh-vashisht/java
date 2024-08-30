import java.io.IOException;

public class SimpleOutputError {
    public static void main(String[] args) throws IOException {
        // printing the output and error message to the console
        System.out.println("simple message");
        System.err.println("error message");

        // input from the console
        System.out.println("Write the number you want :");
        int i= System.in.read(); //returns ASCII code of 1st character
        System.out.println((char)i); // will print the character

        int j= System.in.read();

        System.out.println(j);

    }
}
