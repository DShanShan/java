package day09.Text4;

public class NewPhone extends OldPhone implements Play {
    @Override
    public void call() {
        System.out.println("新手机打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("新手机发短信");
    }

    @Override
    public void playGame() {
        System.out.println("新手机玩游戏");
    }
}
