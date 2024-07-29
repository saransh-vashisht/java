public class WrapperClasses {
    public static void main(String[] args) {
        // java is not always have the object and it will be the primitive values like the int ,float which will be used without the mention of the object in  it.
        // it helps java to improve the performance bcz it directly works with the fixed side memory and it will not be stored in the heap value as the object which will be time consuming..
        // but there are certain features in the java that only works with the objects

        //in collection framework if we want to store the data then we will  need to have the object type but not in array where we can have the primitive type data to be present in it.

        // wrapper class -->
        // for every primitive type we are going to have the wrapper class
        //int-->Integer --> it is the class, which are basically extends the object class
        // char --> Character
        // double --> Double

        //For every primitive type we have a class for it 
        // it is good for the framework which only supports the objects  but to  improves the performance primitive still makes sense but still there are certain requirements where we have to use the classes

        int num=7;
        Integer num1=new Integer(8); //boxing
        //here we are taking the primitive value and storing it in the wrapper object or the integer object ,class obj
        // it shows lines bcz this particular syntax has been depricated
        // above we are using the integer class as the wrapper class of our object
        System.out.println(num1);


        Integer num2=num; 
        // since boxing is important we can directly now assign the primitive value to the wrapper class object which will refrence it

        // above we are storing the data in the integer class as the object

        int num3=num2.intValue(); //unboxing
        //unboxing is the way by which we are getting the object value to our primitive value there which is present in it.
        // now here we can assign the num2 object to the primitive value of the num3 to get the integer 


        int num4= num2; //auto-unboxing

        //when we take out the primitive value from the object
        Double num5=6.7;


        String str="12";
        //so we have number stored in the string format but we want to double the value of it 
        int num6=Integer.parseInt(str);
        System.out.println(num6*3);
        //so to solve this we can use the int value and use the integer class's parseInt method which will get us the output as integer to give us the results

        











        
    }
}
