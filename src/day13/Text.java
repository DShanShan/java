package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Text {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("张三", 20, 80d));
        list.add(new User("张三2", 20, 70d));
        list.add(new User("张三3", 30, 90d));
        list.add(new User("张三4", 20, 85d));
        /*Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o2.getAge() - o1.getAge() == 0) {
                    return (int) (o1.getScore() - o2.getScore());
                }
                return o2.getAge() - o1.getAge();
            }
        });*/

        /*Collections.sort(list, (a, b) -> {
            if (b.getAge() - a.getAge() == 0) {
                return (int) (a.getScore() - b.getScore());
            }
            return b.getAge() - a.getAge();
        });*/

        Collections.sort(list);
        list.stream().forEach(System.out::println);


    }
}
