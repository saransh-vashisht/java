
// Are the java comments executable 

// they are not executed by the compiler or interpreter ,however before the lexical transformation of code in compiler,contents of the code are encoded into ASCII in order to make the processing easier


public class JavaLoops_27 {
    public static void main(String[] args) {
        // the below comment will be executed
        // \u000d System.out.println("Java Comment is executed!!");

        // the above code is generated the output because the compiler parses the unicode character \u000d //as a new line and before the transformation and thus the code is transformed to the below version

        // the below comment will be executed 
        //
        System.out.println("Java Comment is executed!!");
        

    }
}
