package day20.Text.Text3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        //客户端
        Socket socket=new Socket("localhost",6666);

        while (true){
            //发消息
            OutputStream os=socket.getOutputStream();
            Scanner scan=new Scanner(System.in);
            System.out.println("请输入要发的信息:");
            String str2=scan.next();
            os.write(str2.getBytes());
            if ("end".equals(str2)){
                System.out.println("客户端发送end给服务器端，结束通信");
                os.close();
                socket.close();
                return;
            }

            //收信息
            InputStream is=socket.getInputStream();
            byte[] b=new byte[1024];
            int len=is.read(b);
            String str=new String(b,0,len);
            if ("end".equals(str)){
                System.out.println("客户端收到服务器端发送的end，结束通信");
                is.close();
                os.close();
                socket.close();
                return;
            }
            System.out.println("客户端收到信息:"+str);
        }

    }
}
