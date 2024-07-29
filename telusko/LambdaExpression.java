import javax.naming.spi.DirStateFactory.Result;

@FunctionalInterface
interface Thorss{
    void show();
}

// now we will do smth else like the show method actually accepting the value

@FunctionalInterface
interface Thorfin{
    void show(int i);
}

@FunctionalInterface
interface Vinland{
    int add(int i, int j);
}



public class LambdaExpression {
    public static void main(String[] args) {
        Thorss obj = new Thorss() {
            public void show(){
                System.out.println("In Thorss Show");
            }
        };

        //  so here in lambda expression  we simplify the anonymous inner class only for the lambda expression 
        // so the compiler already knows that new Thors() bcz of Thors obj bcz we are trying to intantiate an object
        //  we also know since its thors obj then we know the method we are trying to implement is show()
        // also it already knows that the show() method is public void 
        // so java will remove all the things we already know in the lambda expression thus simplifying the anonymous inner class

         Thorss obj1=() ->{
            System.out.println("In Thors Show");
         };

        //  above statement is the lambda expression and it is the arrow which signifies it 
        // behind the scenes the compiler will do it for us


        Thorss obj2=() -> System.out.println("In Shortened Thors Show");

        // so here we can remove the curly braces also if we have only one statement to be used in it






        obj.show();
        obj1.show();
        obj2.show();


         // in Java 8 we got new feature known as the lambda expressions which made it easier to solve the above way and it can only be used in the functional interface


        Thorfin obj3=(int i) -> System.out.println("in show "+ i);
        


        // we can pass variable in the lambda expression

        Thorfin obj4=(i) -> System.out.println("In Thorfin Show "+ i);
        //  since we already know the datatype we also don't have the need to mention it in lambda expression


        Thorfin obj5= i -> System.out.println("In Thorfin Show "+ i);

        // if we have only one variable then we don't even have the need to put the bracket in the code

        //  lambda expression also do  not have the additional class file like in the case of the anonymous inner class there 
        // but it will increase the size of our main class file 





        obj3.show(5);
        obj4.show(6);
        obj5.show(9);


        // Vinland objVinland = new Vinland() {
        //     public int add(int i,int j){
        //         return i+j;
        //     }
        // };
        // through anonymous class method

        Vinland objVinland = (i,j) ->   i+j;

        // above is the lambda expression implementation  but since we have only i + j as only one expression we do not have to mention return explicitly since it will automatically become the return type statement


        //  we can also pass the lambda expressions also as the argument in the collections
        

        int result = objVinland.add(5, 4);
        System.out.println(result);

    }
}
