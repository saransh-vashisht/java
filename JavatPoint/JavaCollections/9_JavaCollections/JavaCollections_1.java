import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * JavaCollections_1
 */
public class JavaCollections_1 {
public static void main(String[] args) {
    List<String> list= new ArrayList<String>();
    list.add("C");
    list.add("Core Java");
    list.add("Advance Java");
    System.out.println("Initial collection value: "+ list);
    Collections.addAll(list, "Servlet","JSP");
    System.out.println("After adding elements collection value: "+ list);
    String[] strArr={"C#",".Net"};
    Collections.addAll(list, strArr);
    System.out.println("After adding array collection value: "+ list);

}
    
}