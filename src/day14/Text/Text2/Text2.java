package day14.Text.Text2;

public class Text2 {
    public static void main(String[] args) {
        try {
            System.out.println(checkAccount("admin1"));
        } catch (Exception e) {
            System.out.println("已经捕获到异常");
        }
    }
    public static boolean checkAccount(String account){
        if ("admin".equals(account)){
            return true;
        }else {
            throw new LoginException("账号错误");
        }
    }
}
