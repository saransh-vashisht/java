// Java OR Operator Example: Logical || and Bitwise |



public class JavaBasics_19 {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=20;

        System.out.println(a>b|| a<c); // true||true= true
        System.out.println(a<b || a>c); // false || false = false
        System.out.println(a>b|| a>c);// true||false = true
        System.out.println(a<b||a<c); //false||true=true
        System.out.println(a>b||a<c); // true |true=true

        //  || vs |

        System.out.println(a>b||a++<c); //true ||true= true
        System.out.println(a); //true|true=true
        System.out.println(a>b|a++<c); // true|true= true
        System.out.println(a); //11 because second condition is checked


    }
}
