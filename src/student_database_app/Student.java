package student_database_app;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1001;

    //Constructor : student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter Student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Senior\n4 - Senior\nEnter student class level");
        this.gradeYear = in.nextInt();
        setStudentID();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);


    }
    //Generate Id
    private void setStudentID() {
        //Grade level + ID
        this.studentID = gradeYear + "" + id;
        id++;
    }
    //Enroll Course
    public void enroll(){
        do {
            System.out.print("Enter course to enroll (Q to quit)");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if (!(course.equals("Q") || course.equals("q"))) {
                courses += ("\n" + course);
                tuitionBalance += costOfCourse;
            }
            else break;
        }while (true);
        System.out.println("Enrolled in : " + courses);
    }
    //View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }
    //Pay tuition
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner sc = new Scanner(System.in);
        int payment = sc.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    //Show status
    public String showInfo(){
        return "Name : " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled :" + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
