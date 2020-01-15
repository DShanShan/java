package day13.Text2;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Text7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] chars = str.toCharArray();
        LinkedHashSet<Character> linked = new LinkedHashSet<>();
        for (Character a : chars) {
            linked.add(a);
        }

        for (Character c : linked) {
            System.out.print(c);
        }
        System.out.println();
    }
}
