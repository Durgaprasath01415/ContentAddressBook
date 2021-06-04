import java.util.Collections;
import java.util.List;

public class Sort {
    public static void sortByName(List<Contact> person)
    {
        Collections.sort(person, Contact.firstNameSorting);
        for(Contact p: person)
        {
            System.out.println(p);
        }
    }
    public static void sortByCity(List<Contact> person)
    {
        Collections.sort(person, Contact.citySorting);
        for(Contact p: person)
        {
            System.out.println(p);
        }
    }
    public static void sortByState(List<Contact> person)
    {
        Collections.sort(person, Contact.stateSorting);
        for(Contact p: person)
        {
            System.out.println(p);
        }
    }
    public static void sortByZip(List<Contact> person)
    {
        Collections.sort(person, Contact.zipSorting);
        for(Contact p: person)
        {
            System.out.println(p);
        }
    }
}