package day20.Text1;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        //客户端
        Socket socket=new Socket("localhost",6666);

        Scanner scan=new Scanner(System.in);
        OutputStream os=socket.getOutputStream();
        System.out.println("请输入内容：");
        os.write(scan.next().getBytes());

        os.close();
        socket.close();
    }
}
