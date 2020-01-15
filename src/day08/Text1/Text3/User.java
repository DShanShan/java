package day08.Text1.Text3;

public abstract class User {
    private String name;
    private Double money;

    public abstract void show();

    public User() {
    }

    public User(String name, Double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
