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
public class Course {

    private String name;
    private DateTime startDate;
    private DateTime endDate;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;

    public Course(String name, DateTime startDate, DateTime endDate) {
        this.name = name;
        this.endDate = endDate;
        this.startDate = startDate;
        modules = new ArrayList<>();
        students = new ArrayList<>();
       
    }

    public String getName() {
        return name;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }
    
     public ArrayList<Module> getModules() {
        return modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;

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

    public void addModule(Module module) {
        if(modules.contains(module)){
                System.out.println("Module is already a part of this course!");
       
    } 
        modules.add(module);
    }

    public void addStudent(Student student) {
        if(students.contains(student)){
                System.out.println("Student is already enrolled to this course!");
       
    } 
        students.add(student);
    }
    
    public void removeModule(Module m){
        if(!modules.contains(m)){
                System.out.println("cant remove " + m.getName());
    } 
        modules.remove(m);
    }

 public void removeStudent(Student s){
     if(!students.contains(s)){
                System.out.println("cant remove " + s.getName());
    } 
        students.remove(s);
    }
 
    @Override
    public String toString() {
        return "Name: " + name + " " +"Start Date: " + startDate +" " + " End Date: " + endDate;
    }
}
