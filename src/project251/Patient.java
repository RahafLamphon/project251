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
    Category PCategory;

    public Patient() {
    }

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    
  


    //getters
    public Category getPCategory() {    
        return PCategory;
    }
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
    public void setPCategory(Category PCategory) {
        this.PCategory = PCategory;
    }

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
    
   @Override
    public String toString() {
        return "Patient:\n" + "id=" + id + " ,name=" + name + " ,catogery=" + PCategory.getCatName();
    }
}