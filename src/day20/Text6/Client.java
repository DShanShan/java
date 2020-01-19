package day20.Text6;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket=new Socket("localhost",8888);
        OutputStream os=socket.getOutputStream();
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入账号和密码：(账号=密码)");
        os.write(scan.next().getBytes());

        InputStream is=socket.getInputStream();
        byte[] b=new byte[1024];
        int len;
        while (true){
            len=is.read(b);
            if (len==-1){
                break;
            }
            System.out.println(new String(b,0,len));
        }

        is.close();
        os.close();
        socket.close();
    }
}
