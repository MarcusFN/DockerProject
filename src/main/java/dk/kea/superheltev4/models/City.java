package dk.kea.superheltev4.models;

public class City {
    private int cityID;
    private String name;

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityID=" + cityID +
                ", name='" + name + '\'' +
                '}';
    }
}
