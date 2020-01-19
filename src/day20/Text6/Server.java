package day20.Text6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.Set;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("服务器等待连接");
        ServerSocket server = new ServerSocket(8888);

        while (true) {
            Socket socket = server.accept();
            System.out.println("连接成功");
            FileReader fr = new FileReader("d:\\fos.txt");
            Properties p = new Properties();
            p.load(fr);
            Set<String> keys = p.stringPropertyNames();
            keys.stream().forEach(n -> {
                System.out.println(n + "=" + p.getProperty(n));
            });

            BufferedWriter bos = new BufferedWriter(new FileWriter("d:\\fos.txt", true));


            String str = "";
            InputStream is = socket.getInputStream();
            byte[] b = new byte[1024];
            int len;
            while (true) {
                len = is.read(b);
                if (len == -1) {
                    break;
                }
                str = new String(b, 0, len);
            }
            String[] str1 = str.split("=");
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            if (p.isEmpty()){
                bos.write(str);
            }
            for (String str4 : keys) {
                if (str1[0].contains(str4)) {
                    if (str1[1].equals(p.getProperty(str4))) {
                        bw.write("客户端登录成功");

                        System.out.println("客户端登录成功");
                    } else {
                        bw.write("密码不正确");
                        System.out.println("密码不正确");
                    }
                }
            }
            keys.stream().forEach(n->{
                if (!(str1[0].equals(n))) {
                    try {
                        bos.newLine();
                        bos.write(str1[0]+"="+str1[1]);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        bw.write("注册成功");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("注册成功");
                }
            });


            bw.flush();
            bw.close();
            bos.close();
            socket.close();
        }

    }
}

