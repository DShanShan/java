package day20.Text4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception {
        //服务器端
        System.out.println("服务器等待连接");
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        System.out.println("连接成功");


        while (true) {
            //收消息
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String len = br.readLine();
            if ("end".equals(len)) {
                System.out.println("服务器端收到客户端的信息end，结束通信");
                br.close();
                socket.close();
                return;
            }
            System.out.println("服务器端接收到信息:" + len);

            //回消息
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            Scanner scan = new Scanner(System.in);
            System.out.println("请输入要回的信息:");
            String str2 = scan.next();
            bw.write(str2);
            bw.newLine();
            bw.flush();
            if ("end".equals(str2)) {
                System.out.println("服务器端发送end给客户端，结束通信");
                bw.close();
                br.close();
                socket.close();
                return;
            }

        }
    }
}
