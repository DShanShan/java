package day20.Text.Text;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        //客户端
        Socket socket=new Socket("localhost",6666);
        //发消息
        OutputStream os=socket.getOutputStream();
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入要发的信息:");
        //第三次阻塞
        os.write(scan.next().getBytes());

        //收信息
        InputStream is=socket.getInputStream();
        byte[] b=new byte[1024];
        int len=is.read(b);
        String str=new String(b,0,len);
        //第五次阻塞
        System.out.println("客户端收到信息:"+str);

        is.close();
        os.close();
        socket.close();
    }
}
