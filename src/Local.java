public class Local {
    private String name;
    private String direction;
    private float rating;
    private boolean open;

    public Local(){}
    public Local(String name, String direction, float rating, boolean open) {
        this.name = name;
        this.direction = direction;
        this.rating = rating;
        this.open = open;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

}
