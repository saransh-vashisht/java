public class JavaBasics_1 {
    public static void main(String[] args) {
        // Let's print the classloader name of current class
        // Application/System Classloader will load this class
        Class c= JavaBasics_1.class;
        System.out.println(c.getClassLoader());
        // If we print the classloader name of String it will print null because it is an in-built class which is found in rt.jar,so it is loaded by the Bootstrap classloader

        System.out.println(String.class.getClassLoader());
    }

    // These are the internal classloaders provided by Java. If you want to create your own classloader, you need to extend the ClassLoader class.
    
}
