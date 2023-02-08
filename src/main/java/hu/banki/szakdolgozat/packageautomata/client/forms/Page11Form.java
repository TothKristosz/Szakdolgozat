package hu.banki.szakdolgozat.packageautomata.client.forms;

import hu.banki.szakdolgozat.packageautomata.client.style.FormStyle;
import hu.banki.szakdolgozat.packageautomata.client.style.TextStyle;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class Page11Form {

    private FormStyle formStyle = new FormStyle();

    //Layout kialakitasa fent, lent jobb, bal, kozep
    public Node getForm() {
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(getHeader());
        borderPane.setCenter(getContent());
        borderPane.setBottom(getFooter());
        borderPane.setLeft(getLeftSide());
        borderPane.setRight(getRightSide());

        return  borderPane;
    }

    public Node getHeader() {
        BorderPane borderPane = new BorderPane();
        borderPane.setStyle(formStyle.getStandard2ptBlackBorder());
        Label lbl = new Label("En vagyok a felso resz!");
        borderPane.setCenter(lbl);
        return borderPane;
    }

    public Node getContent() {
        BorderPane borderPane = new BorderPane();
        BorderPane belsoFelso = new BorderPane();
        borderPane.setTop(belsoFelso);
        Label lblProba = new Label("CCCCCC");
        lblProba.setFont(new TextStyle().getDefault());

        HBox hBox = new HBox();
        hBox.setMinHeight(50.0);
        hBox.getChildren().add(lblProba);

//        belsoFelso.setCenter(lblProba);
        belsoFelso.setTop(hBox);
        belsoFelso.setStyle(formStyle.getStandard2ptBlackBorder());
//        belsoFelso.setMinHeight(50.0);


        borderPane.setStyle(formStyle.getStandard2ptBlackBorder());
        Label lbl = new Label("En vagyok a tartalom!");
        borderPane.setCenter(lbl);
        return borderPane;
    }

    public Node getFooter() {
        BorderPane borderPane = new BorderPane();
        borderPane.setStyle(formStyle.getStandard2ptBlackBorder());
        Label lbl = new Label("En vagyok az also resz!");
        borderPane.setCenter(lbl);
        return borderPane;
    }

    public Node getLeftSide() {
        BorderPane borderPane = new BorderPane();
        borderPane.setStyle(formStyle.getStandard2ptBlackBorder());
        Label lbl = new Label("En vagyok a bal oldal!");
        borderPane.setCenter(lbl);
        return borderPane;

    }

    public Node getRightSide() {
        BorderPane borderPane = new BorderPane();
        borderPane.setStyle(formStyle.getStandard2ptBlackBorder());
        Label lbl = new Label("En vagyok a jobb oldal!");
        borderPane.setCenter(lbl);
        return borderPane;
    }
}
