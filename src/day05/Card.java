package day05;

public class Card {
    private String flowerColor;
    private String count;

    public Card() {
    }

    public Card(String flowerColor, String count) {
        this.flowerColor = flowerColor;
        this.count = count;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public void showCard() {
        System.out.println(flowerColor + count);
    }
}
