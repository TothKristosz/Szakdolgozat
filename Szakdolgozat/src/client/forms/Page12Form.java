package client.forms;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class Page12Form {

    //Ki kell vezetni osztaly szintu valtozoba, mert az ActionEvent-nek is latnia kell
    private final Label lblResult = new Label("");
    private final ComboBox<String> cmbComboBox = new ComboBox<>();
    private final TextField txtTextField = new TextField();

    public Node getForm() {
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(getContent());
        return borderPane;
    }

    public Node getContent() {
        //Elemek
        Label lblLabel = new Label("LabelText");
        Button btnButton = new Button("ButtonText");

        //Lenyilo lista feltoltese
        cmbComboBox.setValue("Default tartalom");
        cmbComboBox.getItems().addAll("Elso elem", "Masodik elem", "Harmadik elem");

        //Esemeny hozzadasa
        btnButton.setOnAction(actionEventPush());

        //Elhelezes a tablazatba
        //Az elemeket x, y coordinatak alapjan lehet elhelyezni
        GridPane grid = new GridPane();
        grid.add(lblLabel, 1, 1);
        grid.add(btnButton, 2, 1);
        grid.add(cmbComboBox, 1, 2);
        grid.add(lblResult, 2, 2);
        grid.add(txtTextField, 3, 2);

        return grid;
    }

    //Esemeny akkor triggerel, ha a gombot megnyomta valaki
    private EventHandler<ActionEvent> actionEventPush() {
        return event -> {
            lblResult.setText(cmbComboBox.getValue());
            txtTextField.setText(lblResult.getText());
        };
    }
}
