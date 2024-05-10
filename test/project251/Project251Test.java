/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
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


 @Test
    public void testAddTreatmentPlan2() {
       System.out.println("AddTreatmentPlan2 Test");
       
        ArrayList<Patient> PatientList = new ArrayList<>();
       
        String inputString = "Raghad"; 
        InputStream inputStream = new ByteArrayInputStream(inputString.getBytes());
        Scanner input = new Scanner(inputStream);
      
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    
        Project251.AddTreatmentPlan2(input, PatientList);
        
        System.setOut(System.out);
    
        String expectedOutput = "Enter patient's Name: ";
        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    
    }
   
    @Test
    public void testAddTreatmentPlan2_NotNull() {
       
       System.out.println("AddTreatmentPlan2 Test");
       
        ArrayList<Patient> PatientList = new ArrayList<>();
       
        String inputString = "Raghad"; 
        InputStream inputStream = new ByteArrayInputStream(inputString.getBytes());
        Scanner input = new Scanner(inputStream);
      
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    
        Project251.AddTreatmentPlan2(input, PatientList);
        
        System.setOut(System.out);
    
        assertNotNull(outContent.toString().trim());
    }

   
    
    
}


   