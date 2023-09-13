import java.util.*;
public class Person {
    private String name;
    private String surname;
     List<PhoneNumberCategory> phoneNumberCategories = new ArrayList<>();
     List<String> phoneNumbers = new ArrayList<>();

     public Person(String name, String surname) {
         this.name = name;
         this.surname = surname;
     }
     public void addPhoneNumber(PhoneNumberCategory phoneNumberCategory, String phoneNumber) {
         this.phoneNumberCategories.add(phoneNumberCategory);
         this.phoneNumbers.add(phoneNumber);
     }

     public String getName() {
         return name;
     }
     public String getSurname() {
         return surname;
     }

    public boolean   findInNumbers(String phoneNumber) {
        return phoneNumbers.contains(phoneNumber);
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("First names : " + getName() + " \n");
        info.append("Last names : " + getSurname() + " \n");
        for (int i = 0; i < phoneNumberCategories.size(); i++) {
            info.append(phoneNumberCategories.get(i).name() + ": ")
                    .append(phoneNumbers.get(i) + " \n ")
                    .append("\n");
        }
        return info.toString();
    }
}
