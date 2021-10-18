package singleton;

public class BClazz {

    private SocketClient socketClient;

    public BClazz() {
        this.socketClient = SocketClient.getInstance();
//        this.socketClient = new SocketClient(); // B클래스에서 직접 생성
    }

    public SocketClient getSocketClient() {
        return socketClient;
    }
}
