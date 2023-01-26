package client.forms;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import server.models.Person;

import java.util.List;


public class Page13Form {


    public Node getForm() {
        //Alap form, amire a tabla kerul
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(getContent());
        return borderPane;
    }

    public Node getContent() {
        // Tabla letrehozasa
        TableView<Person> table = new TableView<Person>();
        //Tabla feltoltesehez az adatok beszerzese
        ObservableList<Person> teamMembers = getTeamMembers();
        //Tabla es adatok osszerendezese
        table.setItems(teamMembers);

        //Fejlec mezok megadasa
        TableColumn<Person,String> firstNameCol = new TableColumn<Person,String>("First Name");
        //Adott fejlechez melyik oszlop tartozik
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));


        TableColumn<Person,String> lastNameCol = new TableColumn<Person,String>("Last Name");
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        //tabla oszlopainak hozzarendfelese a tablahoz
//        table.getColumns().clear();
//        table.getItems().clear();
        table.getColumns().add(firstNameCol);
        table.getColumns().add(lastNameCol);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(table);

        return borderPane;

    }



    //Mintaadatokkal valo feltoltes. A program ezt a reszt adatbazisbol veszi majd!
    private ObservableList<Person> getTeamMembers() {
        return FXCollections.observableArrayList(
                new Person("firstname1", "lastname1"),
                new Person("firstname2", "lastname2")
        );
    }



}
