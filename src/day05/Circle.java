package day05;

public class Circle {
    private int r;

    public Circle() {

    }

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void showArea() {
        double area = 3.14 * r * r;
        System.out.println("半径为：" + r + ",面积为：" + area);
    }

    public void showPerimeter() {
        double perimeter = 2 * 3.14 * r;
        System.out.println("半径为：" + r + ",周长为：" + perimeter);
    }
}
