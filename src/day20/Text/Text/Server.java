package day20.Text.Text;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception {
        //服务器端
        System.out.println("服务器等待连接");
        ServerSocket server=new ServerSocket(6666);
        //堵塞
        // 第一次阻塞
        Socket socket=server.accept();
        System.out.println("连接上了");

        //收消息
        InputStream is=socket.getInputStream();
        byte[] b=new byte[1024];
        //第二次阻塞
        int len=is.read(b);
        String str=new String(b,0,len);
        System.out.println("服务器端接收到信息:"+str);

        //回消息
        OutputStream os=socket.getOutputStream();
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入要回的信息:");
        //第四次
        os.write(scan.next().getBytes());

        os.close();
        is.close();
        socket.close();
    }
}
