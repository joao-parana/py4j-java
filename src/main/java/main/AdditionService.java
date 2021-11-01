package main;

import py4j.GatewayServer;

public class AdditionService {

    public int addition(int first, int second) {
        return first + second;
    }

    public static void main(String[] args) throws InterruptedException {
        AdditionService app = new AdditionService();
        // app is now the gateway.entry_point
        GatewayServer server = new GatewayServer(app);
        server.start();
        Thread.sleep(9999999999L);
    }
}
