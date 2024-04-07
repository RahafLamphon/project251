package project251;

public class Patient {
    int id;
    String name;
    String username;
    int password;
   // Catogery catogery;

    
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
    
    @Override
   /* public String toString() {
        return "Patient:\n" + "id=" + id + "\nname=" + name + "\ncatogery=" + catogery ;
    }*/
}
