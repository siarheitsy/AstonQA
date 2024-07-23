import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {

    private HashMap<String, ArrayList<String>> abonentMap;

    Phonebook() {
        this.abonentMap = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        this.abonentMap.computeIfAbsent(surname, s -> new ArrayList<>()).add(phoneNumber);
    }

    public ArrayList<String> get(String surname) {
        return this.abonentMap.getOrDefault(surname, null);
    }

    public void printAll() {
        this.abonentMap.forEach((k, v) -> System.out.println("\nФамилия: " + k + "\nНомера телефонов:\n" + this.get(k)));
    }

}
