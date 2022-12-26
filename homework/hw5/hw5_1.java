// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package homework.hw5;

import java.util.*;

public class hw5_1 {
    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<String, String>();
 
        phonebook.put("8800555535", "Igor");
        phonebook.put("8800564634", "Ivan");
        phonebook.put("8800432536", "Maria");
        phonebook.put("8800555545", "Igor");
        phonebook.put("8800685645", "Ekaterina");
        
        Set<String> phoneNumbers = phonebook.keySet();
 
        for (String phoneNumber : phoneNumbers) {
            String name = phonebook.get(phoneNumber);
            
            System.out.println("Phone Number: " + phoneNumber + " ==> Name: " + name);
        }
    }
}
