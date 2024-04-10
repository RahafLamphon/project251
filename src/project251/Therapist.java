
package project251;

import java.util.*;

public class Therapist {
    String TName;

    public Therapist(String TName) {
        this.TName = TName;
    }
    
    public static void AddPatient(ArrayList PL, Patient PI){
        PL.add(PI);
        System.out.print("Patient with the name "+PI.name+" & ID "+PI.id);
        System.out.println(" Was Added successfully");
    }
      public static void AddCategory(ArrayList<Category> CL, Category PC, int id, String name){
       Patient p = new Patient(id, name);
       //Category c = new Category(catname);
       CL.add(PC);
        System.out.println("Patient with the name " +p.getName() + " & ID " + p.getId() +
                " and his category (" +PC.getCatName() + ") was addd successfully.");
    }
}
