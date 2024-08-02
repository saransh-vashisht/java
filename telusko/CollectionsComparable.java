import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Gurukul implements Comparable<Gurukul>{
    int age;
    String name;
    public Gurukul(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Gurukul that){
        if (this.age>that.age) {
            //  here we have used the this as the current age and that as the one age ahead to compare itself in the class by the class itself
            return 1;
        } else {
            return -1;
        }
    }


}




public class CollectionsComparable {
    public static void main(String[] args) {
         List<Gurukul> studs= new ArrayList<>();

        studs.add(new Gurukul(21,"Leich"));
        studs.add(new Gurukul(12, "John"));
        studs.add(new Gurukul(10, "Parul"));
        studs.add(new Gurukul(20, "Kiran"));
        

        System.out.println(studs);

        for (Gurukul guru : studs) {
            System.out.println(guru);

        }

        System.out.println("Results after sorting");
        System.out.println(" ");
        Collections.sort(studs);
        for (Gurukul guru : studs) {
            System.out.println(guru);

        }
    
    }
}
