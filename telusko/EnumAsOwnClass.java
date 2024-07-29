
enum Notepad{
    // Macbook,XPS,Surface,ThinkPad;

    // we have defined as named constants and now for every laptop we want to have their own prices in this too

    Macbook(2000),XPS(2200),Surface,ThinkPad(1000);

    // we can put our values like above in the enum
    // here our price are put into the constants like how they are done in the constructor and then set them up


    private int price;

    // we are using the private constructor because we are creating the objects in the same class that are present
    
    private Notepad() {
        price=500;
    }

    private Notepad(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

// now suppose that we need to remove the price of one item and have no value for it we cannot have it  bcz now there is only parametrized constructor and to solve it we can have the additional  default constructor in it





}



public class EnumAsOwnClass {
    public static void main(String[] args) {
        Notepad lap= Notepad.Macbook;
        System.out.println(lap+" : "+ lap.getPrice());
        // now to get the price of macbook we can create the getters and setters i.e. our own methods in it

        for (Notepad lapy : Notepad.values()) {
            System.out.println(lapy+" : "+ lapy.getPrice());
            
        }
        
    }
}
