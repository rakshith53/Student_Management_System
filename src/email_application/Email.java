package email_application;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
    }

    private String setDepartment() {
        String result;
        System.out.println("Department Codes\n1. Sales\n2.Development\n3. Accounting\n4. None\nEnter department code: ");
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();
        if (depChoice == 1) {
            result = "sales";
        } else if (depChoice == 2) {
            result = "dev";
        } else if (depChoice == 3) {
            result = "acct";
        } else {
            result = "";
        }
        return result;
    }
}
