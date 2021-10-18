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
        modules.add(module);
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    
    public void removeModule(Module m){
        modules.remove(m);
    }

 public void removeStudent(Student s){
        students.remove(s);
    }
 
    @Override
    public String toString() {
        return "Name: " + name + " " +"Start Date: " + startDate +" " + " End Date: " + endDate;
    }
}
