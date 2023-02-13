package hu.banki.szakdolgozat.packageautomata.client.forms;

import javafx.scene.Node;
import javafx.scene.control.Label;

import javax.swing.*;

import static hu.banki.szakdolgozat.packageautomata.client.forms.ContentManager.UI_CONTENT_ROOT;

public class HomePage {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("CSA");

    public HomePage(JFrame frame) {
        welcomeLabel.setBounds(100,100,200,350);
        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.dispose();
    }

    public Node getContent() {
        //Alap beallitasok, ami mindig latszanak majd. Header a menu alatt lesz!
        //UI_CONTENT_ROOT.setTop(new HeaderForm().getHeader());
        //ide kellene beszurni a LOGIN/EXIT panelt
        UI_CONTENT_ROOT.setCenter(new Label("F?oldal"));
        return UI_CONTENT_ROOT;
    }
//    public Node getForm() {
//        BorderPane borderPane = new BorderPane();
//        borderPane.setCenter(getContent());
//        return borderPane;
//
//
//        public Node getContent() {
//            BorderPane borderPane = new BorderPane();
//            BorderPane belsoFelso = new BorderPane();
//            borderPane.setTop(belsoFelso);
//            Label lblProba = new Label("CCCCCC");
//            lblProba.setFont(new TextStyle().getDefault());
//
//            HBox hBox = new HBox();
//            hBox.setMinHeight(50.0);
//            hBox.getChildren().add(lblProba);
//
////        belsoFelso.setCenter(lblProba);
//            belsoFelso.setTop(hBox);
//            belsoFelso.setStyle(formStyle.getStandard2ptBlackBorder());
////        belsoFelso.setMinHeight(50.0);
//
//
//            borderPane.setStyle(formStyle.getStandard2ptBlackBorder());
//            Label lbl = new Label("En vagyok a tartalom!");
//            borderPane.setCenter(lbl);
//            return borderPane;
//        }
//
//    }

}

