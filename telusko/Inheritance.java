



import tools.Inheritance4;

// we can also have database package which have all the database related files 

// package helps us in the managing the package structure

// if we want to import class from the package we created we can like the above method

//whichever inbuilt class you use in java belongs to a package 

// but in system we do not import it bcz by default every java file have java.lang.*; imported

// import others.tools.* will work
// but the others.* will not import the tools file bcz it will load the files only of its own folder which is present.

// for library we create an package and we will give it to others 
//  mvnrepository is used to find the packages
// we should use the unique name for the package that we are building in the java that is present there
public class Inheritance {
    public static void main(String[] args) {
        Inheritance4 obj = new Inheritance4();
        int r1= obj.add(4,5);
        int r2 = obj.sub(7,3);
        int r3 = obj.multi(5,3);
        int r4 = obj.div(15,4);
        double r5 = obj.power(2, 4);

        System.out.println(r1+ " "+ r2+ " "+r3+" "+ r4+" "+r5);
    }
}
// when we compile using javac it will create the separate class files for all the classes

