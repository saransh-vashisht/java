// Java Variable Example: Overflow


public class JavaBasics_6 {
    public static void main(String[] args) {
        // Overflow
        int a=130;
        byte b=(byte)a;
        System.out.println(a);
        System.out.println(b);

        // here an overflow occurs because the byte is of size 8 bit signed integer and its range is from -128 to 127
        //  whereas int has the range of 32- bit signed integer 
        // thus 130 value is greater than byte range of 127 it overflows and loops back to give us output of -126
        

    }
}
