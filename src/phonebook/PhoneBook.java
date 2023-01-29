package phonebook;


import java.util.*;

public class PhoneBook {
    private static final Map<String, ArrayList<String>> mapPhoneBook = new HashMap<>();

    public static Map<String, ArrayList<String>> add(ArrayList<String> recordList) {
        if (mapPhoneBook.containsKey(recordList.get(0))) {
            mapPhoneBook.get(recordList.get(0)).add(recordList.get(1));
        } else {
            mapPhoneBook.put(recordList.get(0), new ArrayList<>());
            mapPhoneBook.get(recordList.get(0)).add(recordList.get(1));
        }
        recordList.clear();
        return mapPhoneBook;
    }

    public static ArrayList<String> find(String name) {
        if (mapPhoneBook.containsKey(name)) {
            System.out.println(name + " number:" + mapPhoneBook.get(name).get(0));
        } else {
            System.out.println("null");
        }
        return mapPhoneBook.get(name);
    }

    public static ArrayList<String> findAll(String name) {
        if (mapPhoneBook.containsKey(name)) {
            System.out.println(name + " numbers found:" + mapPhoneBook.get(name));
        } else {
            System.out.println("null");
        }
        return mapPhoneBook.get(name);
    }
}

