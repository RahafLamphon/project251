package project251;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHROOQAS
 */


public class Patient {
    int id;
    String name;
    String username;
    int password;
   // Catogery catogery;

    public Patient() {
    }

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
    //getters
   /* public Catogery getCatogery() {
        return catogery;
    }*/
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public String getUsername() {
        return username;
    }
    //setters
  /*  public void setCatogery(Catogery catogery) {
        this.catogery = catogery;
    }*/

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
   /* @Override
    public String toString() {
        return "Patient:\n" + "id=" + id + "\nname=" + name + "\ncatogery=" + catogery ;
    }*/
}