package org.bitcash.apps.bitcash8.gui.loginmainframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/*
 * This JPanel subclass represents the main banner and description page of the MainLoginFrame.
 */
public class LoginCentralPane extends JPanel {
    private ImageIcon image = new ImageIcon("src/main/resources/ambience.gif");

    protected LoginCentralPane() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        /*
         * 
         * Setting the dimensions of this panel to be those of the image it is displaying.
         * 
         */
        setMaximumSize(new Dimension(image.getIconWidth(),image.getIconHeight()));
        /*
         * The image
         */
        JLabel main = new JLabel(image);
        main.setHorizontalAlignment(SwingConstants.CENTER);

        add(main,BorderLayout.NORTH);
    }
    
}
