public class Mountain extends Trip{
    private String season;
    boolean experience;

    public Mountain(int price, String country, int numpeople, String duration, String season, boolean experience) {
        super(price, country, numpeople, duration);
        this.season = season;
        this.experience = experience;
    }





    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public boolean isExperience() {
        return experience;
    }

    public void setExperience(boolean experience) {
        this.experience = experience;
    }
}
