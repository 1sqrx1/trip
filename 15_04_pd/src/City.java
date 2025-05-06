public class City extends Trip{
    private String liveplace;

    public City(int price, String country, int numpeople, String duration, String liveplace) {
        super(price, country, numpeople, duration);
        this.liveplace = liveplace;
    }




    public String getLiveplace() {
        return liveplace;
    }

    public void setLiveplace(String liveplace) {
        this.liveplace = liveplace;
    }
}
