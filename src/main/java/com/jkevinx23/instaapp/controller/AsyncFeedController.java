/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.controller;

import com.jkevinx23.instaapp.Feed;
import com.jkevinx23.instaapp.ProfileHead;
import com.jkevinx23.instaapp.controller.SwingWorkers.AsyncGetPublicPhoto;
import com.jkevinx23.instaapp.controller.SwingWorkers.AsyncGetUserID;
import com.jkevinx23.instaapp.controller.SwingWorkers.AsyncProfilePhoto;
import org.json.JSONObject;


public class AsyncFeedController {
    
    
    public void setFeedItens(Feed feed, String iduser, JSONObject publicacao){
        
        ///DISPARAR FUNÇÃO ASINCRONA QUE BUSCA OS USUARIOS PELOS IDs;
        ///DISPARA UMA FUNÇÃO ASSINCRONA QUE BUSCA A FOTO DO USARIO PELO ID DELE;
        AsyncGetUserID asyncGetUserID = new AsyncGetUserID(iduser, feed);
        asyncGetUserID.execute();
         
        ///DISPARA UMA FUNCAO ASINCRONA QUE BUSCA A IMAGEM DA PUBLICACAO APARTIR DE SEU PATH;
        AsyncGetPublicPhoto asyncGetPublicPhoto = new AsyncGetPublicPhoto(publicacao, feed.getImageView());
        asyncGetPublicPhoto.execute();
        
    }
    
    public void setHeaderItens(ProfileHead head){
        
        //SET CURRENT USER PROFILE
        AsyncProfilePhoto asyncProfilePhoto = new AsyncProfilePhoto(head.getUserPhoto());
        asyncProfilePhoto.execute();
        
        
    }
    
  
}
