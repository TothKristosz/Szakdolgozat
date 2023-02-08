package hu.banki.szakdolgozat.packageautomata.server.methods;

import hu.banki.szakdolgozat.packageautomata.server.exception.PackageAutomataException;

public class CommonMethods {

    public void stopApplication() {
        throw new PackageAutomataException("Internal Server Error (500)");
    }

    public void stopApplication(String message) {
        throw new PackageAutomataException(message);
    }


}
