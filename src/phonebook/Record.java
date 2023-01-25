package phonebook;

import java.util.*;

public class Record {

    public String name;
    public String phoneNumber;
    public static ArrayList<String> recordList = new ArrayList<>();


    public Record(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        addRecord(name, phoneNumber);


    }

    public void addRecord(String name, String phoneNumber) {
//        recordList.add(0,name);
        recordList.add(this.name);
        recordList.add(this.phoneNumber);
    }
}
