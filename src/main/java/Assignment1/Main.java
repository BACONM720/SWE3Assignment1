/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import java.util.*;
import org.joda.time.*;

/**
 *
 * @author Ryan9
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DateTime start = new DateTime(2019, 1, 1, 1, 1);
        DateTime end = new DateTime(2020, 1, 1, 1, 1);
        

        Student s1 = new Student("jet", 21, "12/03/00");
        Student s2 = new Student("jared", 13, "19/08/01");

        Module m1 = new Module("CT415");
        Module m2 = new Module("SD678");

        Course c1 = new Course("Placebo MF", start, end);
        Course c2 = new Course("Computer Science", start, end);

        s1.addCourse(c1);
        s2.addCourse(c1);
        s2.addCourse(c2);
        c2.listStudents();
        
        s1.listCourses();
        s1.listModules();
    
    }

}
