package edu.hw3.Task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task5 {

    private static final Comparator<Contact> ASC = Comparator
        .comparing(Contact::getSurname)
        .thenComparing(Contact::getName);
    private static final Comparator<Contact> DESC = ASC.reversed();

    public List<Contact> parseContacts(List<String> input, String sortType) {
        if (input == null) {
            return Collections.emptyList();
        }

        List<Contact> contacts = new ArrayList<>(input.stream().map(Contact::new).toList());

        if (sortType.equals("ASC")) {
            contacts.sort(ASC);
        } else if (sortType.equals("DESC")) {
            contacts.sort(DESC);
        }

        return contacts;
    }
}
