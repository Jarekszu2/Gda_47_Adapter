package com.sda.adapter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        PeopleRegistry peopleRegistry = new PeopleRegistry();
        List<ICommonUser> iCommonUserList = peopleRegistry.getCommonUsers();
        iCommonUserList.stream()
                .forEach(System.out::println);
    }
}
