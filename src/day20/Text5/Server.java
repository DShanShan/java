package day20.Text5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("服务器端等待连接");
        ServerSocket server = new ServerSocket(8888);
        Random rand = new Random();
        while (true) {
            Socket socket = server.accept();
            System.out.println("连接成功");
            String str = "";
            for (int i = 0; i < 4; i++) {
                int num = rand.nextInt(10);
                str += num;
            }
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\java\\" + str+".txt"));
            byte[] b = new byte[1024];
            int len;
            while (true) {
                len = bis.read(b);
                if (len == -1) {
                    break;
                }
                bos.write(b, 0, len);
            }
            System.out.println("上传成功");
            bos.close();
            bis.close();
            socket.close();
        }


    }
}
