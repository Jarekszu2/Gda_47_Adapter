package com.sda.adapter.provider2;

import com.sda.adapter.ICommonUser;
import lombok.Data;

import java.time.LocalDate;
public class UserAdapter implements ICommonUser {
    private final User user;

    public UserAdapter(User user) {
        this.user = user;
    }

    @Override
    public String getName() {
        String nameSurname = user.getNameAndSurname();
        String[] tab = nameSurname.split(" ");
        String name = tab[0];
//        String surneme = tab[1];
        return name;
    }

    @Override
    public String getSurname() {
        String nameSurname = user.getNameAndSurname();
        String[] tab = nameSurname.split(" ");
//        String name = tab[0];
        String surneme = tab[1];
        return surneme;
    }

    @Override
    public String getPesel() {
        return user.getSocialIdentifier();
    }

    @Override
    public int getId() {
        return user.getIdentifier();
    }

    @Override
    public LocalDate getLocalDate() {
        return user.getBirthDate();
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
