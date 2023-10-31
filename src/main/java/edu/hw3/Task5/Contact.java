package edu.hw3.Task5;

import java.util.Objects;

public class Contact {
    private String name;
    private String surname;

    public Contact(String fullName) {
        String[] parts = fullName.split(" ");
        if (parts.length == 1) {
            name = parts[0];
        } else if (parts.length == 2) {
            name = parts[0];
            surname = parts[1];
        } else {
            throw new IllegalArgumentException("Invalid input format");
        }
    }

    public Contact(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(surname, contact.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
