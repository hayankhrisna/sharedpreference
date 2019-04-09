package com.hayankhrisna.sharedpreferences;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hayankhrisna.sharedpreferences.models.Note;
import com.hayankhrisna.sharedpreferences.models.User;

public class Data {

    private static List<User> users;
    private static List<Note> notes;

    static {
        users = new ArrayList<>();
        users.add(new User("adi", "rahasia"));
        users.add(new User("beni", "rahasia"));
        users.add(new User("cindy", "rahasia"));

        notes = new ArrayList<>();
        notes.add(new Note("Lorem Ipsum", new Date(), "Pada suatu hari hiduplah sepasang kekasih...."));
        notes.add(new Note("Lorem Ipsum", new Date(), "Pada suatu hari hiduplah sepasang kekasih...."));
        notes.add(new Note("Lorem Ipsum", new Date(), "Pada suatu hari hiduplah sepasang kekasih...."));
        notes.add(new Note("Lorem Ipsum", new Date(), "Pada suatu hari hiduplah sepasang kekasih...."));
        notes.add(new Note("Lorem Ipsum", new Date(), "Pada suatu hari hiduplah sepasang kekasih...."));
    }

    public static List<User> getUsers() {
        return users;
    }

    public static List<Note> getNotes() {
        return notes;
    }
}
