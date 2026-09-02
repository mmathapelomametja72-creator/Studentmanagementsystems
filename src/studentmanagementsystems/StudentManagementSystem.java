/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagementsystems;

import java.util.Scanner;
 
public class StudentManagementSystem {

   
    public static void main(String[] args) {
                StudentManager manager = new StudentManager();
                Scanner scanner = new Scanner(System.in);
                boolean running = true;
                
                
                while (running) {
                       System.out.println("\n==== Student Management System ====");
                       System.out.println("1. Add student");
                       System.out.println("2. Display all students");
                       System.out.println("3. Search student by ID");
                       System.out.println("4. Remove student by ID");
                       System.out.println("5. Update student details");
                       System.out.println("6. Exit");
                       System.out.print("Choose an option (1-6): ");
                       
                       
                       String input = scanner.nextLine();
                       
                       switch (input) {
                           case "1":
                                System.out.print("Enter Student ID: ");
                                String id = scanner.nextLine().trim();
                                System.out.print("Enter Name: ");
                                String name = scanner.nextLine().trim();
                                int age = -1;
                                while (age < 0) {
                                    System.out.print("Enter Age: ");
                                    try {
                                       age = Integer.parseInt(scanner.nextLine().trim());
                                       if (age < 0) System.out.println("Age cannot be negative.");
                                    } catch (NumberFormatException e) {
                                        System.out.println("Invalid age. Try again.");
                                    }      
                                    }
 
                                    manager.addStudent(new Student(id, name, age));
                                    break;
                                case "2": manager.displayAllStudents(); break;
                                case "3":
                                    System.out.print("Enter Student ID to search: ");
                                    Student found = manager.searchStudentByID(scanner.nextLine().trim());
                                    if (found != null){
                                        System.out.println("Found: " + found.getName() + " | Age: " + found.getAge());
                                    } else {
                                        System.out.println("Student not found.");
                                    }
                                        break;
                                case "4":
                                    System.out.print("Enter Student ID to remove: ");
                                    manager.removeStudentByID(scanner.nextLine().trim());
                                    break;
                                case "5":
                                    System.out.print("Enter Student ID to update: ");
                                    String updateId = scanner.nextLine().trim();
                                    Student st = manager.searchStudentByID(updateId);
                                    if (st != null) {
                                        System.out.print("New name (Enter to keep): ");
                                        String newName = scanner.nextLine().trim();
                                        if (newName.isEmpty()) newName = st.getName();
                                        int newAge = -1;
                                        while (newAge < 0) {
                                            System.out.print("New age (Enter to keep): ");
                                            String inputAge = scanner.nextLine().trim();
                                            if (inputAge.isEmpty()) { newAge = st.getAge(); break; }
                                            try {
                                                newAge = Integer.parseInt(inputAge);
                                                if (newAge < 0) System.out.println("Age cannot be negative.");
                                            } catch (NumberFormatException e) {
                                                System.out.println("Invalid age. Try again.");
                                            }
                                        }
                                        manager.updateStudent(updateId, newName, newAge);
                                    } else System.out.println("Student not found.");
                                    break;
                                case "6": running = false; break;
                                default: System.out.println("Invalid option.");
                            }
                        }
                        scanner.close();
    }
}

 


    

