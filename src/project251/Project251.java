
package project251;

import java.util.*;

public class Project251 {
    static ArrayList<Patient> PatientList = new ArrayList<Patient>();
     static ArrayList<Category> categoryList = new ArrayList<Category>();
     static String name;
    
    public static void main(String[] args) {
        
        /* System.out.println("shrooq alsadiq");
         System.out.println("Jehan Meqdad");
         System.out.println("Shjoon Nasser Almutairi!");
         System.out.println("Raghad Alzahrani :)");
         System.out.println("Rahaf Lamphon");*/
        
        Scanner s=new Scanner(System.in);
        
         Category t=new Category();
         System.out.println("heres a list of category Diseases");
         System.out.println(t.getCatType());
         System.out.println("please select a number");
         
         
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
                  Patient(input,PatientList,categoryList);
             }
         }
         else if (Choice.equalsIgnoreCase("P")){
             
         }
    }
    
    
    public static void Patient(Scanner input, ArrayList<Patient> PatientList, ArrayList<Category> categoryList){
        System.out.print("Enter patient's Name: ");
        String Pname = input.next();
        int id = (int)(Math.random()*10000);
        Patient Patientinfo = new Patient(id,Pname);
        Therapist.AddPatient(PatientList ,Patientinfo);
        
          Category t=new Category(name);
         System.out.println("heres a list of category Diseases");
         System.out.println(t.getCatType());
         System.out.print("please select a number: ");
     
         int Ptype = input.nextInt();
         t.setCatName(Ptype);
        Therapist.AddCategory(categoryList,t,id,Pname);
    }
    
}