package com.sda.adapter;

import com.sda.adapter.provider1.FileDataProvider;
import com.sda.adapter.provider1.Person;
import com.sda.adapter.provider1.PersonAdapter;
import com.sda.adapter.provider2.RandomDataProvider;
import com.sda.adapter.provider2.User;
import com.sda.adapter.provider2.UserAdapter;
import com.sda.adapter.provider3.Human;
import com.sda.adapter.provider3.HumanAdapter;
import com.sda.adapter.provider3.StaticDataProvider;

import java.util.ArrayList;
import java.util.List;

public class PeopleRegistry {
    private List<ICommonUser> commonUsers = new ArrayList<>();

    public PeopleRegistry() {
        // załaduj użytkowników z każdego kolejnego providera do commonUsers.
        FileDataProvider fileDataProvider = new FileDataProvider();
        List<Person> list = fileDataProvider.getPeopleList();
        for (int i = 0; i < list.size(); i++) {
            commonUsers.add(new PersonAdapter(list.get(i)));
        }

        RandomDataProvider randomDataProvider = new RandomDataProvider();
        List<User> userList = randomDataProvider.getSystemUsersList();
        for (int i = 0; i < userList.size(); i++) {
            commonUsers.add(new UserAdapter(userList.get(i)));
        }

        StaticDataProvider staticDataProvider = new StaticDataProvider();
        List<Human> humanList = staticDataProvider.getHumanList();
        for (int i = 0; i < humanList.size(); i++) {
            commonUsers.add(new HumanAdapter(humanList.get(i)));
        }
    }

    public List<ICommonUser> getCommonUsers() {
        return commonUsers;
    }
// TODO: pobierz wszystkich ludzi ze wszystkich systemów w jednakowym formacie.
}
