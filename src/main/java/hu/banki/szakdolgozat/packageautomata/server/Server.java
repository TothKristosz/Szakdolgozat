package hu.banki.szakdolgozat.packageautomata.server;

import hu.banki.szakdolgozat.packageautomata.application.Main;
import hu.banki.szakdolgozat.packageautomata.server.database.MySqlConnection;
import hu.banki.szakdolgozat.packageautomata.server.database.MySqlStatements;
import hu.banki.szakdolgozat.packageautomata.server.models.Package;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

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
            MySqlConnection conn2 = new MySqlConnection();
            conn2.getConnectionWithoutSchema();

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/packageautomata", "boss", ".[/Hl_YaZPynAvgk");

//            String sql = "INSERT INTO vdtb_city (ID, PostalCode, Name) VALUES (?, ?, ?)";
//            stmt = conn.prepareStatement(sql);
//            stmt.setInt(1, 4);
//            stmt.setString(2, "3");
//            stmt.setString(3, "Tatabánya");
//            int rows = stmt.executeUpdate();
//
//            System.out.println(rows + " row(s) inserted.");


            StringBuilder  sql2 = new StringBuilder("SELECT * from vdtb_package");
            ResultSet rs =  new MySqlStatements().selectDataRows(conn,sql2);
            while(rs.next()){
                System.out.println(rs.getString(7));
                Package X = new Package(rs.getInt(1),rs.getString(2),rs.getInt(3),
                        rs.getInt(4),rs.getInt(5),rs.getBoolean(6),
                        rs.getString(7),rs.getInt(8));
                System.out.println(X.getStatus());
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
    }
}

