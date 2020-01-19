package day20.Text3;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket=new Socket("127.0.0.1",8888);
        Scanner scan=new Scanner(System.in);
        OutputStream os=socket.getOutputStream();
        os.write(scan.next().getBytes());

        os.close();
        socket.close();
    }
}
