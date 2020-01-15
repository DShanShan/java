package day14.Text;

import java.util.*;

public class Text1 {
    public static void main(String[] args) {
/*
        System.out.println(); HashMap<String, String> map = new HashMap<>();
        map.put("aaa", "bbb");
        map.put("ccc", "ddd");
        map.put("eee", "fff");
        map.put("ggg", "hhh");

        //根据指定的键删除对应的键值对
//        System.out.println(map.remove("ccc"));
        //根据对应的键查看对应的值
        System.out.println(map.get("aaa"));

        //获取所有的键 获取键集
        Set<String> keys = map.keySet();
        // 遍历键集 得到 每一个键
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + "," + value);
        }


        Iterator<String> it=keys.iterator();
        while (it.hasNext()){
            String str =it.next();
            System.out.println("key:"+str+",value:"+map.get(str));
        }

        System.out.println();

        keys.stream().forEach(n->{
            System.out.println("key:"+n+",value:"+map.get(n));
        });

        System.out.println();

        // 获取 所有的 entry对象 entrySet
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        // 遍历得到每一个entry对象
        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "," + value);
        }
*/
       /* HashMap<Student, String> map = new HashMap<>();
        map.put(new Student("张三", 20), "湖南");
        map.put(new Student("张三", 20), "湖南23");
        map.put(new Student("李四", 25), "广东");
        map.put(new Student("王五", 23), "长沙");

        Set<Map.Entry<Student, String>> entry = map.entrySet();
        for (Map.Entry<Student, String> entry1 : entry) {
            Student stu = entry1.getKey();
            String str = entry1.getValue();
            System.out.println(stu + "," + str);
        }

        Set<Student> set = map.keySet();
        for (Student stu : set) {
            String value = map.get(stu);
            System.out.println(stu + "," + value);
        }

        System.out.println("请录入一个字符串:");
        String line = new Scanner(System.in).nextLine();
        // 定义 每个字符出现次数的方法
        findChar(line);
*/

        try {
            String str = null;
            System.out.println(str.equals("abc"));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        String str = null;
        try {
            str = null;
            System.out.println(str.equals("abc"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void findChar(String line) {
        //1:创建一个集合 存储 字符 以及其出现的次数
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        //2:遍历字符串
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            //判断 该字符 是否在键集中
            if (!map.containsKey(c)) {//说明这个字符没有出现过
                //那就是第一次
                map.put(c, 1);
            } else {
                //先获取之前的次数
                Integer count = map.get(c);
                //count++;
                //再次存入 更新
                map.put(c, ++count);
            }
        }
        System.out.println(map);
    }

}
