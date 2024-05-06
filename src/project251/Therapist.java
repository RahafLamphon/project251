
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
        System.out.println(" Was Added successfully\n");
    }
    
    public static void AddCategory( Category PC, String name,ArrayList<Patient> PatientList){
        
        Patient newP=null;
        
        if(PC!=null && name != null){
            
            for (Patient p : PatientList ){
         
                if (p.name.equalsIgnoreCase(name)){
                    p.setPCategory(PC);
                    newP=p;
                    System.out.println( "Category was add successfully");
                     break;
                } 
            }
            //patient not found
            if(newP==null) System.out.println( "this patient not exit in the system");
        }
        //Category = null
        else if(PC==null )   System.out.println( "error: Category = null");
        
        //name = null       
        else if(name == null)   System.out.println( "error: name = null");
    }
        public static void MarkSessionEnd(Session session){
          Session.getSessionExercise().availability = true;
          System.out.println("Session ended successfully.");
        }
        
        public static void updatePatientExercise( Exercise ex, String update){
         
            ex.setContentOfEx(update);
            System.out.println("\nThis is the new content:\n"+ex.getContentOfEx());
         }
    
        public static void AddComment(Exercise exercise, Scanner input){
            String comment= "";
            if(exercise.getAnswerOfEx() != null){
                System.out.println("Write your comment:");
                comment=input.next();
                exercise.setComment(comment);
            }else{
                System.out.println("The exercise is not solved !");}
            
            
        }

}
