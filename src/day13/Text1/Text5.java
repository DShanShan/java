package day13.Text1;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Text5 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkhash = new LinkedHashSet<>();
        linkhash.add("王昭君");
        linkhash.add("王昭君");
        linkhash.add("西施");
        linkhash.add("杨玉环");
        linkhash.add("貂蝉");
        //使用迭代器获取
        Iterator<String> it = linkhash.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //使用增强for循环
        System.out.println();
        for (String str : linkhash) {
            System.out.println(str);
        }
    }
}
