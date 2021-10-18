import singleton.Aclazz;
import singleton.BClazz;
import singleton.SocketClient;

public class Main {
    public static void main(String[] args) {
        Aclazz aclazz = new Aclazz();
        BClazz bclazz = new BClazz();

        SocketClient aClient =aclazz.getSocketClient();
        SocketClient bClient =bclazz.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));
    }
}
