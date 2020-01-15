package day15.Text1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Text3 {
    public static void main(String[] args) {
        String[] str = {"张三", "李四", "王五", "马云", "王小丫", "二麻子", "马赛克", "马化腾", "张一", "张二"};

        HashSet<Integer> hash = new HashSet<>();

        Random rand = new Random();

        Runnable run = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (hash.size() == 10) {
                        break;
                    }
                    int num = rand.nextInt(str.length);
                    hash.add(num);
                }
                for (Integer str1 : hash) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(str[str1] + "过山洞");
                }

            }


        };
        Thread thd = new Thread(run);
        thd.start();

    }
}
