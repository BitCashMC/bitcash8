package org.bitcash.apps.bitcash8.gui;

import java.awt.Color;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.UIManager;

public class MenuConfigUtilities {

    public static final ImageIcon MAIN_ICON = new ImageIcon("C:/Users/musky/Dropbox/Java_Programs/Beginner GUI Projects/BITCASH8/bitcash8/src/main/resources/bitcoin_cash.png");
    public static final ImageIcon MAIN_ICON_20x20 = new ImageIcon(MAIN_ICON.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));

    public static void visualizeBorders(JComponent component) {
        component.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
    }

    public static ImageIcon getScaledDefaultIcon(String key, int width, int height) {
        ImageIcon img = (ImageIcon) UIManager.getIcon(key);
        return new ImageIcon(img.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
    }
    
}
