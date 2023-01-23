package application;

import client.Client;
import server.Server;

public class Main {
    public static void main(String[] args) {

        Server server = new Server();
        server.start();

        Client client = new Client();
        client.start();
    }
}