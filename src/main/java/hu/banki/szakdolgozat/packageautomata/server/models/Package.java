package hu.banki.szakdolgozat.packageautomata.server.models;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Package {
    //PackageID int
    //Date datum
    //ShelfTypeID int
    //ReceiverMachineID int
    //CustomerID int
    //PackageClass boolean
    //Status string
    //ReceiverID int

    private IntegerProperty packageID;
    private IntegerProperty date;
    private IntegerProperty shelfTypeID;
    private IntegerProperty receiverMachineID;
    private IntegerProperty customerID;
    private BooleanProperty packageClass;
    private StringProperty status;
    private IntegerProperty receiverID;
}
