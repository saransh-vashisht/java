public class Practicestring {
    public static void main(String[] args) {
        String name= new String("navin");

        System.out.println("hello "+ name);
        System.out.println(name.charAt(1));
        System.out.println(name.concat(" reddy"));
        name=name+" reddy"; //here existing string doesn't change just for one time concat..
        //we creating a new obj here
        
        System.out.println("hello "+ name);
        String name2= "Saransh"; //generally we use it to create the string object
        System.out.println(name2);
        String s1= "Naveen";
        String s2= "Naveen";
        System.out.println(s1==s2);


        //mutable strings --> changed
        //immutable strings --> unchanged
        // StringBuffer or StringBuilder -- will get us the mutable string



    }
}
