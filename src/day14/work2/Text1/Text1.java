package day14.work2.Text1;

public class Text1 {
    public static void main(String[] args) {
        testThrows();
        testTryCatch();
    }

    public static char charAt(String str, int index) throws Exception {
        if (str == null) {
            throw new Exception("字符串不能为null");
        } else if (str == "") {
            throw new Exception("字符串不能为空");
        } else if (!(index > 0 && index < str.length() - 1)) {
            throw new Exception("索引越界");
        }
        char[] chars = str.toCharArray();
        return chars[index];
    }

    public static void testThrows(){
        try {
            charAt("aba", -1);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testTryCatch() {
        try {
            charAt("", 1);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
