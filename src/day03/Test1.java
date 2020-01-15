package day03;

public class Test1 {
    public static void main(String[] args) {

        //第一题
        System.out.println("第一题：");
        System.out.println("成绩范围：");
        int score = 86;
        if (score < 0 || score > 100) {
            System.out.println("成绩有误");
        } else if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("好");
        } else if (score >= 70 && score < 80) {
            System.out.println("良");
        } else if (score >= 60 && score < 70) {
            System.out.println("及格");
        } else if (score < 60) {
            System.out.println("不及格");
        } else {
            System.out.println("你输入的不合格");
        }
        System.out.println();

        //第二题
        System.out.println("第二题：");
        int sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum1 += i;
            }
        }
        System.out.println("1-100的奇数和为：" + sum1);
        System.out.println();

        //第三题
        System.out.println("第三题：");
        System.out.println("1-100之间既是3的倍数又是5的倍数的数字有：");
        int sum2 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum2 += i;
                System.out.println(i);
            }
        }
        System.out.println("1-100之间既是3的倍数又是5的倍数的数字之和为：" + sum2);
        System.out.println();

        //第四题
        System.out.println("第四题：");
        System.out.println("1-10的数：");
        int i = 1;
        while (i <= 10) {
            System.out.println("i:" + i);
            i++;
        }
        System.out.println();

        //第五题
        System.out.println("第五题：");
        System.out.println("1-15中不是3的倍数的数：");
        for (int j = 1; j <= 15; j++) {
            if (j % 3 == 0) {
                continue;
            } else {
                System.out.println(j);
            }

        }
        System.out.println();

        //第六题
        System.out.println("第六题：");
        System.out.println("水仙花数：");
        for (int k = 100; k <= 999; k++) {
            int ge = k % 10;
            int shi = k / 10 % 10;
            int bai = k / 100;
            if (bai * bai * bai + shi * shi * shi + ge * ge * ge == k) {
                System.out.println(k);
            }
        }
        System.out.println();

        //第七题
        System.out.println("第七题：");
        System.out.println("打印1-60的所有偶数，并且5个一行；");
        int count = 1;
        for (int x = 1; x <= 60; x++) {
            if (x % 2 == 0) {
                count++;
                System.out.print(x + " ");
                if (count > 5) {
                    System.out.println();
                    count = 1;
                }
            }
        }
        System.out.println();

        //第八题
        System.out.println("第八题：");
        System.out.println("打印星座信息：");
        int e = 1;
        for (int y = 1; y <= 12; y++) {
            switch (e) {
                case 1:
                    System.out.println(e + ":水瓶");
                    ++e;
                    break;
                case 2:
                    System.out.println(e + ":双鱼");
                    ++e;
                    break;
                case 3:
                    System.out.println(e + ":白羊");
                    ++e;
                    break;
                case 4:
                    System.out.println(e + ":金牛");
                    ++e;
                    break;
                case 5:
                    System.out.println(e + ":双子");
                    ++e;
                    break;
                case 6:
                    System.out.println(e + ":巨蟹");
                    ++e;
                    break;
                case 7:
                    System.out.println(e + ":狮子");
                    ++e;
                    break;
                case 8:
                    System.out.println(e + ":处女");
                    ++e;
                    break;
                case 9:
                    System.out.println(e + ":天枰");
                    ++e;
                    break;
                case 10:
                    System.out.println(e + ":天蝎");
                    ++e;
                    break;
                case 11:
                    System.out.println(e + ":射手");
                    ++e;
                    break;
                case 12:
                    System.out.println(e + ":魔蝎");
                    ++e;
                    break;
            }
        }
        System.out.println();

        //第九题
        System.out.println("第九题：");
        System.out.println("打印『X』对称图形");
        for (int m = 1; m <= 7; m++) {
            for (int n = 1; n <= 7; n++) {
                if (n == m || n + m == 8) {
                    System.out.print("★");
                } else {
                    System.out.print("☆");
                }
            }
            System.out.println();
        }
        System.out.println();


    }
}
