package client.forms;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.text.Font;

public class HeaderForm {

    //lasd Footer
    public Node getHeader() {
        //Kiirando szoveg
        Label lblText = new Label("Valami szoveg text, ami latszik majd minden oldalon (Header).");

        //szoveg formazasa
        lblText.setFont(new Font("Arial", 16));

        Region region = new Region();
        HBox.setHgrow(region, Priority.ALWAYS);

        HBox header = new HBox();
        header.setStyle("-fx-padding: 10 80 10 30; " +
                "-fx-border-style: solid inside; " +
                "-fx-border-width: 2; " +
                "-fx-border-insets: 5; " +
                "-fx-border-radius: 5; " +
                "-fx-border-color: black;");
        header.getChildren().setAll(lblText, region);

        return header;

    }
}
