package site.daishuyang.tcp;

import cn.hutool.core.util.HexUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author steven
 * @date 2022-03-03 13:05
 */
public class TcpService {

    public static final String SERVICE_IP = "192.168.1.24";

    public static final int SERVICE_PORT = 10101;

    // 是否开锁标记
    public static boolean IS_OPEN = false;

    public static void main(String[] args) {
        TcpService service = new TcpService();
        //启动服务端
        service.startService();
    }

    public void startService(){
        try {
            //封装服务端地址
            InetAddress serverAddress = InetAddress.getByName(SERVICE_IP);
            //建立服务端
            try(ServerSocket service = new ServerSocket(SERVICE_PORT, 10, serverAddress)){
                while (true){
                    //接受一个连接，该方法会阻塞程序，直到一个链接到来
                    try(Socket client = service.accept()){
                        //读取客户端发送来的消息
                        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
                        String mess = br.readLine();
                        System.out.println("客户端消息："+mess);
                        //组建响应信息
                        while(true) {
                            if (IS_OPEN) {
                                IS_OPEN = false;
                                String response = "5A21000D76";
                                System.out.println(response);
                                //获取输入流，并通过向输出流写数据的方式发送响应
                                OutputStream out = client.getOutputStream();
                                out.write(HexUtil.decodeHex(response));
                                out.flush();
                            }
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

}
