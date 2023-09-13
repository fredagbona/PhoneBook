import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Phonebook myBook = Phonebook.getPhonebook();
        System.out.println("*** Phonebook Search Application ***");
        System.out.println(myBook.toString());
        Scanner scanner = new Scanner(System.in);
      
        while (true) {
            System.out.println("Choose your action: ");
            System.out.println("1. Find by name");
            System.out.println("2. Find by phone number");
            System.out.println("Any other key. Exit");
            int choice = scanner.nextInt();
            if(choice < 1 || choice > 2) {
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter name");
                    String name = scanner.next();
                    if(IsNameValid(name)){
                        List<Person> searchResults = myBook.searchByName(name);
                        if (searchResults == null) {
                            System.out.println("Record Not Found");

                        } else {
                            System.out.println("Record(s) Found: ");
                            for (Person person : searchResults) {
                                System.out.println(person);
                            }

                        }
                    }else{
                        System.out.println("Invalid name ! Use letters only ");
                    }

                    break;
                case 2:
                    System.out.println("Enter the phone number");
                    String phoneNumber = scanner.next();
                        Person person2 = myBook.findByPhoneNumber(phoneNumber);
                        if (person2 == null) {
                            System.out.println("Record Not Found");

                        } else {
                            System.out.println("Record Found: ");
                            System.out.println(person2);
                        }

                    break;
                default:
                    System.out.println("Exit");
                    break;
            }
        }
        scanner.close();

    }
    public static boolean IsNameValid(String name){
        return name.matches("[a-zA-Z]+");
    }
    /*
    public static boolean IsPhoneNumberValid(String phoneNumber){
        return phoneNumber.matches("[0-9\\s]+");
    }

     */

}