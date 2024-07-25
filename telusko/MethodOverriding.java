
class Abc{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("In a Config");
    }
}

class Bcd extends Abc{
    public void show(){
        System.out.println("In B Show");
        // here we are overriding the method of the show of abc to show us the bcd class thus doing the method overriding
    }
}


class Calci{
    public int add(int n1,int n2){
        return n1+n2;
    }
}

class AdvCalci extends Calci{
    public int add(int n1,int n2){
        return n1+n2+1;
    }
    
}


public class MethodOverriding {
    public static void main(String[] args) {

        Bcd obj=new Bcd();
        obj.show();
        obj.config();

        Calci obj1= new Calci();
       int r1= obj1.add(2, 4);

        AdvCalci obj2=new AdvCalci();
       int r2= obj2.add(2, 4);

       System.out.println(r1);
       System.out.println(r2);
    //    here the advcalci sum is overriding the sum of the normal calci class
        
    } 
}


