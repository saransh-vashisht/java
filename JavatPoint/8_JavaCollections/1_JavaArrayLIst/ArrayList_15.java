
import java.util.ArrayList;


public class ArrayList_15 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> originalList= new ArrayList<>();

        StringBuilder sb= new StringBuilder("Hello");

        originalList.add(sb);

        ArrayList<StringBuilder> clonedList= (ArrayList<StringBuilder>)originalList.clone();

        // Modifying the object referred to by both lists
        clonedList.get(0).append(" World!");

        // Both lists reflect the change in the object because they share the same reference
        System.out.println(originalList.get(0));
        System.out.println(clonedList.get(0));

        // Modifying the structure of the cloned list

        clonedList.add(new StringBuilder("New Item"));

        // The Structure is different; the original list remains unchanged 
        System.out.println(originalList.size()
        );
        System.out.println(clonedList.size());


        // there is change happened in only one list which is mentioned
        


    }
}
