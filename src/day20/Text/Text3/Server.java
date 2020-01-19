package day20.Text.Text3;

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
        Socket socket=server.accept();
        System.out.println("连接上了");

        while (true){
            //收消息
            InputStream is=socket.getInputStream();
            byte[] b=new byte[1024];
            int len=is.read(b);
            String str=new String(b,0,len);
            if ("end".equals(str)){
                System.out.println("服务器端收到客户端的信息end，结束通信");
                is.close();
                socket.close();
                return;
            }
            System.out.println("服务器端接收到信息:"+str);

            //回消息
            OutputStream os=socket.getOutputStream();
            Scanner scan=new Scanner(System.in);
            System.out.println("请输入要回的信息:");
            String str2=scan.next();
            os.write(str2.getBytes());
            if ("end".equals(str2)){
                System.out.println("服务器端发送end给客户端，结束通信");
                os.close();
                is.close();
                socket.close();
                return;
            }

        }

    }
}
