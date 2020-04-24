/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.controller.SwingWorkers;

import com.jkevinx23.instaapp.auxiliar.ResizeImages;
import com.jkevinx23.instaapp.config.Connection;
import com.jkevinx23.instaapp.config.Keys;
import com.jkevinx23.instaapp.controller.MainController;
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
public class AsyncProfilePhoto extends SwingWorker<Image, Void>{
    
    String token = Keys.BearerToken;
    JLabel label;
    
    
    public AsyncProfilePhoto(JLabel label) {
        this.label = label;
    }
    

    @Override
    protected Image doInBackground() throws Exception {
        Connection con = new Connection();
        Image png;
        String responseString = con.GET_AUTH("/user/photo", token);
        JSONObject jsonObject = new JSONObject(responseString);
        String path = jsonObject.getString("fileUrl");
        try {
            URL url = new URL(path);
            png = ImageIO.read(url);
            return png;
           

        } catch (MalformedURLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected void done() {
        super.done(); 
    
        try {
            ResizeImages ri = new ResizeImages();
            Image profile = get();
            
            profile = ri.resize(profile, 50);
            
            label.setIcon(new ImageIcon(profile));
            
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(AsyncProfilePhoto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
