
// Java Shift Operator Example: >> vs >>>



public class JavaBasics_16 {
    public static void main(String[] args) {
        // For Positive number, >> and >>> works same
        System.out.println(20>>2);
        System.out.println(20>>>2);
        // For Negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20>>2);
        System.out.println(-20>>>2);

    }
}
