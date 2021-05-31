import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your choice 1.Add Contact 2.Edit 3.Delete : ");
        int choice = Integer.valueOf(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println(" How many contact you want to add ");
                    int choice1 = Integer.valueOf(scanner.nextInt());
                    for (int contactNum = 0; contactNum < choice1; contactNum++) {
                        addressBook.add();
                    }
                case 2:
                    addressBook.edit();
                case 3:
                    addressBook.delete();
                case 4:
                    addressBook.search();
            }
    }
}
