package hu.banki.szakdolgozat.packageautomata.server;

import hu.banki.szakdolgozat.packageautomata.application.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Server {

    private static final Logger logger = LoggerFactory.getLogger(Server.class);

    public void start() {
        logger.info("Server Started");

        //ide jon az uzleti logika
        //Logger beallitasa
        //Adatbazis felepitese basic SQL kod a teszt miatt
        //minta adatok feltöltésenek a kodja jon majd ide
        //Kliensrol kiadott utasítasok felgolgozasa
        //stb

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/packageautomata", "boss", ".[/Hl_YaZPynAvgk");

            String sql = "INSERT INTO vdtb_city (ID, PostalCode, Name) VALUES (?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, 2);
            stmt.setString(2, "2800");
            stmt.setString(3, "Tatabánya");
            int rows = stmt.executeUpdate();

            System.out.println(rows + " row(s) inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
    }
}
