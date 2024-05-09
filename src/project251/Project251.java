
package project251;

import java.util.*;
import java.io.*;

public class Project251 {
    static ArrayList<Patient> PatientList = new ArrayList<Patient>();
    static ArrayList<Therapist> TherapistList = new ArrayList<Therapist>(); 
    static ArrayList<Treatment_Plan> Treatment_Planlist = new ArrayList<Treatment_Plan>(); 
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
        
       laodTreatmentPlanDB ( ) ;
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
                System.out.println("4) update the content of the patient's exercise");
                System.out.println("5) Add comment to patient's exercise");
                System.out.println("6) exit");
                System.out.println("7) quit (exit they system)");
                System.out.print("What is your choice? ");
                TChoice = input.nextInt();
             
            if (TChoice == 1){
                 //add new patient
                System.out.print("Enter patient's Name: ");
                String Pname = input.next();
                Patient(input,Pname);
            }
            else if(TChoice==2){
                //AddTreatmentPlan(input,PatientList,categoryList);
                AddTreatmentPlan2(input,PatientList);
            }
            else if(TChoice==3){
                MarkSessionEnd(input, PatientList, Treatment_Planlist);
            }
            else if(TChoice==4){
               updatePatientExercise(s , PatientList, Treatment_Planlist,TherapistUser);
            }
            else if(TChoice==5){
               AddComment(PatientList, input, Treatment_Planlist);
            }
            else if (TChoice == 7){
                System.exit(0);}
            }while( TChoice !=6 );
        }
        else if (Choice.equalsIgnoreCase("P")){
             Patient PatientUser=PatientLogIn(s);
            
            if(PatientUser==null) {
                
                System.out.println("user not found");
                continue;
            }
            int PChoice = 0;
             String ptname=PatientUser.getName();
            
            do{
            //menu 
            System.out.println("==============Patient menu==============");
            System.out.println("1) view treatment plan"); 
            System.out.println("2) View Homework     ");
            System.out.println("3) Solve Homework");
            System.out.println("4) view Therapist Comment");
            System.out.println("5) exit");
            System.out.println("6) quit (exit the system)");
            System.out.print("What is your choice? "); 
            PChoice = input.nextInt();
            
            if (PChoice == 1){
                PatientUser.showTPlan();
            }
            if (PChoice==2){
                viewhomework(PatientList,ptname,input, Treatment_Planlist);
            }
            if (PChoice==3){
              solveHomework(PatientList,ptname,input, Treatment_Planlist);  
            }
             if (PChoice==4){
              ViewComments(PatientList,input);  
             }
            if (PChoice == 6){
                System.exit(0);}
            }while(PChoice!=5 );
            }
  
        }
    }
    
    public static void Patient(Scanner input,String Pname) throws FileNotFoundException{
        
       
        
        int id = (int)(Math.random()*10000);
        Patient Patientinfo = new Patient(id,Pname);
        
        Therapist.AddPatient(PatientList ,Patientinfo);
        
        //add Categoty to patient
        Category t=new Category();
        System.out.println("heres a list of category Diseases");
        System.out.println(t.getCatType());
        
        System.out.print("please select a number: ");
        int Ptype = input.nextInt();
        t.setCatName(Ptype);
      
        Therapist.AddCategory(t,Pname,PatientList);
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
    public static void laodTreatmentPlanDB ( ) throws FileNotFoundException{
        
        File TP = new File("treatmentPlan.txt");
        
        if(!TP.exists()) {
            
            System.out.println("please select a number");
            System.exit(0);
        }
        
        Scanner RTP = new Scanner(TP);
        String TPName="";
        while(RTP.hasNext()){
            
            if(RTP.next().equalsIgnoreCase("treatmentPlan")){ 
              
              
              
              TPName = RTP.nextLine();
              
              
              Treatment_Plan newTP = new Treatment_Plan(TPName,(int)(Math.random()*10000));
              int sessionNum = RTP.nextInt();
              
              Session[] sessions = new Session[sessionNum];
              
                
                for(int r = 0;r < sessionNum && RTP.next().equalsIgnoreCase("session")  ;r++){
                  
                    String exersiceContent="";
                    int sessionID = RTP.nextInt(); 
                   
                    sessions [r] =new Session(sessionID,TPName);
                    
                    
                    RTP.nextLine();
                   
                     
                    while(true){
                        
                        if(RTP.hasNext("Session")) break;
                        if(RTP.hasNext("treatmentPlan"))break;
                        if(!RTP.hasNext())break;
                        
                        exersiceContent= exersiceContent + RTP.nextLine()+"\n";
                       
                        Exercise ex = new  Exercise(exersiceContent);
                        sessions [r].setSessionExercise(ex);
                    }    
                 
                    newTP.setSessions(sessions);
               }
               Treatment_Planlist.add(newTP);
       
           }
        }
     
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

  
    
      static void AddTreatmentPlan2(Scanner input, ArrayList<Patient> PatientList) {
         System.out.print("Enter patient's Name: ");
        String pname = input.next();
        Category c;
       
        for(int i =0;i<PatientList.size();i++){
            
            if(pname.equalsIgnoreCase(PatientList.get(i).getName())){
               System.out.println("Correct Patient name ");
               c=PatientList.get(i).getPCategory();
                Category t=new Category();
               System.out.println("heres a list of treatment plans");
               System.out.println(t.getCatType());
        
               System.out.print("please select a number: ");
               int option = input.nextInt();
               String TPName ="";
               
               if(option==1)
                    TPName=" obsessive compulsive Disorder";
                else if(option==2)
                    TPName=" Anxiety Disorder";
                else if(option==3)
                    TPName=" Schizophrenia Disorder";
                else if(option==4)
                    TPName=" Bipolar Disorder"; 
                else if(option==5)
                    TPName=" Major Depressive Disorder"; 
                else if(option==6)
                    TPName=" Acute stress Disorder"; 
                else if(option==7)
                    TPName=" Eating Disorders"; 
                else if(option==8)
                    TPName=" Attention-Deficit Hyperactivity Disorder"; 
                else if(option==9)
                    TPName=" Insomnia"; 
               
                for(int p =0;p<Treatment_Planlist.size();p++){
                    
                    if(TPName.equalsIgnoreCase(Treatment_Planlist.get(p).getTreatmentPlan_Name())) { 
                        c=PatientList.get(i).getPCategory();
                        Treatment_Plan plan=Treatment_Planlist.get(p);
                        plan.setCategoryType(c);
                        PatientList.get(i).setPlan(plan);
                        System.out.println("Category was add successfully");
                        
                        break;} 
                }
            
           }     
           else{
               System.out.println("this patient name dose not exist try again"); 
                break;}
        }
     
    }
    public static void MarkSessionEnd(Scanner input, ArrayList<Patient> PatientList,ArrayList<Treatment_Plan> Treatment_Plan){
        
        System.out.print("Enter patient's Name: ");
        String pname = input.next();
        
        for(int i =0;i<PatientList.size();i++){
           if(pname.equalsIgnoreCase(PatientList.get(i).getName())){
               
               System.out.println("Correct Patient name ");
               System.out.print("Choose the session number: ");
               int SNumber = input.nextInt();
               //
               if (SNumber <= PatientList.get(i).plan.sessions.length)
                   Therapist.MarkSessionEnd(PatientList.get(i).plan.sessions[SNumber]);
               else
                   System.out.println("there is no session with this number");
           }     
           else{
               System.out.println("this patient name dose not exist try again"); 
                break;}
        }
    }
    
    public static void updatePatientExercise(Scanner input , ArrayList<Patient> PatientList,ArrayList<Treatment_Plan> Treatment_Plan,Therapist TherapistUser){
        
        System.out.print("Enter patient's Name: ");
        String pname = input.next();
        
        for(int i =0;i<PatientList.size();i++){
            
           if(pname.equalsIgnoreCase(PatientList.get(i).getName())){
               
                System.out.println("Correct Patient name ");
               
                System.out.print("Choose the session number: ");
                int SNumber = input.nextInt();
                input.nextLine();
                
                if (SNumber <= PatientList.get(i).plan.sessions.length){  
                    
                    Exercise ex =PatientList.get(i).plan.getSession(SNumber).getSessionExercise();
                    
                    System.out.println("\nPateint "+pname+"\n\nSession "+SNumber+" exercise:\n"+ex.getContentOfEx());
                    System.out.println();
                    
                    System.out.println("Enter exercise update: ");
                    
                    
                    String update="";
                    while (input.hasNextLine()) {
                        String newLine=input.nextLine();
                        update = update +"\n"+newLine;
                        if (newLine.isEmpty())  break; }
         
                   
                   TherapistUser.updatePatientExercise(ex,update);
                
                }
            }     
            else{
               System.out.println("this patient name dose not exist try again"); 
                break;}
        }
    }

    private static void viewhomework(ArrayList<Patient> PatientList, String ptname, Scanner input, ArrayList<Treatment_Plan> Treatment_Planlist) {
    System.out.println("Enter Session number");
    int numSession = input.nextInt();
    System.out.println("Check for session Availability");
    String contnt;
    for (int i = 0; i < PatientList.size(); i++) {
        if (ptname.equalsIgnoreCase(PatientList.get(i).getName())) {
            if (PatientList.get(i).plan.getSession(numSession).getSessionExercise().getAvailability()) {
                contnt = PatientList.get(i).plan.getSession(numSession).getSessionExercise().getContentOfEx();
                System.out.println("\nPateint " + ptname + "\n\nSession " + numSession + " exercise:\n" + contnt);
                System.out.println();
            } else {
                System.out.println("Session not available for patient " + ptname);
            }
        }
    }
}
    

    private static void solveHomework(ArrayList<Patient> PatientList, String ptname, Scanner input, ArrayList<Treatment_Plan> Treatment_Planlist) {
    System.out.println("Enter Session number");
    int numSession = input.nextInt();

    Patient patient = null;
    for (Patient p : PatientList) {
        if (ptname.equalsIgnoreCase(p.getName())) {
            patient = p;
            break;
        }
    }

    if (patient != null) {
        if (numSession >= 0 && numSession < patient.plan.sessions.length) {
            Session session = patient.plan.getSession(numSession);
            if (session != null && session.getSessionExercise().getAvailability()) {
                String content = session.getSessionExercise().getContentOfEx();
                System.out.println("Answer the question of:" + content);
              
                String patientAnswer = input.nextLine(); 
                patientAnswer = input.nextLine(); 
                session.getSessionExercise().setAnswerOfEx(patientAnswer);
                System.out.println("Dr. Haifa received your answer successfully.");
            } else {
                System.out.println("Session not available for patient " + ptname);
            }
        } else {
            System.out.println("Invalid session number.");
        }
    } else {
        System.out.println("Patient not found.");
    }
}
    
    public static void AddComment(ArrayList<Patient> PatientList, Scanner input, ArrayList<Treatment_Plan> Treatment_Planlist){
        System.out.print("Enter patient's Name: ");
        String pname = input.next();
        String contentofComme;
        
        for(int i =0;i<PatientList.size();i++){
            
           if(pname.equalsIgnoreCase(PatientList.get(i).getName())){
               
                System.out.println("Correct Patient name ");
               
                System.out.print("Choose the session number: ");
                int SNumber = input.nextInt();
                input.nextLine();
                
                if (SNumber <= PatientList.get(i).plan.sessions.length){ //if there is a session with this number 
                    Exercise sessionEx = PatientList.get(i).plan.sessions[SNumber].getSessionExercise();
                    System.out.println("\nPateint " + pname + "\n\nSession " + SNumber + " exercise:\n" + sessionEx.getContentOfEx()+ " exercise Answer:\n" + sessionEx.getAnswerOfEx());
                    Therapist.AddComment(sessionEx,input);
                }
                else
                    System.out.print("Sorry... This session doesn't exist!");}}
    }
    
public static void ViewComments(ArrayList<Patient> PatientList, Scanner input) {
    System.out.print("Enter patient's Name: ");
    String pname = input.next();
    
    boolean foundPatient = false;
    
    for (Patient patient : PatientList) {
        if (pname.equalsIgnoreCase(patient.getName())) {
            foundPatient = true;
            System.out.println("Correct Patient name ");
            
            System.out.print("Choose the session number: ");
            int sessionNumber = input.nextInt();
            
            if (sessionNumber >= 0 && sessionNumber < patient.getPlan().sessions.length) {
                Session session = patient.getPlan().sessions[sessionNumber];
                
                Exercise sessionExercise = session.getSessionExercise();
                
                if (sessionExercise != null) {
                    ArrayList<String> comments = sessionExercise.getComments();
                    
                    if (comments != null && !comments.isEmpty()) {
                        System.out.println("Therapist's comments and opinions for session " + sessionNumber + ":");
                        for (String comment : comments) {
                            System.out.println(comment);
                        }
                    } else {
                        System.out.println("There are no comments about this session yet.");
                    }
                } else {
                    System.out.println("No exercise found for this session.");
                }
            } else {
                System.out.println("Invalid session number.");
            }
        }
    }
    
    if (!foundPatient) {
        System.out.println("Patient not found.");
    }
}
}
