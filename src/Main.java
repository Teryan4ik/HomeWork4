import phonebook.Record;
import phonebook.PhoneBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static phonebook.PhoneBook.mapPhoneBook;
import static phonebook.Record.recordList;


public class Main {
    public static int count;

    public static void main(String[] args) {
        Record record1 = new Record("A.S.","#1");
        PhoneBook record2 = new PhoneBook("A.S.","#2");
//        Record record3 = new Record("A.S.3","#3");
//        PhoneBook record4 = new PhoneBook("A.S.4","#4");
//        Record record5 = new Record("A.S.5","#5");
//        PhoneBook record6 = new PhoneBook("A.S.6","#6");
//        System.out.println(recordList+"recordList");
//        System.out.println(mapPhoneBook+"mapPhoneBook main");
//        System.out.println(recordList+"recordList final");
//        System.out.println(mapPhoneBook+"mapPhoneBook main final");
        String[] array = new String[]{"dog", "cat", "dog", "bird", "fox", "cat", "fox", "dog", "bird", "mouse"};
        List<String> arrayList = Arrays.asList(array);
        List<Integer> arrayList2 = new ArrayList<>(Arrays.asList(11, 5, 2, 1, 3, 4, 7, 1, 3, 0, 5, 2, 6, 1, 4, 7, 8, 9, 5, 6, 3, 4, 5, 6, 4, 7));

        countOccurance(arrayList);

        toList(array);

        findUnique(arrayList2);

        calcOccurance(arrayList);

        findOccurance(arrayList);

    }

    public static List<String> toList(String[] array) {
        List<String> spisok = Arrays.asList(array);
        return spisok;
    }

    public static void countOccurance(List<String> arrayList1) {
        count++;
    }

    public static List<Integer> findUnique(List<Integer> arrayList2) {
        List<Integer> nums = arrayList2;
        List<Integer> numsList = new ArrayList<>();
        for (Integer num : nums) {
            int count = 0;
            for (int n : nums) {
                if (num.equals(n))
                    count++;
            }
            if (count == 1)
                numsList.add(num);
        }
        return numsList;
    }

    public static List<String> calcOccurance(List<String> arrayList) {
        List<String> uniq = new ArrayList<>();
        List<String> repit = new ArrayList<>();
        for (String element : arrayList) {
            if (uniq.contains(element)) {
                repit.add(element);
            } else {
                Collections.frequency(arrayList, element);
                uniq.add(element);
                int count3 = Collections.frequency(arrayList, element);
                System.out.println(element + " " + count3 + "????");
            }
        }
        return uniq;
    }

    public static List<String> findOccurance(List<String> arrayList) {
        List<String> uniq = new ArrayList<>();
        List<String> repit = new ArrayList<>();
        for (String element : arrayList) {
            if (uniq.contains(element)) {
                repit.add(element);
            } else {
                Collections.frequency(arrayList, element);
                uniq.add(element);
                int count3 = Collections.frequency(arrayList, element);
                Animals ele = new Animals(element, count3);
                System.out.println(ele);
            }
        }
        return uniq;
    }


}