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
public class Project251Test {
    
    public Project251Test() {
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
     * Test of main method, of class Project251.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Project251.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Patient method, of class Project251.
     */
    @Test
    public void testPatient() throws Exception {
        System.out.println("Patient");
        Scanner input = null;
        String Pname = "";
        Project251.Patient(input, Pname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TherapistLogIn method, of class Project251.
     */
    @Test
    public void testTherapistLogIn() {
        System.out.println("TherapistLogIn");
        Scanner input = null;
        Therapist expResult = null;
        Therapist result = Project251.TherapistLogIn(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PatientLogIn method, of class Project251.
     */
    @Test
    public void testPatientLogIn() {
        System.out.println("PatientLogIn");
        Scanner input = null;
        Patient expResult = null;
        Patient result = Project251.PatientLogIn(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of laodTreatmentPlanDB method, of class Project251.
     */
    @Test
    public void testLaodTreatmentPlanDB() throws Exception {
        System.out.println("laodTreatmentPlanDB");
        Project251.laodTreatmentPlanDB();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of savePatientInfoToFile method, of class Project251.
     */
    @Test
    public void testSavePatientInfoToFile() throws Exception {
        System.out.println("savePatientInfoToFile");
        String filename = "";
        Project251.savePatientInfoToFile(filename);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MarkSessionEnd method, of class Project251.
     */
    @Test
    public void testMarkSessionEnd() {
        System.out.println("MarkSessionEnd");
        Scanner input = null;
        ArrayList<Patient> PatientList = null;
        ArrayList<Treatment_Plan> Treatment_Plan = null;
        Project251.MarkSessionEnd(input, PatientList, Treatment_Plan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePatientExercise method, of class Project251.
     */
    @Test
    public void testUpdatePatientExercise() {
        System.out.println("updatePatientExercise");
        Scanner input = null;
        ArrayList<Patient> PatientList = null;
        ArrayList<Treatment_Plan> Treatment_Plan = null;
        Therapist TherapistUser = null;
        Project251.updatePatientExercise(input, PatientList, Treatment_Plan, TherapistUser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddComment method, of class Project251.
     */
    @Test
    public void testAddComment() {
        System.out.println("AddComment");
        ArrayList<Patient> PatientList = null;
        Scanner input = null;
        ArrayList<Treatment_Plan> Treatment_Planlist = null;
        Project251.AddComment(PatientList, input, Treatment_Planlist);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ViewComments method, of class Project251.
     */
    @Test
    public void testViewComments() {
        System.out.println("ViewComments");
        ArrayList<Patient> PatientList = null;
        Scanner input = null;
        Project251.ViewComments(PatientList, input);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
