class Saransh{
     String model;
    int price;
    // suppose that we want the serial number to be different in all the laptops that we have then we can make the hash method and the equals method to override the object class method only for our rest of two variables.

    // public String toString(){
    //     return model + " : "+ price;
    // }
    
    // we can also have the better toString method by the source action

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    // above is the method to build the hashcode for the object that we have

    @Override
    public String toString() {
        return "Saransh [model=" + model + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Saransh other = (Saransh) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    // above is the ide implemented equals method which will help us in implementing the data

    // public boolean equals(Saransh that){
        

    //         return this.model.equals(that.model)&& this.price ==that.price;
                    
       
    // }
    // this equals method will override the parent object class and it will compare only the values of both the objects but we do not have to define it ourselves . It's a good practice to use the java ide inbuilt feature to build overriding equals methods which will give us the output of the result that we are needed with much better security checks

    

}




public class ObjectClass{
    public static void main(String[] args) {
        Saransh obj = new Saransh();
        obj.model="Lenovo Yoga";
        obj.price=1000;

        System.out.println(obj.toString());
        //hash code - it will create the single string of all the data that we have 
        // so when we print the obj or the obj with toString method we will get the output as the class name + @ + hash code of all the data of the object
        // if we make the method of toString in our own class then it will not go to the superclass and it will get us the function of only our method specified..

        // if we need to show our result without going to the object class then we will have to access it by specifying the toString method specifically in the class

        Saransh obj2= new Saransh();
        obj2.model = "Lenovo Yoga";
        obj2.price = 1000;

        // boolean result = obj ==obj2;

        boolean result= obj.equals(obj2);
        // when we use both equals sign or the equals method then they use the superclass of objects where they will compare the hexadecimal values of both the objects then we will have to implement the equals method by the ourselfs to compare if they are equal.

        System.out.println(result);

        //when 

    }
}