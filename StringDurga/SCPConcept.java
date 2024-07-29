public class SCPConcept {
    public static void main(String[] args) {
        String s1String=new String("You cannot change me");

        String s2String= new String("You cannot change me");

        System.out.println(s1String==s2String);

        String s3String="You cannot change me";

        System.out.println(s1String==s3String);

        String s4String="You cannot change me";

        System.out.println(s2String==s4String);

        System.out.println(s3String==s4String);

        String s5String="You cannot "+"change me";

        System.out.println(s4String==s5String);

        String s6String="You cannot ";

        String s7String=s6String+"change me";

        System.out.println(s4String==s7String);

        final String s8= "You cannot ";

        String s9String= s8+ "change me";

        System.out.println(s4String==s9String);

    }
}
