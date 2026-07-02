import java.util.Scanner;

class Student {

    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[100];
        int count = 0;
        int choice;

        do {

            System.out.println("\n=================================");
            System.out.println("   STUDENT MANAGEMENT SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student Marks: ");
                    double marks = sc.nextDouble();

                    students[count] = new Student(id, name, marks);
                    count++;

                    System.out.println("Student Added Successfully!");
                    break;

                case 2:

                    System.out.print("Enter Student ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (students[i].id == searchId) {

                            System.out.println("\nStudent Found");
                            System.out.println("ID    : " + students[i].id);
                            System.out.println("Name  : " + students[i].name);
                            System.out.println("Marks : " + students[i].marks);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found!");
                    }

                    break;

                case 3:

                    System.out.print("Enter Student ID to Remove: ");
                    int removeId = sc.nextInt();

                    boolean removed = false;

                    for (int i = 0; i < count; i++) {

                        if (students[i].id == removeId) {

                            for (int j = i; j < count - 1; j++) {
                                students[j] = students[j + 1];
                            }

                            students[count - 1] = null;
                            count--;

                            removed = true;

                            System.out.println("Student Removed Successfully!");
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Student Not Found!");
                    }

                    break;

                case 4:

                    if (count == 0) {

                        System.out.println("No Student Records Available!");
                    } else {

                        System.out.println("\n========== STUDENT DETAILS ==========");

                        for (int i = 0; i < count; i++) {

                            System.out.println("Student " + (i + 1));
                            System.out.println("ID    : " + students[i].id);
                            System.out.println("Name  : " + students[i].name);
                            System.out.println("Marks : " + students[i].marks);
                            System.out.println("--------------------------------");
                        }
                    }

                    break;

                case 5:

                    System.out.println("Thank You for Using Student Management System!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}