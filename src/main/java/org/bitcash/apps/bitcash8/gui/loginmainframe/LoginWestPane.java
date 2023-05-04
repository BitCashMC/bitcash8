package org.bitcash.apps.bitcash8.gui.loginmainframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import org.bitcash.apps.bitcash8.gui.MenuConfigUtilities;

public class LoginWestPane extends JPanel {
    
    protected LoginWestPane() {
        setLayout(new GridLayout(2,1));
        setBackground(new Color(198, 223, 223));
        setBorder(new TitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Login/Register"));
        add(new LoginPane());
    }
    public static class LoginPane extends JPanel {
        /*
         * These two boxes are the input streams for the application backend to read the login details.
         */
        protected final JTextField USERNAME_BOX;
        protected final JPasswordField PASSWORD_BOX;

        protected LoginPane() {
            /*
             * 
             * Login Panel
             * 
             */
            setLayout(new BorderLayout());
            setOpaque(false);
            /*
             * login_p1 = Panel containing labels for login within LoginPanel parent
             * container
             */
            JPanel login_p1 = new JPanel();
            login_p1.setOpaque(false);
            login_p1.setLayout(new BoxLayout(login_p1, BoxLayout.Y_AXIS));
            /*
             * Instantiation & initialization of labels for login_p1
             */
            JLabel usernameLbl = new JLabel("Username");
            JLabel passwordLbl = new JLabel("Password");
            Border x = BorderFactory.createEmptyBorder(7, 7, 12, 7);
            usernameLbl.setBorder(x);
            passwordLbl.setBorder(x);

            login_p1.add(usernameLbl);
            login_p1.add(passwordLbl);
            /*
             *
             * login_p2 = Panel containing text fields for login -- text fields are instance
             * variables.
             * 
             */
            Dimension dim = new Dimension(150, 22);
            USERNAME_BOX = new JTextField(12);
            PASSWORD_BOX = new JPasswordField(12);
            USERNAME_BOX.setMaximumSize(dim);
            PASSWORD_BOX.setMaximumSize(dim);

            JPanel login_p2 = new JPanel();
            login_p2.setOpaque(false);
            login_p2.setLayout(new BoxLayout(login_p2, BoxLayout.Y_AXIS));
            login_p2.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));

            login_p2.add(USERNAME_BOX);
            login_p2.add(Box.createVerticalStrut(13)); // Spacing out the two boxes. Creating an empty border does
                                                       // weirdness.
            login_p2.add(PASSWORD_BOX);

            add(login_p1, BorderLayout.WEST);
            add(login_p2, BorderLayout.CENTER);
        }
    }
}
