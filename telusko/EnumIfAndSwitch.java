
enum Status1{
    Running,Failed,Pending,Success;
}



public class EnumIfAndSwitch {
    public static void main(String[] args) {
        Status1 s= Status1.Running;

        System.out.println(s.getClass().getSuperclass());

        switch (s) {
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            default:
                System.out.println("Done");
                break;
        }












        if(s==Status1.Running){
            System.out.println("All Good");
        }
        else if (s==Status1.Failed) {
            System.out.println("Try Again");
        }
        else if (s== Status1.Pending) {
            System.out.println("Please wait");
        } 
        else{
            System.out.println("Done");
        }
    }
}

// we can use both switch case and if else with the enum
// we cannot extend enum with any other class but we can do anything else like defining the methods , constructor,own variables 

// enum also has its own methods by extending from the enum class in java

