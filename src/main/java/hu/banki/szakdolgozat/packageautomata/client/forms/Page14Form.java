package hu.banki.szakdolgozat.packageautomata.client.forms;

import hu.banki.szakdolgozat.packageautomata.server.models.Package;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;


public class Page14Form {


    public Node getForm() {
        //Alap form, amire a tabla kerul
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(getContent());
        return borderPane;
    }

    public Node getContent() {
        // Tabla letrehozasa
        TableView<Package> table = new TableView<Package>();
        //Tabla feltoltesehez az adatok beszerzese
        ObservableList<Package> packageList = getPackageList();
        //Tabla es adatok osszerendezese
        table.setItems(packageList);

        //Fejlec mezok megadasa
        TableColumn<Package,Integer> packageID = new TableColumn<Package,Integer>("PackageID");
        //Adott fejlechez melyik oszlop tartozik
        packageID.setCellValueFactory(new PropertyValueFactory<>("packageID"));


        TableColumn<Package,Integer> date = new TableColumn<Package,Integer>("Date");
        date.setCellValueFactory(new PropertyValueFactory<>("date"));


        TableColumn<Package,Integer> third = new TableColumn<Package,Integer>("Shelf Type ID");
        third.setCellValueFactory(new PropertyValueFactory<>("shelfTypeId"));

        //tabla oszlopainak hozzarendfelese a tablahoz
//        table.getColumns().clear();
//        table.getItems().clear();

        table.getColumns().add(packageID);
        table.getColumns().add(date);
        table.getColumns().add(third);


        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(table);

        return borderPane;

    }



    //Mintaadatokkal valo feltoltes. A program ezt a reszt adatbazisbol veszi majd!
    private ObservableList<Package> getPackageList() {
        return FXCollections.observableArrayList(
                new Package(1,2023,1,1,1,true,"delivered",1),
                new Package(2,2021,2,2,2,false,"inStock",2)

                //tabla feltoltese DB-bol

        );
    }



}
