package hu.banki.szakdolgozat.packageautomata.client.forms;

import hu.banki.szakdolgozat.packageautomata.client.style.ObjectStyle;
import hu.banki.szakdolgozat.packageautomata.client.style.TextStyle;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;

public class FooterForm {

    private TextStyle style = new TextStyle();

    public Node getFooter() {



        //Kiirando szoveg
        Label lblText = new Label("Random text, ami latszik majd minden oldalon. (Footer)");
        Label lblVersion = new Label("Version: v0.1");

        //szoveg formazasa
//        lblText.setFont(new Font("Arial", 16));
        lblText.setFont(style.getDefault());
//        lblVersion.setFont(new Font("Arial", 16));
        lblVersion.setFont(style.getDefault());

        Label lblProba = new ObjectStyle().getDefaultLabel("dddddd");

        //Olyan terulet meghatarozasa, ami tavolsagot tart a bal es jobb oldalon megjelenitendo szovegek kozott
        Region region = new Region();
        HBox.setHgrow(region, Priority.ALWAYS);

        //Horizontal Box: egymas melletti elemeket lehet bele tenni.
        HBox footer = new HBox();
        //CSS style megadasanak modja
        footer.setStyle("-fx-padding: 10 80 10 30; " +
                "-fx-border-style: solid inside; " +
                "-fx-border-width: 2; " +
                "-fx-border-insets: 5; " +
                "-fx-border-radius: 5; " +
                "-fx-border-color: black; ");
        //Elobb a szoveg, aztan a tavtarto, aztan a verzioszam jelenik meg
        footer.getChildren().setAll(lblText, region, lblVersion);

        return footer;
    }


}
