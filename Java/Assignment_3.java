import java.io.IOException;
import java.net.InetAddress;

public class Main {
    public static void main(String[] args) throws IOException {

        String ipAddress="127.1.0.100";
        //the above ip address is  a ipv4 address also known as local host
        InetAddress giveAddress=InetAddress.getByName(ipAddress);
        System.out.println("sending ping request to:"+ipAddress);

        long startTime=System.currentTimeMillis();

        if(giveAddress.isReachable(3000))
            System.out.println("host is reachable");
        else
            System.out.println("host is not reachable");

        long endTime=System.currentTimeMillis();
        long avgTime=(endTime-startTime)/2;

        System.out.println("the median time :"+avgTime+"ms");

    }
}
