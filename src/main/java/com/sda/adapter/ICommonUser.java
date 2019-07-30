package com.sda.adapter;

import lombok.Data;

import java.time.LocalDate;

public interface ICommonUser {
    String getName();
    String getSurname();
    String getPesel();
    int getId();
    LocalDate getLocalDate();


}
