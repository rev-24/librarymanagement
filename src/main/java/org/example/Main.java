package org.example;



import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    String authorName;
    String availabilityStatus;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        bookName = sc.nextLine();

        System.out.print("Enter Author Name: ");
        authorName = sc.nextLine();

        System.out.print("Enter Availability Status: ");
        availabilityStatus = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println("Availability Status: " + availabilityStatus);
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();

        b1.getDetails();
        b1.displayDetails();
    }
}


