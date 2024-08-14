
// Anonymous object
// Anonymous simply means nameless. An object which has no reference is known as an anonymous object 
// It can be used at the time of object creation only

// If you have to use an object only once , an anonymous object is a good approach 

// new Calculation(); anonymous object


/*
 * Calling method through a reference 
 * Calculation c= new Calculation();
 * c.fact(5);
 * 
 * Calling method through an anonymous object 
 * new Calculation().fact(5)
 * 
 */

//  Example of anonymous object in Java

class Calculation{
    void fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;

        }
        System.out.println("Factorial is "+ fact);

    }
}

public class JavaOops_8 {
    public static void main(String[] args) {
        new Calculation().fact(5); //calling method with anonymous object
    }
}
