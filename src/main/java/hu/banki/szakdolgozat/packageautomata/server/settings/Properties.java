package hu.banki.szakdolgozat.packageautomata.server.settings;

public class Properties {


    //TODO: a beegetett konstansokat property file-bol kell venni!

    //TODO: fv: property f�jl olvas�s
    //TODO: fv: map-eles

    public static String MYSQL_CONNECTION_STRING = "jdbc:mysql://localhost:3306/database name";
    //3306 lehet de a settingsben kiderül majd
    //TODO adatokkkal feltolteni:
    public static String MYSQL_SCHEMA = "something"; //Database name ide
    public static String MYSQL_USERNAME = "username"; //basic username amivel tudok csatlakozni a databasehez
    public static String MYSQL_PASSWORD = "password";//basic pass amivel tudok csatlakozni a databasehez
    public static int MYSQL_INSERT_MAX_ROWS = 1000;

}
