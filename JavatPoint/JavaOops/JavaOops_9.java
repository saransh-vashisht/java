
// Object and Class Example -->9
// Creating multiple objects by one type only 

// initialization of primitive variables
// int a=10,b=20;

// Initialization of reference variable 
// Rectangle r1= new Rectangle(),r2= new Rectangle(); //creating two objects


// Java Program to illustrate the use of Rectangle class which has length and width data members
class Rectangle1{
    int length;
    int width;
    void insert(int l,int w){
        length=l;
        width=w;

    }
    void calculateArea(){
        System.out.println(length*width);

    }
}
public class JavaOops_9 {
    public static void main(String[] args) {
       Rectangle r1= new Rectangle(),r2= new Rectangle();
        // Creating two objects 
        r1.insert(11, 5);
        r2.insert(3, 15);
        r1.calculateArea();
        r2.calculateArea();
    }
}
