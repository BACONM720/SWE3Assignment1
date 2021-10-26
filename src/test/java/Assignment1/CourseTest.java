/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import java.util.ArrayList;
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
    private Student s;
    private Module m;
    private Course c;
    DateTime start = new DateTime(2019, 1, 1, 1, 1);
    DateTime end = new DateTime(2020, 1, 1, 1, 1);
    
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
        s = new Student("ryan", 21, "12/2/2000");
        m = new Module("CT213");
        c = new Course("IT", start, end);
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
        Course instance = c;
        String expResult = "IT";
        String result = instance.getName();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of getStartDate method, of class Course.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        Course instance = c;
        DateTime expResult = start;
        DateTime result = instance.getStartDate();
        assertEquals(expResult, result);

    }

    /**
     * Test of getEndDate method, of class Course.
     */
    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        Course instance = c;
        DateTime expResult = end;
        DateTime result = instance.getEndDate();
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
        c.addModule(m);
        ArrayList<Module> result = c.getModules();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCourses method, of class Student.
     */
    @Test
    public void testGetStudents() {
        System.out.println("getStudents");
        ArrayList<Student> expResult = new ArrayList<>();
        expResult.add(s);
        c.addStudent(s); 
        ArrayList<Student> result = c.getStudents();
        assertEquals(expResult, result);
    }


    /**
     * Test of listStudents method, of class Course.
     */
    @Test
    public void testListStudents() {
        System.out.println("listStudents");
        Course instance = c;
        instance.listStudents();
    }

    /**
     * Test of listModules method, of class Course.
     */
    @Test
    public void testListModules() {
        System.out.println("listModules");
        Course instance = c;
        instance.listModules();
    }

    /**
     * Test of addModule method, of class Course.
     */
    @Test
    public void testAddModule() {
        System.out.println("addModule");
        Module module = m;
        Course instance = c;
        instance.addModule(module);
    }

    /**
     * Test of addStudent method, of class Course.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student student = s;
        Course instance = c;
        instance.addStudent(student);

    }

    /**
     * Test of removeModule method, of class Course.
     */
    @Test
    public void testRemoveModule() {
        System.out.println("removeModule");
        Module module = m;
        Course instance = c;
        instance.removeModule(module);
      
    }

    /**
     * Test of removeStudent method, of class Course.
     */
    @Test
    public void testRemoveStudent() {
        System.out.println("removeStudent");
        Student student = s;
        Course instance = c;
        instance.removeStudent(student);
    }

    /**
     * Test of toString method, of class Course.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Course instance = c;
        String expResult = "Name: " + c.getName() + " " +"Start Date: " + c.getStartDate() +" " + " End Date: " + c.getEndDate();
        String result = instance.toString();
        assertEquals(expResult, result);
    
    }
     
}
