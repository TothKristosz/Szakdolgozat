package client.forms;

import javafx.scene.Node;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

import static client.forms.ContentManager.UI_CONTENT_ROOT;

public class MenuForm {

    public Node getMenuBar() {

        //Fomenu
        Menu menuName1 = new Menu("menu name 1");
        Menu menuName2 = new Menu("menu name 2");
        Menu menuName3 = new Menu("menu name 3");

        //Almenu
        MenuItem menuItemName11 = new MenuItem("1 almenu name 1");
        MenuItem menuItemName12 = new MenuItem("1 almenu name 2");
        MenuItem menuItemName13 = new MenuItem("1 almenu name 3");

        MenuItem menuItemName21 = new MenuItem("2 almenu name 1");
        MenuItem menuItemName22 = new MenuItem("2 almenu name 2");
        MenuItem menuItemName23 = new MenuItem("2 almenu name 3");

        MenuItem menuItemName31 = new MenuItem("3 almenu name 1");
        MenuItem menuItemName32 = new MenuItem("3 almenu name 2");
        MenuItem menuItemName33 = new MenuItem("3 almenu name 3");

        //Esemeny hozzarendelese az almenukhoz
        menuItemName11.setOnAction(event -> UI_CONTENT_ROOT.setCenter(new Page11Form().getForm()));
        menuItemName12.setOnAction(event -> UI_CONTENT_ROOT.setCenter(new Page12Form().getForm()));
        menuItemName13.setOnAction(event -> UI_CONTENT_ROOT.setCenter(new Page13Form().getForm()));

        //Almenu hozzarendelese a menukhoz
        menuName1.getItems().add(menuItemName11);
        menuName1.getItems().add(menuItemName12);
        menuName1.getItems().add(menuItemName13);

        menuName2.getItems().add(menuItemName21);
        menuName2.getItems().add(menuItemName22);
        menuName2.getItems().add(menuItemName23);

        menuName3.getItems().add(menuItemName31);
        menuName3.getItems().add(menuItemName32);
        menuName3.getItems().add(menuItemName33);

        //Menuk hozzarendelese egy menubar-hoz
        MenuBar menu = new MenuBar();
        menu.getMenus().add(menuName1);
        menu.getMenus().add(menuName2);
        menu.getMenus().add(menuName3);

        return menu;
    }
}
