import java.io.Serializable;

public class SmartPhone implements Serializable {
    private static final long serialVersionUID = 1L;
    private int price;

    // Constructor
    public SmartPhone(int price) {
        this.price = price;
    }

    // Getter for price
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "SmartPhone{price=" + price + "}";
    }
}
