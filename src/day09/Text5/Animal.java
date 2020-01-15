package day09.Text5;

public abstract class Animal {
    private String name;
    private String weight;

    public abstract void eat();

    public Animal() {
    }

    public Animal(String name, String weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
