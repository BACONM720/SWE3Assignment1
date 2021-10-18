/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ryan9
 */
public class CourseTest {
    
    public CourseTest() {
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
     * Test of getName method, of class Course.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Course instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartDate method, of class Course.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        Course instance = null;
        DateTime expResult = null;
        DateTime result = instance.getStartDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndDate method, of class Course.
     */
    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        Course instance = null;
        DateTime expResult = null;
        DateTime result = instance.getEndDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Course.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Course instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStartDate method, of class Course.
     */
    @Test
    public void testSetStartDate() {
        System.out.println("setStartDate");
        DateTime startDate = null;
        Course instance = null;
        instance.setStartDate(startDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndDate method, of class Course.
     */
    @Test
    public void testSetEndDate() {
        System.out.println("setEndDate");
        DateTime endDate = null;
        Course instance = null;
        instance.setEndDate(endDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listStudents method, of class Course.
     */
    @Test
    public void testListStudents() {
        System.out.println("listStudents");
        Course instance = null;
        instance.listStudents();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listModules method, of class Course.
     */
    @Test
    public void testListModules() {
        System.out.println("listModules");
        Course instance = null;
        instance.listModules();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addModule method, of class Course.
     */
    @Test
    public void testAddModule() {
        System.out.println("addModule");
        Module module = null;
        Course instance = null;
        instance.addModule(module);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addStudent method, of class Course.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student student = null;
        Course instance = null;
        instance.addStudent(student);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeModule method, of class Course.
     */
    @Test
    public void testRemoveModule() {
        System.out.println("removeModule");
        Module m = null;
        Course instance = null;
        instance.removeModule(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeStudent method, of class Course.
     */
    @Test
    public void testRemoveStudent() {
        System.out.println("removeStudent");
        Student s = null;
        Course instance = null;
        instance.removeStudent(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Course.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Course instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
