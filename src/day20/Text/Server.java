package day20.Text;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        //服务器端
        System.out.println("服务器端等待连接");
        ServerSocket server = new ServerSocket(6666);
//        侦听并接受连接
        //阻塞
        while (true) {
            Socket socket = server.accept();
            System.out.println("连接上了");

            InputStream is = socket.getInputStream();
            byte[] b = new byte[1024];
            int len;
            len = is.read(b);
            String str = new String(b, 0, len);
            System.out.println("服务器端收到信息:" + str);

        }
    }
}
