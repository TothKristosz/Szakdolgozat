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
        return id.get();
    }

    public void setid(int value) {
        id.set(value);
    }

    public IntegerProperty idProperty() {
        if (id == null) {
            id = new SimpleIntegerProperty(this, "id");
        }
        return id;
    }

    // getters and setters for addressID
    public int getAddressID() {
        return addressID.get();
    }

    public void setAddressID(int value) {
        addressID.set(value);
    }

    public IntegerProperty addressIDProperty() {
        if (addressID == null) {
            addressID = new SimpleIntegerProperty(this, "addressID");
        }
        return addressID;
    }

    // getters and setters for size
    public String getSize() {
        return size.get();
    }

    public void setSize(String value) {
        size.set(value);
    }

    public StringProperty sizeProperty() {
        if (size == null) {
            size = new SimpleStringProperty(this, "size");
        }
        return size;
    }

}

