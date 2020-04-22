/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.controller.SwingWorkers;

import com.jkevinx23.instaapp.auxiliar.ResizeImages;
import com.jkevinx23.instaapp.config.Connection;
import com.jkevinx23.instaapp.config.Keys;
import com.jkevinx23.instaapp.controller.PrincipalController;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingWorker;
import org.json.JSONObject;

/**
 *
 * @author jkevi
 */
public class AsyncGetPublicPhoto extends SwingWorker<Image, Void> {

    String token = Keys.BearerToken;

    JSONObject pb;
    JLabel icon;

    public AsyncGetPublicPhoto(JSONObject pb,JLabel icon) {
        this.pb = pb;
        this.icon = icon;
    }

    @Override
    protected Image doInBackground() throws Exception {
        Image png;
        Connection con = new Connection();
        String response = con.POST_JSON_AUTH2("/public/pic", pb, token);
        
        JSONObject jsonObject = new JSONObject(response);
        String path = jsonObject.getString("fileUrl");
        try {
            URL url = new URL(path);
            png = ImageIO.read(url);
            return png;

        } catch (MalformedURLException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    @Override
    protected void done() {
        try {
            super.done();
            ResizeImages ri = new ResizeImages();          
      
            Image png = get();
            
            png = ri.resize(png, 240);
            
            icon.setIcon(new ImageIcon(png));
            
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(AsyncGetPublicPhoto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    

}
