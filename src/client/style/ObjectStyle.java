package client.style;

import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class ObjectStyle {

    public Label getDefaultLabel(String text) {
        Label xxx = new Label(text);
        xxx.setFont(new Font("Arial", 16));
        return xxx;
    }
}
