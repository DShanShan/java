package day14.work2.Text2.Text3;

public class Text3 {
    public static void main(String[] args) {
        try {
//            login("admin1","123");
//            login("admin","1233");
            login("admin","123");
        } catch (LoginException e) {
            System.out.println(e);
        }
    }
    public static void login(String name,String pwd) throws LoginException{
        if ("admin".equals(name)&&"123".equals(pwd)){
            System.out.println("欢迎"+name);
        }else if (!("admin".equals(name))&&"123".equals(pwd)){
            throw new LoginException("用户名不存在");
        }else if (!("123".equals(pwd))&&"admin".equals(name)){
            throw new LoginException("密码错误");
        }
    }
}
