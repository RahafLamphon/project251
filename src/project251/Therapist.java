
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
    
}
