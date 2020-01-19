package day20.Text7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.Socket;
import java.util.Random;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket=new Socket("localhost",8999);

        Random rand = new Random();
        String str = "";
        for (int i = 0; i < 4; i++) {
            int num = rand.nextInt(10);
            str += num;
        }
        BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("d:\\java\\"+str+".png"));
        byte[] b = new byte[1024];
        int len;
        while (true) {
            len = bis.read(b);
            if (len == -1) {
                break;
            }
            bos.write(b, 0, len);
        }
        bos.close();
        bis.close();
    }
}
