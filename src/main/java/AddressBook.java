import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    Contact contact;

    public void add() {
        contact = new Contact();
        System.out.println("Enter first name: ");
        System.out.println("Enter last name: ");
        System.out.println("Enter address : ");
        System.out.println("Enter city : ");
        System.out.println("Enter state : ");
        System.out.println("Enter zip : ");
        System.out.println("Enter phonenumber : ");
        System.out.println("Enter email : ");

        System.out.println("Firstname : " + contact.getFirstName() + "\nLastname : " + contact.getLastName() + "\nAddress : " + contact.getAddress() + "\nCity : " + contact.getCity() + "\nState : " + contact.getState() + "\nZip : " + contact.getZip() + "\nPhonenumber : " + contact.getPhoneNumber() + "\nEmail : " + contact.getEmail());
        PrintStream file = null;
        try {
            file = new PrintStream("out.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setOut(file);
        System.out.println("Firstname : " + contact.getFirstName() + "\nLastname : " + contact.getLastName() + "\nAddress : " + contact.getAddress() + "\nCity : " + contact.getCity() + "\nState : " + contact.getState() + "\nZip : " + contact.getZip() + "\nPhonenumber : " + contact.getPhoneNumber() + "\nEmail : " + contact.getEmail());
    }
}