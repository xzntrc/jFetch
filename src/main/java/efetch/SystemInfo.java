package efetch;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class SystemInfo {
    public static String hostname(){
        try {
            InetAddress inetadd = InetAddress.getLocalHost();
            String host = inetadd.getHostName();
            return host;
        }
        catch(UnknownHostException u){
        }
        return null;
    }
    public static String user(){
        String username = System.getProperty("user.name");
        return username;
    }
}