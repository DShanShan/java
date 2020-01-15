package day14.work1.Text3;

import java.util.*;

public class Text3 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        Random rand = new Random();
        String str = "";
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < 8; j++) {
                int num = rand.nextInt(10);
                str += num;
            }
            list.add(str);
            str = "";

        }
        map.put(list.get(0), "苹果");
        map.put(list.get(1), "香蕉");
        map.put(list.get(2), "西瓜");
        map.put(list.get(3), "橘子");
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入八位数的商品号：");
        String str3 = scan.next();
        Set<String> keys = map.keySet();
        Boolean flag = true;
        if (str3.length() == 8) {
            if (map.containsKey(str3)) {
                System.out.println("商品号为：" + str3 + ",商品为：" + map.get(str3));
                flag = true;
            } else {
                flag = false;
            }

        } else {
            System.out.println("你输入有误，请重新输入！");
        }
        if (!flag) {

            System.out.println("查无此商品");
        }

    }
}
