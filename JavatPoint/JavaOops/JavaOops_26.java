
// Java This Keyword --> 2
// Solution of the previous problem by this keyword

class Student26{
    int rollno;
    String name;
    float fee;
    Student26(int rollno,String name,float fee){
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
        // here using the this keyword we have avoided the ambiguity
        

    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}
}

public class JavaOops_26 {
    public static void main(String[] args) {
        Student26 s1= new Student26(111, "Sameer", 5000f);
        Student26 s2= new Student26(112, "Sumera", 6000f);
        s1.display();
        s2.display();

    }
}
