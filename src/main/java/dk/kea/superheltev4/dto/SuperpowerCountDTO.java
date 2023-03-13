package dk.kea.superheltev4.dto;

public class SuperpowerCountDTO {
    private String heroName;
    private int superpowerCount;

    public SuperpowerCountDTO(String heroName, int superpowerCount) {
        this.heroName = heroName;
        this.superpowerCount = superpowerCount;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getSuperpowerCount() {
        return superpowerCount;
    }

    public void setSuperpowerCount(int superpowerCount) {
        this.superpowerCount = superpowerCount;
    }
}
