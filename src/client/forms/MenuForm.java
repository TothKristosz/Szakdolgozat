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
        Menu menuName1 = new Menu("Be�ll�t�sok");
        Menu menuName2 = new Menu("Automata");
        Menu menuName3 = new Menu("Fi�k");
        Menu menuName4 = new Menu("Csomag");
        Menu menuName5 = new Menu("Report");
        Menu menuName6 = new Menu("N�vjegy");
        Menu menuName9 = new Menu("TEST");



        //Almenu
        MenuItem menuItemName01 = new MenuItem("Home page1");

        MenuItem menuItemName11 = new MenuItem("Ablak m�rete");
        MenuItem menuItemName12 = new MenuItem("T�ma");
        MenuItem menuItemName13 = new MenuItem("Karakterk�szlet �s m�ret");

        MenuItem menuItemName21 = new MenuItem("Automat�k list�ja");
        MenuItem menuItemName22 = new MenuItem("Automata keres�se");


        MenuItem menuItemName31 = new MenuItem("Adatok");
        MenuItem menuItemName32 = new MenuItem("Szerkeszt�s");
        MenuItem menuItemName33 = new MenuItem("Rendel�si el?zm�nyek");

        MenuItem menuItemName41 = new MenuItem("Csomag felad�sa");
        MenuItem menuItemName42 = new MenuItem("Csomag nyomonk�vet�s");
        MenuItem menuItemName43 = new MenuItem("Csomag �rak");
        MenuItem menuItemName44 = new MenuItem("Csomag Inform�ci�k");

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
