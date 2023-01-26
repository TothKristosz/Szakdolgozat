package client.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static client.forms.ContentManager.UI_CONTENT_ROOT;

public class Login extends JFrame {
    private JTextField tfUsername;
    private JPasswordField pfPassword;
    private JButton login;
    private JLabel username;
    private JButton homePageButton;
    private JPanel loginpanel;
    private JButton clear;
    private JLabel message;

    public Login() {
        setContentPane(loginpanel);
        setTitle("Login Panel");
        setSize(750, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfUsername.setText("");
                pfPassword.setText("");
            }
        });
        homePageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //navigálás a f?oldalra
            }
        });
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!tfUsername.getText().equals("")) {
                    message.setText("Üdv! \n" + tfUsername.getText());
                    HomePage homePage = new HomePage();
                } else {
                    message.setText("Üresen hagytad a mez?t!");
                }
            }
        });
    }

    public static void main(String[] args) {
        Login myLogin = new Login();
    }
}
