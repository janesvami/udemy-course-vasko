package com.javacode.collections.egor.users;

import java.util.Objects;

public class User {

    private final String surname;
    private final int id;

    public User(String surname, int id) {
        this.surname = surname;
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + " User: " + surname;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode() {

        int result = 31;
        result = 31 * result + (surname == null ? 0 : surname.hashCode());
        result = 31 * result + id;

        return result;
    }

}
