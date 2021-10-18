package singleton;

public class Aclazz {
    private SocketClient socketClient;

    public Aclazz() {
        this.socketClient = SocketClient.getInstance();
//        this.socketClient = new SocketClient(); // A클래스에서 직접 생성
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
