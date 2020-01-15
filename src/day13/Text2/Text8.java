package day13.Text2;

import java.util.HashSet;
import java.util.Scanner;

public class Text8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        HashSet<Integer> hash=new HashSet<>();
        System.out.println("请输入数字：");
        while (true){
            int num =scan.nextInt();
            if (num==-1){
                break;
            }else {
                hash.add(num);
            }
        }

        int sum=0;
        for (Integer num:hash){
            sum+=num;
        }
        System.out.println("总和为"+sum);
        double avg=sum/hash.size();
        System.out.println("平均值为"+avg);
    }
}
