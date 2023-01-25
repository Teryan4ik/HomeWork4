package phonebook;


import java.util.*;

public class PhoneBook extends Record {

    public static Map<String, List<String>> mapPhoneBook = new HashMap<String, List<String>>();


    public PhoneBook(String name, String phoneNumber) {
        super(name, phoneNumber);
        add(recordList);

    }
    public static void add(ArrayList<String> recordList) {
        int id = 0;
        for (String x : Record.recordList) {
            String s = String.valueOf(id);
            mapPhoneBook.put(s, Collections.singletonList(x));
            id++;
        }
        System.out.println(mapPhoneBook + "mapPhoneBook method");
    }
}

