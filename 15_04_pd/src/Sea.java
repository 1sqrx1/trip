public class Sea extends Trip {
    private int watertemp;
    private boolean swimability;

    public Sea(int price, String country, int numpeople, String duration, int watertemp, boolean swimability){
        super(price, country, numpeople, duration);
        this.watertemp = watertemp;
        this.swimability = swimability;
    }




    public int getWatertemp() {
        return watertemp;
    }

    public void setWatertemp(int watertemp) {
        this.watertemp = watertemp;
    }

    public boolean isSwimability() {
        return swimability;
    }

    public void setSwimability(boolean swimability) {
        this.swimability = swimability;
    }
}
