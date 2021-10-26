/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import java.util.ArrayList;
import java.util.Arrays;
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
public class StudentTest {
    
    private Student s;
    private Module m;
    private Course c;
    DateTime start = new DateTime(2019, 1, 1, 1, 1);
    DateTime end = new DateTime(2020, 1, 1, 1, 1);
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        s = new Student("ryan", 21, "12/2/2000");
        m = new Module("CT213");
        c = new Course("IT", start, end);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "ryan";
        String result = s.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAge method, of class Student.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        int expResult = 21;
        int result = s.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDOB method, of class Student.
     */
    @Test
    public void testGetDOB() {
        System.out.println("getDOB");
        String expResult = "12/2/2000";
        String result = s.getDOB();
        assertEquals(expResult, result);
    }

    /**
     * Test of getID method, of class Student.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        int expResult = 1;
        int result = s.getID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUsername method, of class Student.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        String expResult = "ryan21";
        String result = s.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of getModules method, of class Student.
     */
    @Test
    public void testGetModules() {
        System.out.println("getModules");
        ArrayList<Module> expResult = new ArrayList<>();
        expResult.add(m);
        s.addModule(m);
        ArrayList<Module> result = s.getModules();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCourses method, of class Student.
     */
    @Test
    public void testGetCourses() {
        System.out.println("getCourses");
        ArrayList<Course> expResult = new ArrayList<>();
        expResult.add(c);
        s.addCourse(c); 
        ArrayList<Course> result = s.getCourses();
        assertEquals(expResult, result);
    }

   
    /**
     * Test of addCourse method, of class Student.
     */
    @Test
    public void testAddCourse() {
        System.out.println("addCourse");
        s.addCourse(c);
    }

    /**
     * Test of addModule method, of class Student.
     */
    @Test
    public void testAddModule() {
        System.out.println("addModule");
        s.addModule(m);
    }

    /**
     * Test of removeModule method, of class Student.
     */
    @Test
    public void testRemoveModule() {
        System.out.println("removeModule");
        s.removeModule(m);
    }

    /**
     * Test of removeCourse method, of class Student.
     */
    @Test
    public void testRemoveCourse() {
        System.out.println("removeCourse");
        s.removeCourse(c);
    }

    /**
     * Test of listModules method, of class Student.
     */
    @Test
    public void testListModules() {
        System.out.println("listModules");
        s.listModules();
    }

    /**
     * Test of listCourses method, of class Student.
     */
    @Test
    public void testListCourses() {
        System.out.println("listCourses");
        s.listCourses();
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Name: ryan Age: 21 DOB: 12/2/2000 ID: 1 Username: ryan21";
        String result = s.toString();
        assertEquals(expResult, result);
      
    }
    
}
