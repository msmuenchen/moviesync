/**
 * Created by Marco on 29.10.2015.
 */
public class AppInit {
    public static void main(String[] args) {
        System.out.println("hi");
        VLCListenerThread lt=new VLCListenerThread("127.0.0.1",8080,"","admin");
        new Thread(lt).start();
    }
}
