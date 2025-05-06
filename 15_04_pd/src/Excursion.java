public class Excursion extends Trip{
    private String type;

    public Excursion (int price, String country, int numpeople, String duration, String type) {
        super(price, country, numpeople, duration);
        this.type = type;
    }





    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
