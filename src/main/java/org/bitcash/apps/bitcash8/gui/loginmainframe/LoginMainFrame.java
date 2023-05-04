package org.bitcash.apps.bitcash8.gui.loginmainframe;

import java.awt.BorderLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

import static org.bitcash.apps.bitcash8.gui.MenuConfigUtilities.MAIN_ICON;

public class LoginMainFrame extends JFrame {


    private final int RESOLUTION_WIDTH;
    private final int RESOLUTION_HEIGHT;

    protected LoginMainFrame() {
        /*
         * Getting the main screen's resolution in order to position the window in the center of the screen upon launch.
         */
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        RESOLUTION_WIDTH = gd.getDisplayMode().getWidth();
        RESOLUTION_HEIGHT = gd.getDisplayMode().getHeight();
        /*
         * Calculating and initializing the main frame's dimensions and position on screen relative to screen size.
         */
        setLocation(RESOLUTION_WIDTH/3,RESOLUTION_HEIGHT/3);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        /*
         * 
         * metadata
         * 
         */
        setTitle("Bitcash 8 Launcher");
        setIconImage(MAIN_ICON.getImage());   
        /*
         * Adding subcomponents
         */
        add(new LoginCentralPane(), BorderLayout.CENTER);
        add(new LoginHeaderPane(), BorderLayout.NORTH);
        add(new LoginWestPane(), BorderLayout.WEST);
        add(new LoginSouthPane(), BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        LoginMainFrame frame = new LoginMainFrame();
        System.out.println("Screen resolution: " + frame.RESOLUTION_WIDTH + "x" + frame.RESOLUTION_HEIGHT);
    }
    
}
