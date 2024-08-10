
// Java.sql.Date Example: get current date


public class DateTime_88 {
    public static void main(String[] args) {
     long milis=System.currentTimeMillis();
     java.sql.Date date= new java.sql.Date(milis);
     System.out.println(date);


    }
}
