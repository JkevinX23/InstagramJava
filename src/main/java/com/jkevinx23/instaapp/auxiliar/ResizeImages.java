/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.auxiliar;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

/**
 *
 * @author jkevi
 */
public class ResizeImages {
    
    public Image resize(Image photo,int px){
        if(photo!=null){
            BufferedImage resizedImg
                    = new BufferedImage(px, px, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2
                    = resizedImg.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.drawImage(photo, 0, 0, px, px, null);
            g2.dispose();
            
            return resizedImg;
        }
        return photo;
    }
    
}
