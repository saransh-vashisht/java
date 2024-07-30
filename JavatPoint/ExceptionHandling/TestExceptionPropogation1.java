class TestException{
    void m(){
        int data=50/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        } catch(Exception e){System.out.println("exception handled");}


    }
}
public class TestExceptionPropogation1 {
    public static void main(String[] args) {
        TestException obj= new TestException();
        obj.p();
        System.out.println("normal flow...");

    }
}
