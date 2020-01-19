package day20.Text5;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket=new Socket("localhost",8888);

        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("d:\\fos.txt"));
        BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());
        byte[] b=new byte[1024];
        while (true) {
            int len = bis.read(b);
            if (len==-1){
                break;
            }
            bos.write(b,0,len);
        }
        System.out.println("文件上传成功");

        bos.close();
        bis.close();
        socket.close();


    }
}
