package hu.banki.szakdolgozat.packageautomata.server.database;

import hu.banki.szakdolgozat.packageautomata.server.exception.PackageAutomataException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static hu.banki.szakdolgozat.packageautomata.server.settings.Properties.MYSQL_SCHEMA;

public class MySqlStatements {

    private static final Logger logger = LoggerFactory.getLogger(MySqlStatements.class);

    public void createMySqlSchema(Connection con) {
        try {
            Statement stmt = con.createStatement();
            int result = stmt.executeUpdate("CREATE SCHEMA IF NOT EXISTS " + MYSQL_SCHEMA);
        } catch (SQLException e) {
            logger.error("Unable to create MySql schema: {}", e.getMessage());
            throw new PackageAutomataException();
        }
    }

    public void dropMySqlSchema(Connection con) {
        try {
            Statement stmt = con.createStatement();
            int result = stmt.executeUpdate("DROP SCHEMA IF EXISTS " + MYSQL_SCHEMA);
        } catch (SQLException e) {
            logger.error("Unable to drop MySql schema: {}", e.getMessage());
            throw new PackageAutomataException();
        }
    }

    public void insertDataRows(Connection con, StringBuilder sb) {
        try {
            Statement stmt = con.createStatement();
            stmt.execute(sb.toString());
        } catch (SQLException e) {
            logger.error("Unable to insert into MySql: {}", e.getMessage());
            throw new PackageAutomataException();
        }
    }

    public ResultSet selectDataRows(Connection con, StringBuilder sb) {
        try {
            Statement stmt = con.createStatement();
            return stmt.executeQuery(sb.toString());
        } catch (SQLException e) {
            logger.error("Unable select from MySql: {}", e.getMessage());
            throw new PackageAutomataException();
        }
    }

    public String getFirstValueOfResultSet(ResultSet rs) {
        try {
            rs.next();
            return rs.getString(1);
        } catch (SQLException e) {
            logger.error("Unable to extract ResultSet: {}", e.getMessage());
            throw new PackageAutomataException();
        }
    }

}
