package email_application;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;
    private int defaultPasswordLength = 8;
    private String mail;
    private String companySuffix = "anycompany.com";

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
        this.password = randomPassword(defaultPasswordLength);
        mail = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "."+companySuffix;
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
    private String randomPassword(int length) {
        String passwordSet = "QWERTYUIOPASDFGHJKLZXCVBNM!@#$%^&*()1234567890";
        char[] password = new char[length];
        for(int i=0;i<length;i++){
            int rand = (int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
}
