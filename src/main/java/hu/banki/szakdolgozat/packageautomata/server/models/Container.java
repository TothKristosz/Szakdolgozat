package hu.banki.szakdolgozat.packageautomata.server.models;

import javafx.beans.property.IntegerProperty;
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
        setaddressID(addressID);
        setsize(size);
    }

}
