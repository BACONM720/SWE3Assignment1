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
public class Student {

    private String name;
    private int age;
    private String dob;
    private int id = 0;
    private String username;
    private ArrayList<Module> modules;
    private ArrayList<Course> courses;

    public Student(String name, int age, String dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id += 1;
        username = getUsername();
        courses = new ArrayList<>();
        modules = new ArrayList<>();
     
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDOB() {
        return dob;
    }

    public int getID() {
        return id;
    }

    public final String getUsername() {
        return name + age;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDOB(String dob) {
        this.dob = dob;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;

    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void addModule(Module m) {
        modules.add(m);
    }
    
    public void removeModule(Module m){
        modules.remove(m);
    }
    public void removeCourse(Course c){
        courses.remove(c);
    }


    public void listModules() {
        if(modules.isEmpty()){
            System.out.println("List is Empty!!!");
        }
        else{
        modules.forEach(m -> {
            System.out.println(m);
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
    public String toString() {
        return "Name: " + name + " " + "Age: " + age +" " + "DOB: " + dob +" " + "ID: " + id +" " + "Username: " + username;
    }
}
