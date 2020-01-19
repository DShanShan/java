package day20.Text2;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        //服务器端
        System.out.println("服务器等待连接");
        ServerSocket server=new ServerSocket(8888);
        Socket socket=server.accept();
        System.out.println("连接成功");

        InputStream is=socket.getInputStream();
        byte[] b=new byte[1024];
        int len=is.read(b);
        String str=new String(b,0,len);
        System.out.println("服务器端接收的信息："+str);

        is.close();
        socket.close();

    }
}
