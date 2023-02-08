package hu.banki.szakdolgozat.packageautomata.server.database;

import hu.banki.szakdolgozat.packageautomata.client.Client;
import hu.banki.szakdolgozat.packageautomata.server.exception.PackageAutomataException;
import hu.banki.szakdolgozat.packageautomata.server.methods.CommonMethods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

import static hu.banki.szakdolgozat.packageautomata.server.settings.Properties.*;

public class MySqlConnection {

    private static final Logger logger = LoggerFactory.getLogger(MySqlConnection.class);
    private final CommonMethods commonMethods = new CommonMethods();

    public MySqlConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            logger.error("Can not find com.mysql.cj.jdbc.Driver");
            throw new PackageAutomataException();
        }
    }

    public Connection getMySqlSchemaConnection() {
        try {
            return DriverManager.getConnection(MYSQL_CONNECTION_STRING + MYSQL_SCHEMA, MYSQL_USERNAME, MYSQL_PASSWORD);
        } catch (SQLException e) {
            logger.error("Can not connect to MySql schema: {}", e.getMessage());
            throw new PackageAutomataException();
        }
    }


    public Connection getConnectionWithoutSchema() {
        try {
            return DriverManager.getConnection(MYSQL_CONNECTION_STRING + "?user=" + MYSQL_USERNAME + "&password=" + MYSQL_PASSWORD);
        } catch (SQLException e) {
            logger.error("Can not connect to MySql server: {}", e.getMessage());
            throw new PackageAutomataException();
        }
    }


    public void closeConnection(Connection con) {
        try {
            con.close();
        } catch (SQLException e) {
            logger.error("Unable to close MySql session: {}", e.getMessage());
            throw new PackageAutomataException();
        }
    }

}
