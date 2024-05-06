/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package project251;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 96650
 */
public class ExerciseTest {
    
    public ExerciseTest() {
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
     * Test of getComments method, of class Exercise.
     */
    @Test
    public void testGetComments() {
        System.out.println("getComments");
        Exercise instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getComments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComment method, of class Exercise.
     */
    @Test
    public void testSetComment() {
        System.out.println("setComment");
        String comment = "";
        Exercise instance = null;
        instance.setComment(comment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentOfEx method, of class Exercise.
     */
    @Test
    public void testGetContentOfEx() {
        System.out.println("getContentOfEx");
        Exercise instance = null;
        String expResult = "";
        String result = instance.getContentOfEx();
        assertEquals(expResult, result);
    }

    /**
     * Test of setContentOfEx method, of class Exercise.
     */
    @Test
    public void testSetContentOfEx() {
        System.out.println("setContentOfEx");
        String ContentOfEx = "";
        Exercise instance = null;
        instance.setContentOfEx(ContentOfEx);
    }

    /**
     * Test of getAnswerOfEx method, of class Exercise.
     */
    @Test
    public void testGetAnswerOfEx() {
        System.out.println("getAnswerOfEx");
        Exercise instance = null;
        String expResult = "";
        String result = instance.getAnswerOfEx();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnswerOfEx method, of class Exercise.
     */
    @Test
    public void testSetAnswerOfEx() {
        System.out.println("setAnswerOfEx");
        String AnswerOfEx = "";
        Exercise instance = null;
        instance.setAnswerOfEx(AnswerOfEx);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAvailability method, of class Exercise.
     */
    @Test
    public void testGetAvailability() {
        System.out.println("getAvailability");
        Exercise instance = null;
        Boolean expResult = null;
        Boolean result = instance.getAvailability();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAvailability method, of class Exercise.
     */
    @Test
    public void testSetAvailability() {
        System.out.println("setAvailability");
        Boolean availability = null;
        Exercise instance = null;
        instance.setAvailability(availability);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
