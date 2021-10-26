/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import org.joda.time.DateTime;
import java.util.ArrayList;
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
public class ModuleTest {
    private Student s;
    private Module m;
    private Course c;
    DateTime start = new DateTime(2019, 1, 1, 1, 1);
    DateTime end = new DateTime(2020, 1, 1, 1, 1);
    
    public ModuleTest() {
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
     * Test of getName method, of class Module.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Module instance = m;
        String expResult = "CT213";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCourses method, of class Module.
     */
    @Test
    public void testGetCourses() {
        System.out.println("getCourses");
        Module instance = m;
        ArrayList<Course> expResult = new ArrayList<>();
        expResult.add(c);
        instance.addCourse(c);
        ArrayList<Course> result = instance.getCourses();
        assertEquals(expResult, result);

    }

    /**
     * Test of getStudents method, of class Module.
     */
    @Test
    public void testGetStudents() {
        System.out.println("getStudents");
        Module instance = m;
        ArrayList<Student> expResult = new ArrayList<>();
        expResult.add(s);
        instance.addStudent(s);
        ArrayList<Student> result = instance.getStudents();
        assertEquals(expResult, result);

    }

    /**
     * Test of addStudent method, of class Module.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student student = s;
        Module instance = m;
        instance.addStudent(student);
     
    }

    /**
     * Test of addCourse method, of class Module.
     */
    @Test
    public void testAddCourse() {
        System.out.println("addCourse");
        Course course = c;
        Module instance = m;
        instance.addCourse(course);
      
    }


    /**
     * Test of listStudents method, of class Module.
     */
    @Test
    public void testListStudents() {
        System.out.println("listStudents");
        Module instance = m;
        instance.listStudents();
 
    }

    /**
     * Test of listCourses method, of class Module.
     */
    @Test
    public void testListCourses() {
        System.out.println("listCourses");
        Module instance = m;
        instance.listCourses();
      
    }

    /**
     * Test of toString method, of class Module.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Module instance = m;
        String expResult = "Name: CT213" ;
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }
    
}
