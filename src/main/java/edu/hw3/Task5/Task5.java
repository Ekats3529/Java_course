package edu.hw3.Task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task5 {
    public List<Contact> parseContacts(List<String> input, String sortType) {
        if (input == null) {
            return Collections.emptyList();
        }

        List<Contact> contacts = new ArrayList<>(input.stream().map(Contact::new).toList());

        if (sortType.equals("ASC")) {
            Collections.sort(contacts);
        } else if (sortType.equals("DESC")) {
            contacts.sort(Collections.reverseOrder());
        }

        return contacts;
    }
}
