package main;

import py4j.GatewayServer;

public class AdditionService {

    public int addition(int first, int second) {
        return first + second;
    }

    public static void main(String[] args) {
        AdditionService app = new AdditionService();
        // app is now the gateway.entry_point
        GatewayServer server = new GatewayServer(app);
        server.start();
    }
}
