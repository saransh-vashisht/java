
import java.util.*;

public class CheckStrings {

    public static String diffCharacters(String str1,String str2){
         // Convert strings to sets of characters
         Set<Character> charSet1 = new HashSet<>();
         Set<Character> charSet2 = new HashSet<>();
         
         for (char c : str1.toCharArray()) {
             charSet1.add(c);
         }
         
         for (char c : str2.toCharArray()) {
             charSet2.add(c);
         }
         
       
         Set<Character> resultSet = new TreeSet<>(charSet1);
         resultSet.addAll(charSet2);
         
         Set<Character> temporarySet = new HashSet<>(charSet1);
         temporarySet.retainAll(charSet2);
         resultSet.removeAll(temporarySet);
         
     
         StringBuilder result = new StringBuilder();
         for (char c : resultSet) {
             result.append(c).append(" ");
         }
         
         return result.toString().trim();
     
    }
    public static void main(String[] args) {
        String str1="characters";
        String str2="alphabets";

        String result = diffCharacters(str1,str2);

        System.out.println(result);
    }
}
