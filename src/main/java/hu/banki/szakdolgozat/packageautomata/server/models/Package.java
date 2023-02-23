package hu.banki.szakdolgozat.packageautomata.server.models;

import javafx.beans.property.*;

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
    private StringProperty date;
    private IntegerProperty shelfTypeID;
    private IntegerProperty receiverMachineID;
    private IntegerProperty customerID;
    private BooleanProperty packageClass;
    private StringProperty status;
    private IntegerProperty receiverID;

    public Package(int packageID, String date, int shelfTypeId, int receiverMachineID, int customerID, boolean packageClass, String status, int receiverID){
    setPackageID(packageID);
    setDate(date);
    setShelfTypeID(shelfTypeId);
    setReceiverMachineID(receiverMachineID);
    setCustomerID(customerID);
    setPackageClass(packageClass);
    setStatus(status);
    setReceiverID(receiverID);
    }
    // packageID
    public int getPackageID() {
        return  packageIDProperty().get();
    }

    public void setPackageID(int value) {
        packageIDProperty().set(value);
    }

    public IntegerProperty packageIDProperty() {
        if (packageID == null) {
            packageID = new SimpleIntegerProperty(this, "packageID");
        }
        return packageID;
    }

    // date
    public String getDate() {
        return dateProperty().get();
    }

    public void setDate(String value) {
        dateProperty().set(value);
    }

    public StringProperty dateProperty() {
        if (date == null) {
            date = new SimpleStringProperty(this, "date");
        }
        return date;
    }

    // shelfTypeID
    public int getShelfTypeID() {
        return shelfTypeIDProperty().get();
    }

    public void setShelfTypeID(int value) {
        shelfTypeIDProperty().set(value);
    }

    public IntegerProperty shelfTypeIDProperty() {
        if (shelfTypeID == null) {
            shelfTypeID = new SimpleIntegerProperty(this, "shelfTypeID");
        }
        return shelfTypeID;
    }

    // receiverMachineID
    public int getReceiverMachineID() {
        return receiverMachineIDProperty().get();
    }

    public void setReceiverMachineID(int value) {
        receiverMachineIDProperty().set(value);
    }

    public IntegerProperty receiverMachineIDProperty() {
        if (receiverMachineID == null) {
            receiverMachineID = new SimpleIntegerProperty(this, "receiverMachineID");
        }
        return receiverMachineID;
    }

    // customerID
    public int getCustomerID() {
        return customerIDProperty().get();
    }

    public void setCustomerID(int value) {
        customerIDProperty().set(value);
    }

    public IntegerProperty customerIDProperty() {
        if (customerID == null) {
            customerID = new SimpleIntegerProperty(this, "customerID");
        }
        return customerID;
    }

    // packageClass
    public boolean getPackageClass() {
        return packageClassProperty().get();
    }

    public void setPackageClass(boolean value) {
        packageClassProperty().set(value);
    }

    public BooleanProperty packageClassProperty() {
        if (packageClass == null) {
            packageClass = new SimpleBooleanProperty(this, "packageClass");
        }
        return packageClass;
    }

    // status
    public String getStatus() {
        return statusProperty().get();
    }

    public void setStatus(String value) {
        statusProperty().set(value);
    }

    public StringProperty statusProperty() {
        if (status == null) {
            status = new SimpleStringProperty(this, "status");
        }
        return status;
    }

    // ReceiverID
    public int getReceiverID() {
        return ReceiverIDProperty().get();
    }

    public void setReceiverID(int value) {
        ReceiverIDProperty().set(value);
    }

    public IntegerProperty ReceiverIDProperty() {
        if (receiverID == null) {
            receiverID = new SimpleIntegerProperty(this, "packageReceiverID");
        }
        return receiverID;
    }
}
