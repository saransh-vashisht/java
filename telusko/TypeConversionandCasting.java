public class TypeConversionandCasting {
    public static void main(String[] args) {
        // for the conversion of the byte to the int
        byte b=125;
        int a =b;
        System.out.println(a);
        // but when we will convert the int to byte we will get the error
        // int c =12;
        // byte d=c;
        // here we can convert the int value into the byte value but if its bigger thn the byte range then it will divide the number by 256 i.e. its range and we will have the result.
        int c=257;
        byte d=(byte)c;
        System.out.println(d);

        // sa,e error we will get while from float to int bcz of the value loss so we will do the type casting
        float f=5.6f;
        int t= (int)f;
        System.out.println(t);

        // *Type Promotion*

        byte s=10;
        byte r=30;
        int result=s*r;
        System.out.println(result);



    }
}
