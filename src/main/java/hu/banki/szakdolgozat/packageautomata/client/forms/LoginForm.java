package hu.banki.szakdolgozat.packageautomata.client.forms;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class LoginForm {
    //ide kell az fxml-es kodokat bemasolnom

    public Node getForm() {
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(getContent());
        return  borderPane;
    }

    private Node getContent() {
        BorderPane borderPane = new BorderPane();
        Label lbl = new Label("En vagyok a login Ablak");
        borderPane.setCenter(lbl);
        return borderPane;
    }



}
