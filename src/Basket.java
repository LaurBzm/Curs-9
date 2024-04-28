import java.util.ArrayList;

public class Basket<Property> {
    private String taste;
    private boolean booked;
    private String color;
    private String size;

    public <Fruit> void main(String[] args) {
        ArrayList<Basket<Property>> fruitBasket = new ArrayList<>();
        String color = "Red";
        String size = "Medium";
        String taste = "Sweet";
            this.color = color;
            this.size = size;
            this.taste = taste;
            this.booked = false;
            fruitBasket.add(this);
        }
            boolean truth;
    ArrayList<Property> properties;

    public void Basket() {
        truth = false;
        properties = new ArrayList<Property>();
    }
}
