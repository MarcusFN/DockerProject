package dk.kea.superheltev4.models;

import java.time.LocalDate;
import java.util.List;

public class Superhero {
    private int id;
    private String heroName;
    private String realName;
    private LocalDate creationDate;
    private boolean isHuman;
    private City city;
    private List<Superpower> superpowers;
    private double power;


    public Superhero(String heroName, String realName, LocalDate creationDate, boolean isHuman, double power) {
        this.heroName = heroName;
        this.realName = realName;
        this.creationDate = creationDate;
        this.isHuman = isHuman;
        this.power = power;
    }

    public int getId() {
        return id;
    }

    public String getHeroName() {
        return heroName;
    }

    public String getRealName() {
        return realName;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public boolean isHuman() {
        return isHuman;
    }


    public City getCity() {
        return city;
    }

    public List<Superpower> getSuperpowers() {
        return superpowers;
    }

    public double getPower() {
        return power;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setHuman(boolean human) {
        isHuman = human;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setSuperpowers(List<Superpower> superpowers) {
        this.superpowers = superpowers;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "id=" + id +
                ", heroName='" + heroName + '\'' +
                ", realName='" + realName + '\'' +
                ", creationDate=" + creationDate +
                ", isHuman=" + isHuman +
                ", city=" + city +
                ", superpowers=" + superpowers +
                ", power=" + power +
                '}';
    }
}
