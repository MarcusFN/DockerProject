package dk.kea.superheltev4.dto;

public class SuperpowerDTO {
    private String heroName;
    private String realName;
    private String superpowers;
    private int numberOfSuperpowers;

    public SuperpowerDTO(String heroName, String realName, String superpowers) {
        this.heroName = heroName;
        this.realName = realName;
        this.superpowers = superpowers;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSuperpowers() {
        return superpowers;
    }

    public void setSuperpowers(String superpowers) {
        this.superpowers = superpowers;
    }
}
