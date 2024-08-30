public class SitchCase {
    public static void main(String[] args) {
        // Input string
        String input = "ApPLe";
        
        // Toggle case of each character
        String result = switchCase(input);
        
        // Output the result
        System.out.println("Input string: " + input);
        System.out.println("Output string: " + result);
    }

    public static String switchCase(String str) {
        StringBuilder tempString = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                tempString.append(Character.toLowerCase(ch));
            } else {
                tempString.append(Character.toUpperCase(ch));
            }
        }
        
        return tempString.toString();
    }
}
