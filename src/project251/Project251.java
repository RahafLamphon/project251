
package project251;

import java.util.*;

public class Project251 {
    static ArrayList<Patient> PatientList = new ArrayList<Patient>();
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("-----------Hello! Welcome to KAU Therapy clinec-----------");
         System.out.print("Are you a patient or a Therapist? (write P for patient & T for therapist): ");
         String Choice = input.next();
         if (Choice.equalsIgnoreCase("T")){
             System.out.println("==============Therapist menu==============");
             System.out.println("1) add new patient & categorise them"); 
             System.out.print("What is your choice? ");
             int TChoice = input.nextInt();
             if (TChoice == 1){
                 Patient(input, PatientList);
             }
         }
         else if (Choice.equalsIgnoreCase("P")){
             
         }
    }
    
    
    public static void Patient(Scanner input, ArrayList PatientList){
        System.out.print("Enter patient's Name: ");
        String Pname = input.next();
        int id = (int)(Math.random()*10000);
        Patient Patientinfo = new Patient(id,Pname);
        Therapist.AddPatient(PatientList ,Patientinfo);
        //Therapist.AddCategory();
    }
    
}
