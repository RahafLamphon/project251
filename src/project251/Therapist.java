
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
      public static void AddCategory(ArrayList<Category> CL, Category PC, int id, String name,ArrayList<Patient> PatientList){
        Patient newP=null;
        for (Patient p : PatientList ){
         
            if (p.name.equalsIgnoreCase(name)){
                p.setPCategory(PC);
                newP=p;
                break;}  }
       
        System.out.println( newP.toString() + ") was addd successfully.");
        
        /*
         CL.add(PC);
        System.out.println("Patient with the name " +p.getName() + " & ID " + p.getId() +
                " and his category (" +PC.getCatName() + ") was addd successfully.");*/
    }
}
