package dk.kea.superheltev4.dto;

public class HeroCityDTO {
    private String heroes;
    private String cityName;

    public HeroCityDTO(String heroes, String cityName) {
        this.heroes = heroes;
        this.cityName = cityName;
    }

    public String getHeroes() {
        return heroes;
    }

    public void setHeroes(String heroes) {
        this.heroes = heroes;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
