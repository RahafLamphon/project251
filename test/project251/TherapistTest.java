/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

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
    @Test
    public void testAddPatient() {
        System.out.println("AddPatient");
        ArrayList PL = null;
        Patient PI = null;
        Therapist.AddPatient(PL, PI);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddCategory method, of class Therapist.
     */
    @Test
    public void testAddCategory() {
        
        
        Category PC =new Category();
        PC.setCatName(1);
        
        String name = "reeem";
        
        ArrayList<Patient> PatientList =new ArrayList<>(); 
        PatientList.add(new Patient(1234,"reem"));
        
        Therapist.AddCategory( PC, name, PatientList);
        
    }
    @Test
    public void testAddCategory_categoryNull() {
        
        
        Category PC =null;
        
        String name = "reeem";
        
        ArrayList<Patient> PatientList =new ArrayList<>(); 
        PatientList.add(new Patient(1234,"reem"));
        
        Therapist.AddCategory( PC, name, PatientList);
        
    }
    @Test
    public void testAddCategory_NameNUll() {
        
        
        Category PC =new Category();
        PC.setCatName(1);
        
        String name = null;
        
        ArrayList<Patient> PatientList =new ArrayList<>(); 
        PatientList.add(new Patient(1234,"reem"));
        
        Therapist.AddCategory( PC, name, PatientList);
        
    }
    @Test
    public void testAddCategory_PatientList() {
        
        
        Category PC =new Category();
        PC.setCatName(1);
        
        String name = null;
        
        ArrayList<Patient> PatientList =new ArrayList<>(); 
        
        
        Therapist.AddCategory( PC, name, PatientList);
        
    }
    /**
     * Test of MarkSessionEnd method, of class Therapist.
     */
    @Test
    public void testMarkSessionEnd() {
        System.out.println("MarkSessionEnd");
        Session session = null;
        Therapist.MarkSessionEnd(session);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePatientExercise method, of class Therapist.
     */
    @Test
    public void testUpdatePatientExercise() {
        System.out.println("updatePatientExercise");
        Exercise ex = null;
        String update = "";
        Therapist.updatePatientExercise(ex, update);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddComment method, of class Therapist.
     */
    @Test
    public void testAddComment() {
        System.out.println("AddComment");
        Exercise exercise = null;
        Scanner input = null;
        Therapist.AddComment(exercise, input);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
