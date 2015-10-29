import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;

/**
 * Created by Marco on 29.10.2015.
 */
public class VLCListenerThread implements Runnable {
    private String hostname="127.0.0.1";
    private Integer port=8080;
    private String username="";
    private String password="";
    static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    public VLCListenerThread(String hostname, Integer port, String username, String password) {
        this.hostname=hostname;
        this.port=port;
        this.username=username;
        this.password=password;
        System.out.printf("Instantiating VLCListenerThread on http://%s:%s@%s:%d/\n",username,password,hostname,port);
    }
    public void run() {
        System.out.println("hi from thread");
    }
}
