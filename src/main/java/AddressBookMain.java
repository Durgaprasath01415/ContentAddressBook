import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBook addressBook = new AddressBook();
        Sort sort = new Sort();
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i == 0){
            System.out.println(" Enter your choice 1.Add Contact 2.Edit 3.Delete 4.Search 5.sort 6.exit : ");
            int choice = Integer.valueOf(scanner.nextLine());
            switch (choice) {
                case 1:
                    addressBook.add();
                    break;
                case 2:
                    addressBook.edit();
                    break;
                case 3:
                    addressBook.delete();
                    break;
                case 4:
                    addressBook.search();
                    break;
                case 5:
                    addressBook.sort();
                    break;
                case 6:
                    i =-1;
                    break;
            }
        }
    }
}
