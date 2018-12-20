public class Restaurant extends Local {
    private int price;

    public Restaurant(){}
    public Restaurant(String name, String direction, float rating, boolean open, int price) {
        super(name, direction, rating, open);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
