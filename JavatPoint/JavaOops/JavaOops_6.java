
// Object and Class Example -6
// Initialization through a constructor

// Example - Employee
class Employee{
    int id;
    String name;
    float salary;
    void insert(int i,String n, float s){
        id=i;
        name=n;
        salary=s;

    }
    void display(){
        System.out.println(id+" "+name+" "+salary);

    }
}

public class JavaOops_6 {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2= new Employee();
        Employee e3= new Employee();

        e1.insert(101, "Suresh", 45000);
        e2.insert(102, "Virat", 25000);
        e3.insert(103, "Yuvraj", 55000);
        e1.display();
        e2.display();
        e3.display();
        
    }
}
