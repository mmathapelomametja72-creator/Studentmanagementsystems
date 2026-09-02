/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystems;

/**
 *
 * @author mmath
 */
public class Student {
            private String studentID;
            private String name;
            private int age;
            
            
            public Student(String studentID, String name, int age) {
                this.studentID = studentID;
                this.name = name;
                setAge(age);
            }
            
            public String getStudentID() { return studentID; }
            public void setStudentID(String studentID) { this.studentID = studentID; }
            public String getName() { return name; }
            public void setName(String name) { this.name = name; }
            public int getAge() { return age; }
            public void setAge(int age) {
                if (age >= 0) this.age = age;
                else System.out.println("Invalid age. Must be non-negative.");
 }
}

    

