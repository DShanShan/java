package day20.Text7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {
    public static void main(String[] args) throws Exception{
        System.out.println("服务器等待连接");
        ServerSocket server=new ServerSocket(8999);
        while (true) {
            Socket socket = server.accept();
            System.out.println("连接成功");

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:\\fos.png"));
            BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());
            byte[] b=new byte[1024];
            int len;
            while (true){
                len=bis.read(b);
                if (len==-1){
                    break;
                }
                bos.write(b,0,len);
            }

            bos.close();
            bis.close();
            socket.close();
        }
    }
}
