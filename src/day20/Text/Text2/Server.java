package day20.Text.Text2;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) throws Exception {
        //服务器端
        System.out.println("服务器端等待连接");
        ServerSocket server = new ServerSocket(6666);
//        侦听并接受连接
//        ExecutorService executorService= Executors.newFixedThreadPool(2);
        //阻塞
        while (true) {
            Socket socket = server.accept();
            System.out.println("连接上了");
            new Thread(){
                @Override
                public void run() {
                    InputStream is = null;
                    try {
                        is = socket.getInputStream();
                        byte[] b = new byte[1024];
                        int len;
                        len = is.read(b);
                        String str = new String(b, 0, len);
                        sleep(10000);
                        System.out.println("服务器端收到信息:" + str);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }.start();


        }
    }
}
