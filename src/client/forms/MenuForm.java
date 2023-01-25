package client.forms;

import javafx.scene.Node;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

import static client.forms.ContentManager.UI_CONTENT_ROOT;

public class MenuForm {

    public Node getMenuBar() {

        //Fomenu
        Menu menuName0 = new Menu("Home page");
        Menu menuName1 = new Menu("Beállítások");
        Menu menuName2 = new Menu("Automata");
        Menu menuName3 = new Menu("Fiók");
        Menu menuName4 = new Menu("Csomag");
        Menu menuName5 = new Menu("Report");
        Menu menuName6 = new Menu("Névjegy");
        Menu menuName9 = new Menu("TEST");



        //Almenu
        MenuItem menuItemName01 = new MenuItem("Home page1");

        MenuItem menuItemName11 = new MenuItem("Ablak mérete");
        MenuItem menuItemName12 = new MenuItem("Téma");
        MenuItem menuItemName13 = new MenuItem("Karakterkészlet és méret");

        MenuItem menuItemName21 = new MenuItem("Automaták listája");
        MenuItem menuItemName22 = new MenuItem("Automata keresése");


        MenuItem menuItemName31 = new MenuItem("Adatok");
        MenuItem menuItemName32 = new MenuItem("Szerkesztés");
        MenuItem menuItemName33 = new MenuItem("Rendelési el?zmények");

        MenuItem menuItemName41 = new MenuItem("Csomag feladása");
        MenuItem menuItemName42 = new MenuItem("Csomag nyomonkövetés");
        MenuItem menuItemName43 = new MenuItem("Csomag árak");
        MenuItem menuItemName44 = new MenuItem("Csomag Információk");

        MenuItem menuItemName91 = new MenuItem("tesztelek1");
        MenuItem menuItemName92 = new MenuItem("tesztelek2");
        MenuItem menuItemName93 = new MenuItem("tesztelek3");




        //Esemeny hozzarendelese az almenukhoz
        menuItemName91.setOnAction(event -> UI_CONTENT_ROOT.setCenter(new Page11Form().getForm()));
        menuItemName93.setOnAction(event -> UI_CONTENT_ROOT.setCenter(new Page12Form().getForm()));
        menuItemName93.setOnAction(event -> UI_CONTENT_ROOT.setCenter(new Page13Form().getForm()));
        //menuItemName01.setOnAction(event -> UI_CONTENT_ROOT.setCenter(new HomePage().getContent()));

        //BUGGOS AZ EGESZ OLDAL
       //menuItemName00.setOnAction(event -> UI_CONTENT_ROOT.setCenter(new HomePage().getForm()));

        //Almenu hozzarendelese a menukhoz
        menuName0.getItems().add(menuItemName01);

        menuName1.getItems().add(menuItemName11);
        menuName1.getItems().add(menuItemName12);
        menuName1.getItems().add(menuItemName13);

        menuName2.getItems().add(menuItemName21);
        menuName2.getItems().add(menuItemName22);

        menuName3.getItems().add(menuItemName31);
        menuName3.getItems().add(menuItemName32);
        menuName3.getItems().add(menuItemName33);

        menuName4.getItems().add(menuItemName41);
        menuName4.getItems().add(menuItemName42);
        menuName4.getItems().add(menuItemName43);
        menuName4.getItems().add(menuItemName44);

        menuName9.getItems().add(menuItemName91);
        menuName9.getItems().add(menuItemName92);
        menuName9.getItems().add(menuItemName93);

        //Menuk hozzarendelese egy menubar-hoz
        MenuBar menu = new MenuBar();
        menu.getMenus().add(menuName1);
        menu.getMenus().add(menuName0);
        menu.getMenus().add(menuName2);
        menu.getMenus().add(menuName3);
        menu.getMenus().add(menuName4);
        menu.getMenus().add(menuName5);
        menu.getMenus().add(menuName6);


        menu.getMenus().add(menuName9);


        return menu;
    }
}
