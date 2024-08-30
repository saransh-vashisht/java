
// Java.util.date example 


public class DateTime_87 {
    public static void main(String[] args) {

        // First Way
        java.util.Date date=new java.util.Date();
        System.out.println(date);

        // Second Way
        long milis=System.currentTimeMillis();
        java.util.Date date2= new java.util.Date(milis);
        System.out.println(date2);

    }
}
