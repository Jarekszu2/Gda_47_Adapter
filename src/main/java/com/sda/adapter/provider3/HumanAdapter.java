package com.sda.adapter.provider3;

import com.sda.adapter.ICommonUser;
import lombok.Data;

import java.time.LocalDate;

@Data

public class HumanAdapter implements ICommonUser {
    private final Human human;

    public HumanAdapter(Human human) {
        this.human = human;
    }

    @Override
    public String getName() {
        return human.getName();
    }

    @Override
    public String getSurname() {
        return human.getSurname();
    }

    @Override
    public String getPesel() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getId() {
        return human.getId();
    }

    @Override
    public LocalDate getLocalDate() {
        throw new UnsupportedOperationException();
    }


    @Override
    public String toString() {
        return "adapter {" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", pesel='unsupported" + '\'' +
                ", birthDate=unsupported" + '}';
    }
}
