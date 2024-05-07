/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SHROOQAS
 */
public class TherapistTest {
     
    public TherapistTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {

    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of AddPatient method, of class Therapist.
     */
   
    /**
     * Test of AddCategory method, of class Therapist.
     */
    @Test
    
    public void testAddCategory() {
    
         // data
        Category PC = new Category();
        PC.setCatName(1);
    
        String name = "reem";
    
        ArrayList<Patient> PatientList = new ArrayList<>();
        PatientList.add(new Patient(1234, "reem"));
    
        // ByteArrayOutputStream
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // AddCategory() method
        Therapist.AddCategory(PC, name, PatientList);

   
        String expectedResult = "Category was add successfully";
        assertEquals(expectedResult, out.toString().trim());
    }
    @Test
    public void testAddCategory_categoryNull() {
   
         // data
        Category PC = null;
        
        String name = "reem";
    
        ArrayList<Patient> PatientList = new ArrayList<>();
        PatientList.add(new Patient(1234, "reem"));
    
        // ByteArrayOutputStream
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // AddCategory() method
        Therapist.AddCategory(PC, name, PatientList);

   
        String expectedResult = "error: Category = null";
        assertEquals(expectedResult, out.toString().trim());
    }
    @Test
    public void testAddCategory_NameNull() {
        
         // data
        Category PC = new Category();
        PC.setCatName(1);
        
        String name = null;
    
        ArrayList<Patient> PatientList = new ArrayList<>();
        PatientList.add(new Patient(1234, "reem"));
    
        // ByteArrayOutputStream
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // AddCategory() method
        Therapist.AddCategory(PC, name, PatientList);

   
        String expectedResult = "error: name = null";
        assertEquals(expectedResult, out.toString().trim());     
    }
    @Test
    public void testAddCategory_PatientNotFound() {
        
          // data
        Category PC = new Category();
        PC.setCatName(1);
        
        String name = "reem";
    
        ArrayList<Patient> PatientList = new ArrayList<>();
        
    
        // ByteArrayOutputStream
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // AddCategory() method
        Therapist.AddCategory(PC, name, PatientList);

   
        String expectedResult = "this patient not exit in the system";
        assertEquals(expectedResult, out.toString().trim());
    }
    /**
     * Test of MarkSessionEnd method, of class Therapist.
     */
    @Test
    public void testMarkSessionEnd() {
        System.out.println("MarkSessionEnd");
        Session session = null;
        Therapist.MarkSessionEnd(session);
        
    }

    /**
     * Test of updatePatientExercise method, of class Therapist.
     */
   

    /**
     * Test of AddComment method, of class Therapist.
     */
    @Test
    public void testAddCommentisnull(){
        System.out.println("AddComment");
        Exercise exercise = new  Exercise("") ;
        Scanner input = null;
        Therapist.AddComment(exercise, input);
        assertNull(input);
       
    }
        @Test
     public void testAddCommentisNotnull(){
        System.out.println("AddComment Not NUll");
        Exercise exercise = new  Exercise("") ;
        Scanner input =new Scanner(System.in);
        Therapist.AddComment(exercise, input);
        assertNotNull(input);
       
    }
      

    
     @Test
    public void testUpdatePatientExercise() { // make sure that the content is saved:
        System.out.println("updatePatientExercise");
        Exercise ex = new Exercise("");
        String update = "Q1. How are feeling lately?";
        Therapist.updatePatientExercise(ex, update);
        assertEquals(update, ex.ContentOfEx);
    }
    
    @Test
    public void testUpdatePatientExerciseNotNull() { // make sure that the update is not null:
        System.out.println("updatePatientExercise");
        Exercise ex = new Exercise("");
        String update = "Q1. How are feeling lately?";
        Therapist.updatePatientExercise(ex, update);
        assertNotNull(update);
    }
    
    @Test 
    public void testUpdatePatientExerciseNull() { // what if the update was null? :
        System.out.println("updatePatientExercise");
        Exercise ex = new Exercise("");
        String update = null;
        Therapist.updatePatientExercise(ex, update);
        assertNull(update);
    }

    
}
