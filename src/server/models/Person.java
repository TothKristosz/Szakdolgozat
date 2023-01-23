package server.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

    private StringProperty firstName;
    private StringProperty lastName;

    //Konstruktor
    public Person (String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }



//Egy blokknyi elem
    //getter
    public String getFirstName() {
        return firstNameProperty().get(); }

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
}
