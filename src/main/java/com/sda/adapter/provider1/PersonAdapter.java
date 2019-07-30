package com.sda.adapter.provider1;

import com.sda.adapter.ICommonUser;

import java.time.LocalDate;

public class PersonAdapter implements ICommonUser {
    private final Person person;

    public PersonAdapter(Person person) {
        this.person = person;
    }

    @Override
    public String getName() {
        return person.getName();
    }

    @Override
    public String getSurname() {
        return person.getSurname();
    }

    @Override
    public String getPesel() {
        return person.getPesel();
    }

    @Override
    public int getId() {
        return person.getId();
    }

    @Override
    public LocalDate getLocalDate() {
        return person.getBirthDate();
    }

    @Override
    public String toString() {
        return "adapter {" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", pesel='" +getPesel() + '\'' +
                ", birthDate=" + getLocalDate() + '}';
    }
}
