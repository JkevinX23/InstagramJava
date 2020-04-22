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
import com.jkevinx23.instaapp.models.User;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingWorker;
import org.json.JSONObject;

/**
 *
 * @author jkevi
 */
public class AsyncGetUserPhoto extends SwingWorker<Image, Void> {

    String iduser;
    JLabel icon;
    String token = Keys.BearerToken;

    public AsyncGetUserPhoto(String id, JLabel icon) {
        this.iduser = id;
        this.icon = icon;
    }

    @Override
    protected Image doInBackground() throws Exception {

        Connection con = new Connection();

        User user = new User();

        Image png;

        JSONObject id = new JSONObject();

        id.put("_id", iduser);
        String response = con.POST_JSON_AUTH2("/public/profile", id, token);
        JSONObject jsonObject = new JSONObject(response);
        System.out.println(response);
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

            Image png = get();
            ResizeImages ri = new ResizeImages();
            png = ri.resize(png, 42);

            icon.setIcon(new ImageIcon(png));

        } catch (InterruptedException ex) {
            Logger.getLogger(AsyncGetUserPhoto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(AsyncGetUserPhoto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
