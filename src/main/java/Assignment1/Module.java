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

public class Module {

    private String name;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public Module(String name) {
        this.name = name;
        courses = new ArrayList<>();
        students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void listStudents() {
        if(students.isEmpty()){
                System.out.println("List is Empty!!!");
        }
        else{
        students.forEach(s -> {
            System.out.println(s);
        });
        }
    }

    public void listCourses() {
        if(courses.isEmpty()){
                System.out.println("List is Empty!!!");
        }
        else{
        courses.forEach(c -> {
            System.out.println(c);
        });
        }
    }
    
    @Override
    public String toString(){
        return "Name: " +name;
    }

}
