package net.orekyuu.angulardemo.domain;

public class Hero {

    private int id;
    private String name;

    public Hero(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Hero() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
