package day14.work1.Text2;

import java.util.*;

public class Text8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        HashMap<String, Integer> map = new HashMap<>();
        int sum = 0;
        int max = 0;
        int min = 0;
        while (map.size()<5){
            System.out.println("请输入姓名：");
            String str = scan.next();
            int num = rand.nextInt(100) + 1;
            map.put(str, num);
            Set<String> keys = map.keySet();
            Iterator<String> it = keys.iterator();
            while (it.hasNext()) {
                String str2 = it.next();
                max = map.get(str2);
                min = map.get(str2);
            }
            for (String str3 : keys) {
                sum += map.get(str3);
                if (max < map.get(str3)) {
                    max = map.get(str3);
                }
                if (min > map.get(str3)) {
                    min = map.get(str3);
                }
            }

        }
        double avg = (double) sum / map.size();
        System.out.println("总分=" + sum);
        System.out.println("最大值=" + max);
        System.out.println("最小值=" + min);
        System.out.println("平均分=" + avg);
    }
}
