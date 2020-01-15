package day04;

public class Text1 {
    public static void main(String[] args) {

        //第一题
        System.out.println("第一题：");
        printEven(20);
        System.out.println();

        //第二题
        System.out.println("第二题：");
        int a = getSum(100);
        System.out.println("求和:" + a);
        System.out.println();

        //第三题
        System.out.println("第三题：");
        int length = 20;
        int width = 8;
        int zc = getPerimeter(length, width);
        int area = getArea(length, width);
        System.out.println("周长为" + zc);
        System.out.println("面积为" + area);
        System.out.println();

        //第四题
        System.out.println("第四题：");
        getChar('3');
        System.out.println();

        //第五题
        System.out.println("第五题：");
        System.out.println("颜色为：");
        showColor("red");
        System.out.println();

        //第六题
        System.out.println("第六题：");
        printX(9);
        System.out.println();

        //第七题
        System.out.println("第七题：");
        System.out.println("四舍五入：");
        round(10.8);
        System.out.println();

        //第八题
        System.out.println("第八题：");
        temperature(30.0);
        System.out.println();

        //第九题
        System.out.println("第九题：");
        System.out.println("打印九九乘法表：");
        multiplication();
        System.out.println();
    }

    //第一题
    public static void printEven(int n) {
        System.out.println("1-" + n + "的偶数有：");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //第二题
    public static int getSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    //第三题
    public static int getPerimeter(int length, int width) {
        int perimeter = (length + width) * 2;
        return perimeter;
    }

    public static int getArea(int length, int width) {
        int area = length * width;
        return area;
    }

    //第四题
    public static char getChar(int num) {
        char ch = (char) num;
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + "是大写字母");
            return ch;
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + "是小写字母");
            return ch;
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + "是数字");
            return ch;
        } else {
            System.out.println(" ");
            return ' ';
        }
    }

    //第五题
    public static void showColor(String color) {
        switch (color) {
            case "red":
                System.out.println("红色");
                break;
            case "blue":
                System.out.println("蓝色");
                break;
            case "green":
                System.out.println("绿色");
                break;
            default:
                System.out.println("颜色未知");
                break;
        }
    }

    //第六题
    public static void printX(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("★");
                } else {
                    System.out.print("☆");
                }
            }
            System.out.println(" ");
        }
    }

    //第七题
    public static void round(double n) {
        double m = n + 0.5;
        System.out.println(n + "->" + (int) m);
    }

    //第八题
    public static void temperature(double m) {
        double n = (9.0 / 5) * m + 32;
        System.out.println("摄氏度为：" + m + "℃--华氏度为：" + n + "℃");
        System.out.println("华氏度为：" + n + "℃--摄氏度为：" + m + "℃");
    }

    //第九题
    public static void multiplication() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + " ");
            }
            System.out.println();
        }
    }

}
