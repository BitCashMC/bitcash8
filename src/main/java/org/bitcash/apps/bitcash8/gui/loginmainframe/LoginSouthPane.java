package org.bitcash.apps.bitcash8.gui.loginmainframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.bitcash.apps.bitcash8.gui.MenuConfigUtilities;

public class LoginSouthPane extends JPanel {

    protected LoginSouthPane() {
        setLayout(new BorderLayout());
        setBackground(new Color(223, 223, 223));

        JLabel info1 = new JLabel("v1.0.0 DEV -- | Highly incomplete and under heavy development.");
        info1.setIcon(MenuConfigUtilities.getScaledDefaultIcon("OptionPane.warningIcon", 20, 20));
        info1.setFont(new Font(null, Font.PLAIN, 12));
        info1.setHorizontalTextPosition(SwingConstants.RIGHT);
        
        add(info1, BorderLayout.CENTER);
    }
    
}
