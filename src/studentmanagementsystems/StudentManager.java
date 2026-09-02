/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystems;

import java.util.ArrayList;


public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    
    public void addStudent(Student student) {
        if (searchStudentByID(student.getStudentID()) != null) {
            System.out.println("Student with ID " + student.getStudentID() + " already exists."); return;
        }
        students.add(student);
        System.out.println("Student added successfully.");
    }
    
    
    public void displayAllStudents() {
        if (students.isEmpty()) System.out.println("No students found.");
        else {
            System.out.println("\n--- Student Records ---");
            for (Student s : students) {
                System.out.println("ID: " + s.getStudentID()
                        + " | Name: " + s.getName()
                        + " | Age: " + s.getAge());
            }
        }
    }
    
    
 public Student searchStudentByID(String id) {
 for (Student s : students) {
 if (s.getStudentID().equalsIgnoreCase(id)) return s;
 }
 return null;
    
    
}
 
 public boolean removeStudentByID(String id) {
 Student toRemove = searchStudentByID(id);
 if (toRemove != null) {
 students.remove(toRemove);
 System.out.println("Student removed successfully.");
 return true;
 }
 System.out.println("Student with ID " + id + " not found.");
 return false;
 }
 public boolean updateStudent(String id, String newName, int newAge) {
 Student toUpdate = searchStudentByID(id);
 if (toUpdate != null) {
 if (newName != null && !newName.isEmpty()) toUpdate.setName(newName);
 if (newAge >= 0) toUpdate.setAge(newAge);
 System.out.println("Student updated successfully.");
 return true;
 }
 System.out.println("Student with ID " + id + " not found.");
 return false;
 }
}

