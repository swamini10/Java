package com.library.books;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("press 1 for issue book\n press 2 for studentOp");
        StudentOp stu = new StudentOp();
        Operations Op = new Operations();

        boolean start = true;
        Scanner sc = new Scanner(System.in);

        while (start) {
            try {
                System.out.println("\nEnter number:");
                int ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        Op.setBook();
                        break;
                    case 2:
                        Op.getBook();
                        break;
                    case 3:
                        stu.issueBook();
                        break;
                    case 4:
                        stu.SubmitBook();
                        break;
                    case 5:
                        System.out.println("Exiting program...");
                        start = false;
                        break;
                    default:
                        System.out.println("❌ Invalid choice, please try again!");
                }
            } catch (InputMismatchException e) {
                System.out.println("⚠️ Invalid input! Please enter a number.");
                sc.nextLine(); // clear invalid input
            } catch (Exception e) {
                System.out.println("⚠️ Unexpected error: " + e.getMessage());
            }
        }

        sc.close();
    }
}
