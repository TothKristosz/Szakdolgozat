package hu.banki.szakdolgozat.packageautomata.client.forms;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class ContentManager {
    //Statikus konstans, ami kulso hivatkozasbol is elerheto.
    public static final BorderPane UI_CONTENT_ROOT = new BorderPane();

    public Node getContent() {
        //Alap beallitasok, ami mindig latszanak majd. Header a menu alatt lesz!
        UI_CONTENT_ROOT.setTop(new HeaderForm().getHeader());
        //Random szoveg kozepre, ide egy Login ablak is lehetseges


        //UI_CONTENT_ROOT.setCenter(new Label("Ez lesz a kezdo kepernyo"));
        //Ide kerül a Login form!
        UI_CONTENT_ROOT.setCenter(new LoginForm().getForm());

        return UI_CONTENT_ROOT;
    }
}
