import adaptor.*;
import singleton.Aclazz;
import singleton.BClazz;
import singleton.SocketClient;

public class Main {
    public static void main(String[] args) {
        /*Aclazz aclazz = new Aclazz();
        BClazz bclazz = new BClazz();

        SocketClient aClient =aclazz.getSocketClient();
        SocketClient bClient =bclazz.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));*/

        HairDrier hairDrier = new HairDrier();
        connect(hairDrier);

        Cleaner cleaner = new Cleaner();

        Electronic110V adaptor = new SocketAdaptor(cleaner);
        connect(adaptor);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdaptor = new SocketAdaptor(airConditioner);
        connect(airAdaptor);

    }
    // 콘센트
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}
