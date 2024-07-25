
class Human2{
    private int age;
    private String name;

    // by deault we have the blank constructor in our class

    public Human2(){  // default constructor
       age=12;
       name="John";
    //    by default this value is assigned.
    }

    public Human2(int a,String n){ //paramaterized constructor
        age=a;
        name =n;
        //  we can also set our constructor to have the specified value to be stored in it whichever we want it to be
    }



    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}


public class Constructor {
    public static void main(String[] args) {
        // it is used to generate the value when the object itself if created instead of the pre existing null or 0 values in the objects.
        Human2 obj= new Human2();
        Human2 obj1=new Human2(30,"Naveen");
        System.out.println(obj.getName()+" : "+ obj.getAge());
        System.out.println(obj1.getName()+" : "+ obj1.getAge());

        obj.setAge(30);
        obj.setName("Reddy");
    }
}
