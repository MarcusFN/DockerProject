package dk.kea.superheltev4.models;

public class SuperheroPower {
    private int id;
    private Superhero superhero;
    private Superpower superpower;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Superhero getSuperhero() {
        return superhero;
    }

    public void setSuperhero(Superhero superhero) {
        this.superhero = superhero;
    }

    public Superpower getSuperpower() {
        return superpower;
    }

    public void setSuperpower(Superpower superpower) {
        this.superpower = superpower;
    }

    @Override
    public String toString() {
        return "SuperheroPower{" +
                "id=" + id +
                ", superhero=" + superhero +
                ", superpower=" + superpower +
                '}';
    }
}
