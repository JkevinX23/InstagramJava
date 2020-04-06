package com.jkevinx23.instaapp;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.gson.Gson;
import com.jkevinx23.instaapp.config.Keys;
import com.jkevinx23.instaapp.entitys.User;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.util.EntityUtils;
/**
 *
 * @author jkevin
 */
public class Main {
  public static void main(String[] args)
  {
      User user = new User();
      Keys keys = new Keys();
      String url = keys.getLocal();
      user.setEmail("a@email.com");
      user.setPassword("password");
      
      
      String       postUrl       = url+"/session";
      Gson         gson          = new Gson();
      HttpClient   httpClient    = HttpClientBuilder.create().build();
      HttpPost     post          = new HttpPost(postUrl);
      StringEntity postingString;
      
      try {
          postingString = new StringEntity(gson.toJson(user));
          post.setEntity(postingString);
          post.setHeader("Content-type", "application/json");
          HttpResponse  response = httpClient.execute(post);
          HttpEntity entity = response.getEntity();
          String responseString = EntityUtils.toString(entity, "UTF-8");
          System.out.println(responseString);
          
        
      } catch (UnsupportedEncodingException ex) {
          Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
      }
      
  }
    
}
