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
        if(students.contains(student)){
                System.out.println("Student is already enrolled to this module!");
       
    } 
        students.add(student);
    }

    public void addCourse(Course course) {
        if(courses.contains(course)){
                System.out.println("Module is already a part of this course!");
    } 
        courses.add(course);
    }
    
    public void removeStudent(Student s){
        if(!students.contains(s)){
                System.out.println("cant remove " + s.getName());
    } 
        students.remove(s);
    }
    
    public void removeCourse(Course c){
        if(!courses.contains(c)){
                System.out.println("cant remove " + c.getName());
    } 
        courses.remove(c);
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
