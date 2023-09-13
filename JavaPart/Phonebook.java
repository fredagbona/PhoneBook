import java.io.*;
import java.util.*;
public class Phonebook {
    private static Phonebook phonebook;
    private final List<Person> phonebookList = new ArrayList<>();

    public static Phonebook getPhonebook() throws Exception {
        if (phonebook == null) {
            phonebook = new Phonebook();
        }
        return phonebook;
    }

    private Phonebook() throws Exception {
        File file = new File("data.txt");
        Scanner scanner = new Scanner(new FileInputStream(file));

        StringBuilder forName = new StringBuilder();
        StringBuilder forSurname = new StringBuilder();
        StringBuilder forNumber = new StringBuilder();
        PhoneNumberCategory forType;
        StringBuilder temp = new StringBuilder();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.contains("First name")) {
                forName.append(line.substring(line.indexOf(":") + 1).trim());
            } else if (line.contains("Last name")) {
                forSurname.append(line.substring(line.indexOf(":") + 1).trim());
                phonebookList.add(new Person(forName.toString(), forSurname.toString()));
            } else if (line.contains("OFFICE")) {
                forType = PhoneNumberCategory.getMobileNumberCategory("OFFICE");
                forNumber.append(line.substring(line.indexOf(":") + 1).trim());
                phonebookList.get(phonebookList.size() - 1).addPhoneNumber(forType, forNumber.toString());
            } else if (line.contains("MOBILE")) {
                forType = PhoneNumberCategory.getMobileNumberCategory("MOBILE");
                forNumber.append(line.substring(line.indexOf(":") + 1).trim());
                phonebookList.get(phonebookList.size() - 1).addPhoneNumber(forType, forNumber.toString());
            } else if (line.contains("HOME")) {
                forType = PhoneNumberCategory.getMobileNumberCategory("HOME");
                forNumber.append(line.substring(line.indexOf(":") + 1).trim());
                phonebookList.get(phonebookList.size() - 1).addPhoneNumber(forType, forNumber.toString());
            } else if (line.contains("---")) {
                forName.setLength(0);
                forSurname.setLength(0);
                forNumber.setLength(0);
            } else {
                temp.append(line);
            }
        }

        scanner.close();
    }

  
    public List<Person> searchByName(String name) {
        List<Person> results = new ArrayList<>();

        for (Person person : phonebookList) {
            if (person.getName().startsWith(name) || person.getSurname().startsWith(name)) {
                results.add(person);
            }
        }
        if(results.isEmpty()){
            return null;
        }else {
            return results;
        }

    }

    public Person findByPhoneNumber(String phoneNumber) {
        for (Person person : phonebookList) {
            if (person.findInNumbers(phoneNumber)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        List<String> personStrings = new ArrayList<>();
        for (Person person : phonebookList) {
            personStrings.add(person.toString());
        }
        return String.join("\n---\n", personStrings);
    }
}
