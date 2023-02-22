package hu.banki.szakdolgozat.packageautomata.server.models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Container {
    //ID int
    //AddressID int
    //Size string

    private IntegerProperty id;
    private IntegerProperty addressID;
    private StringProperty size;

    public Container(int id,int addressID, String size){
        setid(id);
        setAddressID(addressID);
        setSize(size);
    }

    // getters and setters for id
    public int getid() {
        return idProperty().get();
    }

    public void setid(int value) {
        idProperty().set(value);
    }

    public IntegerProperty idProperty() {
        if (id == null) {
            id = new SimpleIntegerProperty(this, "id");
        }
        return id;
    }

    // getters and setters for addressID
    public int getAddressID() {
        return addressIDProperty().get();
    }

    public void setAddressID(int value) {
        addressIDProperty().set(value);
    }

    public IntegerProperty addressIDProperty() {
        if (addressID == null) {
            addressID = new SimpleIntegerProperty(this, "addressID");
        }
        return addressID;
    }

    // getters and setters for size
    public String getSize() {
        return sizeProperty().get();
    }

    public void setSize(String value) {
        sizeProperty().set(value);
    }

    public StringProperty sizeProperty() {
        if (size == null) {
            size = new SimpleStringProperty(this, "size");
        }
        return size;
    }

}
