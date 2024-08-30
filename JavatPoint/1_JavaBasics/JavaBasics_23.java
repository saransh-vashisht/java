public class JavaBasics_23 {
    public static void main(String[] args) {
        short a=10;
        short b=10;
        a+=b; //a=a+b internally arithmetic operation so no issue 
        
        System.out.println(a);

        short c=10;
        short d=10;
        //c=c+b; // Compile time error bcz 10 +10 =20 now int bcz of arithmetic operation

        // to avoid this we typecast it 
        c=(short)(c+d);
        System.out.println(c);

    }
}
