package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone phone = new CellPhone();

        Scanner scanner = new Scanner(System.in);

        //get user info and set values
        System.out.println("What is the serial number? ");
        phone.setSerialNumber(Integer.parseInt(scanner.nextLine()));

        System.out.println("What model is the phone? ");
        phone.setPhoneNumber(scanner.nextLine());

        System.out.println("Who is the carrier? ");
        phone.setModel(scanner.nextLine());

        System.out.println("What is the phone number? ");
        phone.setPhoneNumber(scanner.nextLine());

        System.out.println("Who is the owner of the phone");
        phone.setOwner(scanner.nextLine());


        System.out.println("Serial number: " + phone.getSerialNumber());
        System.out.println("Phone model: " + phone.getModel());
        System.out.println("Phone carrier: " + phone.getPhoneNumber());
        System.out.println("Phone owner: " + phone.getOwner());

        scanner.close();
    }
}
