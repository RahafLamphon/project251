
package project251;

import java.util.*;

public class Project251 {
    static ArrayList<Patient> PatientList = new ArrayList<Patient>();
    static ArrayList<Category> categoryList = new ArrayList<Category>();
    static ArrayList<Therapist> TherapistList = new ArrayList<Therapist>(); 
    
    public static void main(String[] args) {
        
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
        System.out.println("-----------Hello! Welcome to KAU Therapy clinec-----------");
        System.out.print("Are you a patient or a Therapist? (write P for patient & T for therapist): ");
        String Choice = input.next();
       
       
        if (Choice.equalsIgnoreCase("T")){
            
           //log in  
            Therapist TherapistUser=TherapistLogIn (s);
            if(TherapistUser==null) {
                System.out.println("user not found");
                System.exit(0);
            }
            int TChoice = 0;
            do{
                //menu 
                System.out.println("==============Therapist menu==============");
                System.out.println("1) add new patient & categorise them");
                System.out.println("5) exit");
                System.out.print("What is your choice? ");
                TChoice = input.nextInt();
             
            if (TChoice == 1){
                Patient(input,PatientList,categoryList,TherapistUser);
            }
            
            }while( TChoice !=5 );
        }
        else if (Choice.equalsIgnoreCase("P")){
            int PChoice = 0;
            
            
            do{
            //menu 
            System.out.println("==============Patient menu==============");
            System.out.println("1) view treatment plan"); 
            System.out.println("5) exit");
            System.out.print("What is your choice? "); 
            PChoice = input.nextInt();
            
            if (PChoice == 1){
                  //
            }
            }while(PChoice!=5 );
         }
  
    }
    
    public static void Patient(Scanner input, ArrayList<Patient> PatientList, ArrayList<Category> categoryList,Therapist TherapistUser){
        
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
    }
    
    public static Therapist TherapistLogIn (Scanner input ){
        
     System.out.println("enter your name :");
     
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
}