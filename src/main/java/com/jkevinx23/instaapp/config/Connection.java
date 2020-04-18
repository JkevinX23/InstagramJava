/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.config;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.jkevinx23.instaapp.config.Keys;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONObject;

/**
 *
 * @author jkevin
 */
public class Connection {

    Keys keys = new Keys();
    String url = keys.getLocal();
    Gson gson = new Gson();
    HttpClient httpClient = HttpClientBuilder.create().build();

    public String POST_JSON(String route, Object entity) {

        try {
            String postUrl = url + route;
            HttpPost post = new HttpPost(postUrl);
            StringEntity postingString;
            postingString = new StringEntity(gson.toJson(entity));
            post.setHeader("Content-type", "application/json");
            post.setEntity(postingString);

            ///RESPONSE///
            HttpResponse response = httpClient.execute(post);
            HttpEntity res = response.getEntity();
            String responseString = EntityUtils.toString(res, "UTF-8");

            System.out.println("::RESP_STRING:: " + responseString);

            return responseString;

        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "error";
    }

    public String POST_JSON_AUTH(String route, Object entity, String BearerToken) {

        try {
            String postUrl = url + route;
            HttpPost post = new HttpPost(postUrl);
            StringEntity postingString;
            postingString = new StringEntity(gson.toJson(entity));
            post.setHeader("Content-type", "application/json");
            post.setHeader(HttpHeaders.AUTHORIZATION, "Bearer " + BearerToken);
            post.setEntity(postingString);

            ///RESPONSE///
            HttpResponse response = httpClient.execute(post);
            HttpEntity res = response.getEntity();
            String responseString = EntityUtils.toString(res, "UTF-8");
            System.out.println(responseString);

           return responseString;
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "error";

    }
    
     public String POST_JSON_AUTH2(String route, JSONObject entity, String BearerToken) {

        try {
            String postUrl = url + route;
            HttpPost post = new HttpPost(postUrl);
            StringEntity postingString;
            postingString = new StringEntity(entity.toString());
            post.setHeader("Content-type", "application/json");
            post.setHeader(HttpHeaders.AUTHORIZATION, "Bearer " + BearerToken);
            post.setEntity(postingString);

            ///RESPONSE///
            HttpResponse response = httpClient.execute(post);
            HttpEntity res = response.getEntity();
            String responseString = EntityUtils.toString(res, "UTF-8");
            System.out.println(responseString);

           return responseString;
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "error";

    }

    public String GET_AUTH(String route, String BearerToken) {
        try {
            //String BearerToken = Keys.BearerToken;
            String getUrl = url + route;
            HttpGet get = new HttpGet(getUrl);
            get.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
            get.setHeader(HttpHeaders.AUTHORIZATION, "Bearer " + BearerToken);

            ///RESPONSE///
            HttpResponse response = httpClient.execute(get);
            HttpEntity res = response.getEntity();
            String responseString = EntityUtils.toString(res, "UTF-8");

            System.out.println("::RESP_STRING:: " + responseString);
            return responseString;

        } catch (IOException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "error";

    }

    public void PUT_JSON_AUTH(String route, Object entity, String BearerToken) {

        try {
            String putUrl = url + route;
            HttpPut put = new HttpPut(putUrl);
            StringEntity putingString;
            putingString = new StringEntity(gson.toJson(entity));
            put.setHeader("Content-type", "application/json");
            put.setHeader(HttpHeaders.AUTHORIZATION, "Bearer " + BearerToken);
            put.setEntity(putingString);

            ///RESPONSE///
            HttpResponse response = httpClient.execute(put);
            HttpEntity res = response.getEntity();
            String responseString = EntityUtils.toString(res, "UTF-8");
            System.out.println(responseString);

        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String PUT_MULTIPART_AUTH(String route, File uploadFile, String BearerToken) {

            String putUrl = url + route;
      
            CloseableHttpClient httpClient = HttpClients.createDefault();
            
            HttpPut put = new HttpPut(putUrl);
            
            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
            
            put.setHeader(HttpHeaders.AUTHORIZATION, "Bearer " + BearerToken);
            
        try {
            builder.addBinaryBody("file",
                    new FileInputStream(uploadFile),
                    ContentType.APPLICATION_OCTET_STREAM,
                    uploadFile.getName()
                   );

            HttpEntity multipart = builder.build();
            put.setEntity(multipart);
            CloseableHttpResponse response = httpClient.execute(put);
            HttpEntity res = response.getEntity();
            String responseString = EntityUtils.toString(res, "UTF-8");
            System.out.println(responseString);
            return responseString;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "error";
    }
}
