package hu.banki.szakdolgozat.packageautomata.client;

import hu.banki.szakdolgozat.packageautomata.client.forms.ContentManager;
import hu.banki.szakdolgozat.packageautomata.client.forms.FooterForm;
import hu.banki.szakdolgozat.packageautomata.client.forms.MenuForm;
import hu.banki.szakdolgozat.packageautomata.server.Server;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Uj javaFx Application class kiegeszítese a sajat reszunkre (extends)
public class Client extends Application {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    //Így kell indítani ez a start fv atnevezheto
    public void start() {
        logger.info("Client Started");
        launch();
    }

    //Ez a start az Application class start method-ja, fixen igy hivjak es a launch utasitas inditja
    public void start (Stage stage) {
        //Kezdo layout
        //Alap felulet, amire az elemeket rakjuk
        BorderPane root = new BorderPane();

        //Felso resze az ablaknak, ahova a menu kerul
        root.setTop(new MenuForm().getMenuBar());

        //Kozepso resze, ami folyamatosan valtozik, attol fugg melyik menure kattintunk
        root.setCenter(new ContentManager().getContent());

        //Lablec
        root.setBottom(new FooterForm().getFooter());

        //Megjelenites
        //Ablak meretet lehet allitani uj scene letrehozasa kozben
        Scene scene = new Scene(root, 1024, 768);

        //Windowsos ablak keretenek a szovegezese
        stage.setTitle("Csomagautomata");

        //Windowsos alkalmazas ikonja
        stage.getIcons().add(new Image("file:szakdoga_kosar.jpg"));

        //Stage - alkalmazas, Scene a tartalom. Ossze kell rendelni oket
        stage.setScene(scene);

        //Egyben az egesz mnegjelenitese. Addig fut, amig be nem zarod az ablakot!
        stage.show();

    }

}
