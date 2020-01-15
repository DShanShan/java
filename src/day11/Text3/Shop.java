package day11.Text3;

import java.util.Objects;

public class Shop {
    private String id;
    private String name;
    private Double price;
    private String unit;
    private Integer num;

    public Shop() {
    }

    public Shop(String id, String name, Double price, String unit, Integer num) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.unit = unit;
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(id, shop.id) &&
                Objects.equals(name, shop.name) &&
                Objects.equals(price, shop.price) &&
                Objects.equals(unit, shop.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, unit);
    }
}
