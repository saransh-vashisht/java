public class Equals {
    public static void main(String[] args) {
        String s1= new String("Saransh");

        String s2= new String("Saransh");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        StringBuffer sb1 = new StringBuffer("Saransh");

        StringBuffer sb2= new StringBuffer("Saransh");

        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
    }
}
