package org.bitcash.apps.bitcash8.gui.loginmainframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.bitcash.apps.bitcash8.gui.MenuConfigUtilities;

import static org.bitcash.apps.bitcash8.gui.MenuConfigUtilities.MAIN_ICON_20x20;

public class LoginHeaderPane extends JPanel {

    protected LoginHeaderPane() {
        setLayout(new BorderLayout());
        setBackground(new Color(233, 233, 233));
        setBorder(BorderFactory.createRaisedSoftBevelBorder());

        /*
         * Branding at the top right
         */
        JLabel headerLbl = new JLabel("bitcash 8", SwingConstants.RIGHT);
        headerLbl.setFont(new Font("Comfortaa", Font.PLAIN, 20));
        headerLbl.setIcon(MAIN_ICON_20x20);
        /*
         *
         * 
         * Buttons:
         * 
         * 
         */
        /*
         * Information Button
         */
        JButton infoButton = new JButton(
                MenuConfigUtilities.getScaledDefaultIcon("OptionPane.informationIcon", 20, 20));
        infoButton.setMargin(new Insets(0, 0, 0, 0));
        infoButton.setFocusable(false);
        infoButton.setPreferredSize(new Dimension(105, 3));
        infoButton.setText("Information");
        infoButton.setFont(new Font(null, Font.PLAIN, 13));
        infoButton.setHorizontalTextPosition(SwingConstants.RIGHT);
        infoButton.setOpaque(false);
        // infoButton.setContentAreaFilled(false);
        // infoButton.setBorderPainted(false);
        infoButton.setBackground(Color.WHITE);
        infoButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "This zone is incomplete!", "Warning",
                JOptionPane.ERROR_MESSAGE));

        add(headerLbl, BorderLayout.CENTER);
        add(infoButton, BorderLayout.WEST);

    }
    
}
