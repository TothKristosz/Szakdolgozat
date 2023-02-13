package hu.banki.szakdolgozat.packageautomata.application;

import hu.banki.szakdolgozat.packageautomata.client.Client;
import hu.banki.szakdolgozat.packageautomata.server.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Server server = new Server();
        server.start();
        System.out.println("Hello");

        Client client = new Client();
        client.start();
    }
}