package com.jkevinx23.instaapp.models;

/**
 *
 * @author jkevin
 */
public class User {
     private String email;
     private String password;
     private String bio;
     private String name;
     private String nascimento;
     private String username;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getDate() {
        return nascimento;
    }

    public void setDate(String date) {
        this.nascimento = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

     public String getEmail(){
         return email;
     }
      public String getPassword(){
         return password;
     }
      public void setPassword(String password){
        this.password = password;
     }
      public void setEmail(String email){
        this.email = email;
     }

}