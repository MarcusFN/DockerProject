package dk.kea.superheltev4.dto;

import java.time.LocalDate;

public class HeroDTO {
    private int id;
    private String heroName;
    private String realName;
    private LocalDate creationDate;

    public HeroDTO(int id, String heroName, String realName, LocalDate creationDate) {
        this.id = id;
        this.heroName = heroName;
        this.realName = realName;
        this.creationDate = creationDate;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public String getHeroName() {
        return heroName;
    }

    public String getRealName() {
        return realName;
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

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
