package server.models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

    private StringProperty firstName;
    private StringProperty lastName;
    private StringProperty sendOrReceive;
    private IntegerProperty id;
    private IntegerProperty permission;
    private IntegerProperty addressid;


    //Konstruktor
    public Person(String firstName, String lastName, String sendOrReceive,int id, int permission, int adressid) {
        setFirstName(firstName);
        setLastName(lastName);
        setSendOrReceive(sendOrReceive);
        setid(id);
        setPermission(permission);
        setAddressid(adressid);
    }


    //Egy blokknyi elem
    //getter
    public String getFirstName() {
        return firstNameProperty().get();
    }

    //setter
    public void setFirstName(String value) {
        firstNameProperty().set(value);
    }

    //opcionalis parameterlista
    public StringProperty firstNameProperty() {
        if (firstName == null) {
            firstName = new SimpleStringProperty(this, "firstName");
        }
        return firstName;
    }
//--------------------

    public String getLastName() {
        return lastNameProperty().get();
    }

    public void setLastName(String value) {
        lastNameProperty().set(value);
    }

    public StringProperty lastNameProperty() {
        if (lastName == null) {
            lastName = new SimpleStringProperty(this, "lastName");
        }
        return lastName;
    }

    public String SendOrReceive() {
        return sendOrReceiveProperty().get();
    }


    public void setSendOrReceive(String value) {
        sendOrReceiveProperty().set(value);
    }

    public StringProperty sendOrReceiveProperty() {
        if (sendOrReceive == null) {
            sendOrReceive = new SimpleStringProperty(this, "sendOrReceive");
        }
        return sendOrReceive;
    }

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

    public int getpermission() {
        return permissionProperty().get();
    }


    public void setPermission(int value) {
        permissionProperty().set(value);
    }


    public IntegerProperty permissionProperty() {
        if (permission == null) {
            permission = new SimpleIntegerProperty(this, "permission");

        }
        return permission;
    }

    public int getaddressid() {
        return addressidProperty().get();
    }

    //setter
    public void setAddressid(int value) {
        addressidProperty().set(value);
    }

    //opcionalis parameterlista
    public IntegerProperty addressidProperty() {
        if (addressid == null) {
            addressid = new SimpleIntegerProperty(this, "addressid");
        }
        return addressid;
    }
}
