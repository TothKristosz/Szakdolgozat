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
    private IntegerProperty date;
    private IntegerProperty shelfTypeID;
    private IntegerProperty receiverMachineID;
    private IntegerProperty customerID;
    private BooleanProperty packageClass;
    private StringProperty status;
    private IntegerProperty receiverID;

    public Package(int packageID, int date, int shelfTypeId, int receiverMachineID, int customerID, boolean packageClass, String status, int receiverID){
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
        return packageID.get();
    }

    public void setPackageID(int value) {
        packageID.set(value);
    }

    public IntegerProperty packageIDProperty() {
        if (packageID == null) {
            packageID = new SimpleIntegerProperty(this, "packageID");
        }
        return packageID;
    }

    // date
    public int getDate() {
        return date.get();
    }

    public void setDate(int value) {
        date.set(value);
    }

    public IntegerProperty dateProperty() {
        if (date == null) {
            date = new SimpleIntegerProperty(this, "date");
        }
        return date;
    }

    // shelfTypeID
    public int getShelfTypeID() {
        return shelfTypeID.get();
    }

    public void setShelfTypeID(int value) {
        shelfTypeID.set(value);
    }

    public IntegerProperty shelfTypeIDProperty() {
        if (shelfTypeID == null) {
            shelfTypeID = new SimpleIntegerProperty(this, "shelfTypeID");
        }
        return shelfTypeID;
    }

    // receiverMachineID
    public int getReceiverMachineID() {
        return receiverMachineID.get();
    }

    public void setReceiverMachineID(int value) {
        receiverMachineID.set(value);
    }

    public IntegerProperty receiverMachineIDProperty() {
        if (receiverMachineID == null) {
            receiverMachineID = new SimpleIntegerProperty(this, "receiverMachineID");
        }
        return receiverMachineID;
    }

    // customerID
    public int getCustomerID() {
        return customerID.get();
    }

    public void setCustomerID(int value) {
        customerID.set(value);
    }

    public IntegerProperty customerIDProperty() {
        if (customerID == null) {
            customerID = new SimpleIntegerProperty(this, "customerID");
        }
        return customerID;
    }

    // packageClass
    public boolean getPackageClass() {
        return packageClass.get();
    }

    public void setPackageClass(boolean value) {
        packageClass.set(value);
    }

    public BooleanProperty packageClassProperty() {
        if (packageClass == null) {
            packageClass = new SimpleBooleanProperty(this, "packageClass");
        }
        return packageClass;
    }

    // status
    public String getStatus() {
        return status.get();
    }

    public void setStatus(String value) {
        status.set(value);
    }

    public StringProperty statusProperty() {
        if (status == null) {
            status = new SimpleStringProperty(this, "status");
        }
        return status;
    }

    // ReceiverID
    public int getReceiverID() {
        return receiverID.get();
    }

    public void setReceiverID(int value) {
        receiverID.set(value);
    }

    public IntegerProperty ReceiverIDProperty() {
        if (receiverID == null) {
            receiverID = new SimpleIntegerProperty(this, "packageReceiverID");
        }
        return receiverID;
    }
}

