/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.auxiliar;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author jkevi
 */
public class DisposeWindow {
    
    public void dispose(Component label){
        JFrame f2 = (JFrame) SwingUtilities.getWindowAncestor(label);
        f2.dispose();
    }
    
}
