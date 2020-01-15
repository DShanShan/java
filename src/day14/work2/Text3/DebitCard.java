package day14.work2.Text3;

public class DebitCard {
    public static void main(String[] args) {
        card("abcdefg",200.5);
        card("abcdefg",-100.5);
    }

    public static void card(String accountNumber,Double money){
        if (money<0){
            throw new NoException("余额不能为负数");
        }else {
            System.out.println("余额为"+money);
        }
    }
}
