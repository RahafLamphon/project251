
package project251;

import java.util.*;
import java.io.*;

public class Project251 {
    static ArrayList<Patient> PatientList = new ArrayList<Patient>();
    static ArrayList<Category> categoryList = new ArrayList<Category>();
    static ArrayList<Therapist> TherapistList = new ArrayList<Therapist>(); 
    static ArrayList<Treatment_Plan> Treatment_Plan = new ArrayList<Treatment_Plan>(); 
   public static void main(String[] args) throws FileNotFoundException {
        
        
        /* System.out.println("shrooq alsadiq");
         System.out.println("Jehan Meqdad");
         System.out.println("Shjoon Nasser Almutairi!");
         System.out.println("Raghad Alzahrani :)");
         System.out.println("Rahaf Lamphon");*/
       
        /*Category t=new Category();
        System.out.println("heres a list of category Diseases");
        System.out.println(t.getCatType());
        System.out.println("please select a number");*/
        
       
        TherapistList.add(new Therapist("Haifa"));
     
        Scanner s=new Scanner(System.in);
        
         
        Scanner input = new Scanner(System.in);
        System.out.println("-----------Hello! Welcome to KAU Therapy clinic-----------");
        while(true){
        System.out.print("Are you a patient or a Therapist? (write P for patient & T for therapist): ");
        String Choice = input.next();
       
            
        if (Choice.equalsIgnoreCase("T")){
            
           //log in  
            Therapist TherapistUser=TherapistLogIn(s);
            if(TherapistUser==null) {
                System.out.println("user not found");
                continue;
            }
            int TChoice = 0;
            do{
                //menu 
                System.out.println("==============Therapist menu==============");
                System.out.println("1) add new patient & categorise them");
                System.out.println("2) add patient Treatment plan       ");
                System.out.println("3) Mark the end of the session");
                System.out.println("5) exit");
                System.out.println("6) quit (exit they system)");
                System.out.print("What is your choice? ");
                TChoice = input.nextInt();
             
            if (TChoice == 1){
                Patient(input,PatientList,categoryList,TherapistUser);
            }
            else if(TChoice==2){
                AddTreatmentPlan(input,PatientList,categoryList);
            }
            else if(TChoice==3){
                MarkSessionEnd(input, PatientList, Treatment_Plan);
            }
            else if (TChoice == 6){
                System.exit(0);}
            }while( TChoice !=5 );
        }
        else if (Choice.equalsIgnoreCase("P")){
            int PChoice = 0;
            
            
            do{
            //menu 
            System.out.println("==============Patient menu==============");
            System.out.println("1) view treatment plan"); 
            System.out.println("5) exit");
            System.out.println("6) quit (exit they system)");
            System.out.print("What is your choice? "); 
            PChoice = input.nextInt();
            
            if (PChoice == 1){
                  //
            }
            if (PChoice == 6){
                System.exit(0);}
            }while(PChoice!=5 );
            }
  
        }
    }
    
    public static void Patient(Scanner input, ArrayList<Patient> PatientList, ArrayList<Category> categoryList,Therapist TherapistUser) throws FileNotFoundException{
        
        //add new patient
        System.out.print("Enter patient's Name: ");
        String Pname = input.next();
        
        int id = (int)(Math.random()*10000);
        Patient Patientinfo = new Patient(id,Pname);
        
        TherapistUser.AddPatient(PatientList ,Patientinfo);
        
        //add Categoty to patient
        Category t=new Category();
        System.out.println("heres a list of category Diseases");
        System.out.println(t.getCatType());
        
        System.out.print("please select a number: ");
        int Ptype = input.nextInt();
        t.setCatName(Ptype);
      
        TherapistUser.AddCategory(categoryList,t,id,Pname,PatientList);
        savePatientInfoToFile("patient_info.txt");
      
    }
    
    public static Therapist TherapistLogIn (Scanner input ){
        
     System.out.print("enter your name :");
     
     String THname = input.next();
     for (Therapist th : TherapistList ){
         
        if (th.TName.equalsIgnoreCase(THname)){
            
            System.out.println(THname+" log in successfully");
            return th;
           }
     }
     return null;
     
     }
    
    public static Patient PatientLogIn (Scanner input ){
     System.out.println("enter your name :");
     String Pname = input.next();
     
     for (Patient p : PatientList ){
         
        if (p.name.equalsIgnoreCase(Pname)){
            
            System.out.println(Pname+" log in successfully");
            return p;
           }
       
     }
        return null;
     
     }
     public static void laodTreatmentPlanDB (Scanner input ){
     System.out.println("enter your name :");
     String Pname = input.next();
     
    
     
     }
     public static void savePatientInfoToFile(String filename) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(new File(filename));
        
        // Write each patient's information to the file
        for (Patient patient : PatientList) {
            writer.println("Patient Name: " + patient.name);
            writer.println("Patient ID: " + patient.id);
            writer.println("Therapist: " + "Haifa");
            writer.println("Category: " + patient.PCategory);
            writer.println(); // Add a blank line for separation
        }
        
        // Close the PrintWriter
        writer.close();
        
        System.out.println("Patient information saved to " + filename);}

    private static void AddTreatmentPlan(Scanner input, ArrayList<Patient> PatientList, ArrayList<Category> categoryList) {
        System.out.println("Enter user Name");
        String pname = input.next();
        Category c;
         System.out.println("Enter plan Name ");
        // genrating a random id number for the plan
         int id = (int)(Math.random()*10000);
         String planName=input.next();
         
        for(int i =0;i<PatientList.size();i++){
           if(pname.equalsIgnoreCase(PatientList.get(i).getName())){
               System.out.println("Correct Patient name ");
            c=PatientList.get(i).getPCategory();
            Treatment_Plan plan=new Treatment_Plan(planName,pname,id,c);
            PatientList.get(i).setPlan(plan);
           }     
           else{
               System.out.println("this patient name dose not exist try again"); 
                break;}
        }
     
    }
    public static void MarkSessionEnd(Scanner input, ArrayList<Patient> PatientList,ArrayList<Treatment_Plan> Treatment_Plan){
        System.out.println("Enter user Name");
        String pname = input.next();
        for(int i =0;i<PatientList.size();i++){
           if(pname.equalsIgnoreCase(PatientList.get(i).getName())){
               System.out.println("Correct Patient name ");
               System.out.print("Choose the session number: ");
               int SNumber = input.nextInt();
               if (SNumber > PatientList.get(i).plan.sessions.length)
               Therapist.MarkSessionEnd(PatientList.get(i).plan.sessions[SNumber]);
           }     
           else{
               System.out.println("this patient name dose not exist try again"); 
                break;}
        }
    }

    
}
