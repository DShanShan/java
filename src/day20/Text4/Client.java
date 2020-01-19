package day20.Text4;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
//客户端
        Socket socket=new Socket("localhost",8888);

        while (true){
            //发消息
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            Scanner scan=new Scanner(System.in);
            System.out.println("请输入要发的信息:");
            String str2=scan.next();
            bw.write(str2);
            bw.newLine();
            bw.flush();
            if ("end".equals(str2)){
                System.out.println("客户端发送end给服务器端，结束通信");
                bw.close();
                socket.close();
                return;
            }

            //收信息
            BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String len=br.readLine();
            if ("end".equals(len)){
                System.out.println("客户端收到服务器端发送的end，结束通信");
                br.close();
                bw.close();
                socket.close();
                return;
            }
            System.out.println("客户端收到信息:"+len);
        }
    }
}
